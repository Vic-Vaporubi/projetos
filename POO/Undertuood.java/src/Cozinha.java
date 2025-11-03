public class Cozinha implements Restaurante {
    private String cozinheiro;
    private String atuacao;
    private int reservas;
    private boolean restaurantecheio;

    public Cozinha(String c, String e){
        this.cozinheiro = c;
        this.atuacao = e;
    }

    public String getCozinheiro(){
        System.out.println("Cozinheiro: " + this.cozinheiro);
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
    public int getReservas(){
        return this.reservas;
    }
    public void setReservas(int r){
        if (reservas >= 15){
            this.restaurantecheio = true;
            System.out.println("Infelizmente, o restaurante está cheio no momento.");
        } else {
            this.restaurantecheio = false;
            reservas = r;
        }
        
    }
    public boolean getRestaurtantecheio(){
        System.out.println("Restaurante cheio: " + restaurantecheio);
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
            setReservas(getReservas() + 1);
            System.out.println("Reserva realizada com sucesso!");
        }
    }
}