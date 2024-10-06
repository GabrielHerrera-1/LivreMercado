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
    
    public ArrayList<ItemCompra> getItens() {
        return itens;
    }
    
}
