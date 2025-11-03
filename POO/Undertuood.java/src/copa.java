
public class copa{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Cozinha c1 = new Cozinha("Mauricio", "Sobremesas");
        c1.setReservas(13);
        System.out.println("Bem vindo ao nosso restaurante! Deseja fazer uma reserva?");
        String resposta = sc.nextLine();
        if( resposta.equals("sim") || resposta.toUpperCase().equals("SIM") || resposta.equals("Sim")){
            c1.reservas();
            c1.reservas();
            c1.reservas();
            c1.getRestaurtantecheio();
        }
        else{
            System.out.println("Serio? que pena...");
        }
    }
}

