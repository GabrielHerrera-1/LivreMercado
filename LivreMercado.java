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
        Categoria cat1 = new Categoria("cat1");
        Categoria cat2 = new Categoria("cat2");
        Categoria cat3 = new Categoria("cat3");
        Categoria cat4 = new Categoria("cat4");
        
        cat1.adicioneSubCategoria(cat3);
        cat3.adicioneSubCategoria(cat4);
        cat3.adicioneSubCategoria(cat2);
        //cat1 tem a cat3 que tem (cat4 e cat2)
       
        Produto prod1 = new Produto("prod1", "2", "3",2, cat1);
        Produto prod2 = new Produto("prod2", "2", "3",2, cat2);
        Produto prod3 = new Produto("prod3", "2", "3",2, cat3);
        Produto prod4 = new Produto("prod4", "2", "3",2, cat4);
        
        System.out.println("cat1 prods:");
        cat1.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        System.out.println("cat2 prods:");
        cat2.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        System.out.println("cat3 prods:");
        cat3.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        System.out.println("cat4 prods:");
        cat4.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        
        cat1.removaSubcategoria(cat3, true);
        // remover cat 3 da 1, deve deixar a cat4 e 2 na cat 1, além dos produtos prod 1
        System.out.println("Removendo subcategoria 3 da 1...");
        
        System.out.println("cat3 prods:");
        cat3.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        System.out.println("cat1 prods:");
        cat1.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
    }
    
}
