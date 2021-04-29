
public class Cliente{

    private String nome;
    private double dinheiroCarteira;
    private int cpf;
    private Pedido carrinhoCompras;
    
    public Cliente(){
        carrinhoCompras = new Pedido();
    }

    public Cliente(String nome, double dinheiro, int cpf){
        carrinhoCompras = new Pedido();
        this.nome = nome;
        this.dinheiroCarteira = dinheiro;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getDinheiroCarteira() {
        return dinheiroCarteira;
    }
    public void setDinheiroCarteira(double dinheiroCarteira) {
        this.dinheiroCarteira = dinheiroCarteira;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public Pedido getCarrinhoCompras() {
        return carrinhoCompras;
    }
    public void setCarrinhoCompras(Pedido carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

    public Pedido getPedido(){
        return carrinhoCompras;
    }

    public boolean realizarCompra(){
        if(carrinhoCompras.getValorTotal() < dinheiroCarteira){
            dinheiroCarteira = dinheiroCarteira - carrinhoCompras.getValorTotal();
            carrinhoCompras = new Pedido();
            return true;
        }else{
            return false;
        }
    }

    public boolean cancelarCompra(){
        carrinhoCompras = new Pedido();
        return true;
    }

}