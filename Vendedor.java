package livremercado;

/**
 *
 * @author gabriel-herrera
 */
class Vendedor extends Pessoa {
    
    private Estoque estoque;
    
    public Vendedor(String nome) {
        super(nome);
    }
    
    public void adicioneProdutoAoEstoque (Produto produto, int quantidade) {
        estoque.adicioneItem(produto, quantidade);
    }
    
    public Estoque getEstoque() {
        return estoque;
    }
    
}