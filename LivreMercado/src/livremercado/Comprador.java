package livremercado;

/**
 *
 * @author gabriel-herrera
 */
public class Comprador extends Pessoa {
    
    private Carrinho carrinho;
    
    public Comprador (String nome) {
        super(nome);
        carrinho = new Carrinho();
    }
    
    public void adicioneItem (Produto produto, Vendedor vendedor, int quantidade) {
        //TODO
    }
    
    public Carrinho getCarrinho(){
        return carrinho;
    }
    
}
