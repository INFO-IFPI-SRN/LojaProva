import java.util.ArrayList;

public class Pedido {
    
    private ArrayList<Item> listaItens;
    private double valorTotal;
    
    public Pedido(){
        listaItens = new ArrayList<>();
        valorTotal = 0;
    }

    public ArrayList<Item> getListaItens() {
        return listaItens;
    }
    public void setListaItens(ArrayList<Item> listaItens) {
        this.listaItens = listaItens;
    }
    
    public double getValorTotal() {
        double aux = 0;
        for(Item i : listaItens){
            aux += i.getValor();
        }
        valorTotal = aux;
        return valorTotal;
    }
    
    public String adicionarItem(Item item){
        listaItens.add(item);
        return "Item " + item.getNome() + " adicionado ao carrinho";
    }

    public String removerItem(Item item){
        /**
         * .... a implementar
         */
        return "Item removido com sucesso";
    } 
}
