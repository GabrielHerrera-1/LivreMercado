package livremercado;

import java.util.ArrayList;

/**
 *
 * @author gabriel-herrera
 */
class Categoria {

    private String nome;
    private ArrayList<Produto> produtos;
    private ArrayList<Categoria> subcategorias;

    public Categoria(String nome) {
        this.nome = nome;
        produtos = new ArrayList<>();
        subcategorias = new ArrayList<>();
    }

    /**
     * Adiciona um produto à categoria, garantindo que sua categoria esteja
     * sempre atualizada.
     * <p>
     * Este método verifica se o produto já está na lista de produtos da
     * categoria. Se não estiver, ele é adicionado à lista. Em seguida, o método
     * atualiza a categoria do produto para a categoria atual, removendo-o de
     * qualquer categoria anterior, se necessário. Isso assegura que o produto
     * mantenha a associação correta com sua nova categoria, mesmo que já
     * estivesse presente na lista.
     * </p>
     *
     * @param produto O produto a ser adicionado à categoria.
     */
    public void adicioneProduto(Produto produto) {
        if (!produtos.contains(produto)) {
            produtos.add(produto);

            if (!produto.getCategoria().equals(this)) {
                produto.getCategoria().produtos.remove(produto);
                produto.setCategoria(this);
            }
        }
    }

    public void adicioneSubCategoria(Categoria subcategoria) {
        if (!subcategorias.contains(subcategoria)) {
            subcategorias.add(subcategoria);
        }
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public ArrayList<Categoria> getSubcategorias() {
        return subcategorias;
    }

    /**
     * Remove uma categoria do sistema, permitindo a opção de remoção permanente
     * ou temporária.
     * <p>
     * Este método permite que uma categoria seja removida de maneira permanente
     * ou que sua remoção seja temporária. Na remoção temporária, a subcategoria
     * é removida e nada mais precisa ser feito feito.
     *
     * Se a remoção for permanente, a categoria é excluída de forma definitiva.
     * Nesse caso, todos os produtos que eram da categoria removida passam a ser
     * da categoria à qual ela pertencia. Além disso, na remoção permanente,
     * todas as subcategorias daquela que foi removida passam a ser
     * subcategorias da categoria à qual ela pertencia. O método garante que as
     * referências a produtos ou subcategorias relacionadas sejam movidos
     * adequadamente durante o processo de remoção.
     * </p>
     *
     * @param categoria A categoria a ser removida.
     * @param permanente Indica se a remoção deve ser permanente (true) ou
     * temporária (false).
     *
     * @throws IllegalArgumentException Se a categoria não existir no sistema.
     */
    public void removaSubcategoria(Categoria subcategoria, boolean permanente) throws IllegalArgumentException {

//         if (!subcategorias.contains(subcategoria)) {
//            throw new IllegalArgumentException("Categoria não encontrada.");
//        }

        if (permanente) {
            // transferir os produtos da subcategoria removida para a categoria pai (this)
            for (Produto produto : subcategoria.getProdutos()) {
                this.adicioneProduto(produto);
            }

            // transferir as subcategorias da subcategoria removida para a categoria pai (this)
            for (Categoria subSubCategoria : subcategoria.getSubcategorias()) {
                this.adicioneSubCategoria(subSubCategoria);
            }
        }

        // remove a subcategoria da lista de subcategorias (temporária ou permanentemente)
        subcategorias.remove(subcategoria);
    }

}
