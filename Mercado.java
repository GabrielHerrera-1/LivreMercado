package livremercado;

import java.util.ArrayList;

/**
 *
 * @author gabriel-herrera
 */
public class Mercado {
    
    private ArrayList<Categoria> categorias;
    private ArrayList<Comprador> compradores;
    private ArrayList<Vendedor> vendedores;
    
    public Mercado () {
        categorias = new ArrayList<>();
        compradores = new ArrayList<>();
        vendedores = new ArrayList<>();
    }

    public void adicioneCategoria (Categoria categoria) {
        if (!categorias.contains(categoria)) {
            categorias.add(categoria);
        }
    }
    
    public void adicioneComprador (Comprador comprador) {
        if (!compradores.contains(comprador)) {
            compradores.add(comprador);
        }
    }
    
    public void adicioneVendedor (Vendedor vendedor) {
         if (!vendedores.contains(vendedor)) {
            vendedores.add(vendedor);
        }
    }
    
    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public ArrayList<Comprador> getCompradores() {
        return compradores;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }
}
