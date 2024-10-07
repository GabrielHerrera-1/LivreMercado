package livremercado;

import java.util.ArrayList;

/**
 *
 * @author gabriel-herrera
 */
class Carrinho {

    private ArrayList<ItemCompra> itens;

    public Carrinho() {
        itens = new ArrayList<>();
    }

    /**
     * Adiciona um item à lista de compras, verificando a disponibilidade em
     * estoque do vendedor.
     * <p>
     * Este método realiza a verificação da quantidade disponível do produto no
     * estoque do vendedor antes de adicioná-lo à compra. Se o produto já
     * estiver presente na lista de itens, a quantidade é atualizada, desde que
     * a quantidade total não exceda a disponível em estoque. Se o produto não
     * estiver na lista, ele é adicionado somente se houver quantidade
     * suficiente disponível.
     * <p>
     * <p>
     * O método pode lançar uma exceção {@link IllegalArgumentException} nas
     * seguintes situações:
     * <ul>
     * <li>Se a quantidade solicitada exceder a quantidade disponível em
     * estoque.</li>
     * <li>Se a quantidade total (já existente no carrinho mais a nova)
     * ultrapassar a quantidade em estoque.</li>
     * </ul>
     *
     * @param produto O produto que se deseja adicionar à compra.
     * @param vendedor O vendedor do qual o produto está sendo adquirido.
     * @param quantidade A quantidade do produto a ser adicionada à compra.
     */
    public void adicioneItem(Produto produto, Vendedor vendedor, int quantidade) throws IllegalArgumentException {

        boolean noCarrinho = false;

        for (ItemCompra item : itens) {

            if (item.getProduto().equals(produto)) { //verifica se o itemCompra já está no carrinho
                noCarrinho = true;

                if (item.getQuantidade() + quantidade > vendedor.getEstoque().quantidadeEmEstoque(produto)) {
                    throw new IllegalArgumentException("Montante do carrinho supera quantidade em estoque");
                } 
                break;
            }
        }

        if (!noCarrinho) {
            if (quantidade > vendedor.getEstoque().quantidadeEmEstoque(produto)) {
                throw new IllegalArgumentException("Produto não pode ser adicionado: Quantidade indisponível.");
            }
            itens.add(new ItemCompra(produto, vendedor, quantidade));
        }

    }

    public ArrayList<ItemCompra> getItens() {
        return itens;
    }

}
