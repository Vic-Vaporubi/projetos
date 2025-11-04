public class dentroDaCozinha {
    private Cozinha reserva;
    private String chefe;
    private String pratoDoDia;
    private boolean cozinhando;
    private boolean cozinhaLimpa;
    public dentroDaCozinha(String c, String ptd){
        this.chefe = c;
        this.pratoDoDia = ptd;
        this.cozinhando = true;
        this.cozinhaLimpa = true;
    }
    public void cozinhar(){
        if(reserva.getReserva() !=0){
            if(cozinhando){
                System.out.println("O chefe " + chefe + " está preparando o prato do dia: " + pratoDoDia);
                cozinhaLimpa = false;
            } else {
                cozinhando = true;
                System.out.println("O chefe " + chefe + " começou a cozinhar o prato do dia: " + pratoDoDia);
            }
        } else{
            System.out.println("Não há reservas para cozinhar.");
        }
    }
    public void limparCozinha(){
        if(!cozinhaLimpa){
            System.out.println("A cozinha está sendo limpa.");
            cozinhaLimpa = true;
        } else {
            System.out.println("A cozinha já está limpa.");
        }
    }
}
