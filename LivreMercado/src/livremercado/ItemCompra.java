package livremercado;

/**
 *
 * @author gabriel-herrera
 */
class ItemCompra {
    
    private Produto produto;
    private int quantidade;
    private Vendedor vendedor;
    
    public ItemCompra (Produto produto, Vendedor vendedor, int quantidade) {
        this.produto = produto;
        this.vendedor = vendedor;
        this.quantidade = quantidade;
    }
    
    public Produto getProduto() {
        return produto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public Vendedor getVendedor() {
        return vendedor;
    }
    
}
