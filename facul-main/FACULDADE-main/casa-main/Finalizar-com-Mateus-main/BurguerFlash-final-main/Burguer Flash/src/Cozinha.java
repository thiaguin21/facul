public class Cozinha extends Garcom{

    private boolean pronto;
    private Garcom entregarPedido;

    public Cozinha(){
        this.setPronto(false);
    }

    protected Garcom getEntregarPedido() {
        return entregarPedido;
    }
    protected void setEntregarPedido(Garcom entregarPedido) {
        this.entregarPedido = entregarPedido;
    }
    protected boolean getPronto() {
        return pronto;
    }
    protected void setPronto(boolean pronto) {
        this.pronto = pronto;
    }

    protected void confirmarPedido(){
        if(getMandarCozinha()){
            int i;
            for(i = 0; i < 100; i++){
                if (i < 100){
                    this.setPronto(false);
                    statusPedido();
                }else{
                    this.setPronto(true);
                    this.statusPedido();
                }
            }
        }
    }
    protected void statusPedido(){
        if (getPronto()){
            System.out.println("Pedido pronto");
            this.setPedidoPronto(true);
            this.entregarPedido.entregue();
        } else {
            System.out.println("Pedido em preparo...");
            this.setPedidoPronto(false);
            this.entregarPedido.entregue();
        }
    }
}
