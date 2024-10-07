package livremercado;

/**
 *
 * @author gabriel-herrera
 */
class ItemEstoque {
    
    private Produto produto;
    private int quantidade;
    
    public ItemEstoque (Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public void adicioneQuantidade (int quantidade) {
        this.quantidade += quantidade;
    }
    
    public void removaQuantidade (int quantidade) throws IllegalArgumentException {
        if (this.quantidade < quantidade) {
            throw new IllegalArgumentException("Quantidade requerida superior ao estoque.");
        } 
        this.quantidade -= quantidade;
    }
    
    public void setQuantidade (int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }   

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
}
