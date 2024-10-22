package livremercado;

/**
 *
 * @author gabriel-herrera
 */
public class LivreMercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Categoria cat1 = new Categoria("categoria 1");
        Categoria cat2 = new Categoria("categoria 2");
        Categoria cat3 = new Categoria("categoria 3");
        Categoria cat4 = new Categoria("categoria 4");
        
        cat1.adicioneSubCategoria(cat3);
        cat3.adicioneSubCategoria(cat4);
        cat3.adicioneSubCategoria(cat2);
        
        Produto prod1 = new Produto("Produto 1", "2", "3",2, cat1);
        Produto prod2 = new Produto("Produto 2", "2", "3",2, cat2);
        Produto prod3 = new Produto("Produto 3", "2", "3",2, cat3);
        Produto prod4 = new Produto("Produto 4", "2", "3",2, cat4);
        
        cat1.adicioneProduto(prod1);
        cat2.adicioneProduto(prod2);
        cat3.adicioneProduto(prod3);
        cat4.adicioneProduto(prod4);
        
        System.out.println("categoria 1 produtos:");
        cat1.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        
        System.out.println("categoria 2 produtos:");
        cat2.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        
        System.out.println("categoria 3 produtos:");
        cat3.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        
        System.out.println("categoria 4 produtos:");
        cat4.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        
        System.out.println("Subcategorias de cada categoria:");
        
        System.out.println("categoria 1 subcategorias:");
        cat1.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        System.out.println("categoria 2 subcategorias:");
        cat2.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        System.out.println("categoria 3 subcategorias:");
        cat3.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        System.out.println("categoria 4 subcategorias:");
        cat4.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        
        cat1.removaSubcategoria(cat3, true);
        System.out.println("Removendo subcategoria 3 da 1...");
        
        System.out.println("categoria 3 produtos:");
        cat3.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        System.out.println("categoria 1 produtos:");
        cat1.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        
        
        System.out.println("Subcategorias de cada categoria:");
        
        System.out.println("categoria 1 subcategorias:");
        cat1.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        System.out.println("categoria 2 subcategorias:");
        cat2.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        System.out.println("categoria 3 subcategorias:");
        cat3.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        System.out.println("categoria 4 subcategorias:");
        cat4.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        }
    
}
