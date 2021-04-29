public class Main {
    
    public static void main(String args[]) {
        
        Item shampoo = new Item("clear", 20, "anti caspa");
        Item desodorante = new Item("rexona", 12, "não te abandona!");
        Item cremeDental = new Item("sorriso", 5, "refrescância que dá gosto");

        Cliente nivaldoChicabana = new Cliente("Nivaldo", 50, 12345);
        
        String saida = nivaldoChicabana.getPedido().adicionarItem(shampoo);
        System.out.println(saida);

        System.out.println(nivaldoChicabana.getPedido().adicionarItem(desodorante));
        
        System.out.println(nivaldoChicabana.getPedido().adicionarItem(cremeDental));

        System.out.println(nivaldoChicabana.realizarCompra());
        System.out.println(nivaldoChicabana.getDinheiroCarteira());

        Cliente ricarte = new Cliente("ricarte", 25, 6789);
        
        System.out.println(ricarte.getPedido().adicionarItem(shampoo));
        System.out.println(ricarte.getPedido().adicionarItem(desodorante));
        
        System.out.println(ricarte.realizarCompra());
        System.out.println(ricarte.getDinheiroCarteira());
    }

}
