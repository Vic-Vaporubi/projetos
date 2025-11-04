public class Cozinha implements Restaurante {
    private String cozinheiro;
    private String atuacao;
    private int reserva;
    private boolean restaurantecheio;

    public Cozinha(String c, String e){
        this.cozinheiro = c;
        this.atuacao = e;
    }

    public String getCozinheiro(){
        return this.cozinheiro;
    }
    public void setCozinheiro(String c){
        this.cozinheiro = c;
    }
    public String getAtuacao(){
        System.out.println("Atuação: " + this.atuacao);
        return this.atuacao;
    }
    public void setAtuacao(String e){
        this.atuacao = e;
    }
    public int getReserva(){
        return this.reserva;
    }
    public void setReserva(int r){
        if (r >= 15 || r < 0 || getRestaurtantecheio() || this.reserva == 15){
            this.restaurantecheio = true;
            System.out.println("Infelizmente, o restaurante está cheio no momento.");
        } else {
            this.restaurantecheio = false;
            reserva = reserva + r;
        }
        
    }
    public boolean getRestaurtantecheio(){
        return restaurantecheio;
    }
    public void setRestaurantecheio(boolean rc){
        if( rc == getRestaurtantecheio()){
            System.out.println("O restaurante já está cheio.");
        } else{
            this.restaurantecheio = rc;
        }
        
    }
    @Override
    public void abrirrestaurante(){
        System.out.println("O restaurante está aberto!");
    }
    @Override
    public void fecharrestaurante(){
        if(getRestaurtantecheio()){
            System.out.println("O restaurante está cheio, não pode fechar agora!");
        } else{
        System.out.println("O restaurante está fechado!");
        }
    }
    @Override
    public void reservas(){
        if(getRestaurtantecheio()){
            System.out.println("Não há mais reservas disponíveis, o restaurante está cheio.");
        } else{
            setReserva(getReserva() + 1);
            System.out.println("Reserva realizada com sucesso!");
        }
    }
}