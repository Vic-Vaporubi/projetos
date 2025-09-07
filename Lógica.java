import java.util.Arrays;
import java.util.Scanner;
public class Lógica{
    public static void main(String[] args){
        //Analisador de media
        //Entrada de notas
        Scanner sc = new Scanner(System.in);
        System.out.println("Ola, bem vindo ao analisador de media, por favor digite sua nota 1:  ");
        int nota1 = sc.nextInt();
        System.out.println("Otimo, agora sua nota 2: ");
        int nota2 = sc.nextInt();
        System.out.println("Agora sua nota 3: ");
        int nota3 = sc.nextInt();
        System.out.println("Por fim sua nota 4: ");
        int nota4 = sc.nextInt();
        int media = (nota1 + nota2 + nota3 + nota4 ) / 4;
        //Verificação de media errada
        if(media>10){
            System.out.println("Voce digitou alguma nota errada, lembresse é de 0 a 10. ");
        }
        //Verificação da media
        else if (media >= 6) {
            System.out.println("Parabens, voce esta aprovado, sua media foi: " + media);
        }
        else if(media >= 5) {
            System.out.println("Quase la! Voce esta de recuperação, sua media foi de: " + media);
        }
        else {
            System.out.println("Infelizmente não foi dessa vez, voce esta reprovado, sua media foi de : " + media);
        }
        //Analisador de senha
        int senha = 1212;
        int i = 0;
        String nome = "João";
        double saldo = 180.00;
        //loop de verificação
        while(i < 3){
            System.out.println("Digite sua senha: ");
            int senha2 = sc.nextInt();
            if(senha2 != senha){
                System.out.println("Senha incorreta. ");
                i++;
            }
            else{
                System.out.printf("Bem vindo a sua conta %s%n seu saldo é de %.2f. reais ", nome, saldo);
                break;
            }
        }
        //tentativas falhas demais
        if(i == 3){
            System.out.println("Conta Bloqueada. ");
        }

        //Conversor de anos em dias
        int ano = 365;
        int mes = 30;
        System.out.println("Digite a quantidade de anos, meses e dias, respectivamente: ");
        int anos = sc.nextInt();
        int meses = sc.nextInt();
        int dias = sc.nextInt();
        int dia = (anos * ano + meses * mes + dias);
        System.out.printf("A quantidade de dias, apos a conversão de %d anos,%n%d meses %ne %d dias, é de %d dias. ", anos, meses, dias, dia);
        //escrever numeros e verificar se esta no conjunto
        System.out.println("Digite 5 numeros ");
        int[] numeros = new int[5];
        numeros[0] = sc.nextInt();
        numeros[1] = sc.nextInt();
        numeros[2] = sc.nextInt();
        numeros[3] = sc.nextInt();
        numeros[4] = sc.nextInt();
        Arrays.sort(numeros);
        System.out.println("Digite um numero que voce quer verificar: ");
        int banana = sc.nextInt();
        int pos;
        pos = Arrays.binarySearch(numeros, banana);
        System.out.printf("O numero %d está no conjunto ? %s", banana, pos > 0 ? "sim":"não");
        //calculadora de salarios
        System.out.println("Digite seu salario: ");
        int sm = 1412;
        double sl = sc.nextDouble();
        double slm = sl / sm;
        System.out.printf("Seu salario é %.2f, e vc recebe %.2f salarios minimos. %n",sl,slm);
        //numero antes e depois
        System.out.println("Digite o numero que voce deseja ver o antecessor e o sucessor: ");
        double apop, apop1, apop2;
        apop = sc.nextDouble();
        apop1 = apop - 1;
        apop2 = apop + 1;
        System.out.printf("O numero %.2f tem o antecessor %.2f e o sucessor %.2f. ", apop, apop1, apop2);
        System.out.println("Digite o numero que vc quer a tabuada: ");
        int n = sc.nextInt();
        int tabu = 0;
        for(int j = 0; j < 11; j++){
            tabu = n * j;
            System.out.printf("%d * %d = %d%n", n, j, tabu);
        }
        //Chamada de nomes
        System.out.println("Qual o tamanho da chamada? ");
        int tam = sc.nextInt();
        String[] nomes = new String[tam];
        System.out.println("Digite os nomes da chamada: ");
        for(int k = 0; k < nomes.length; k++){
            nomes[k] = sc.nextLine();
        }
        Arrays.sort(nomes);
        for(int a = 0; a < nomes.length; a++){
            System.out.printf("O aluno %s esta na %dª posição  da chamada.%n", nomes[a], a);
        }
        int [] notas = new int [4];
        for(int b = 0; b < notas.length; b++){
            notas[b] = sc.nextInt();
            if(notas[b] < 0  || notas[b] > 10){
                System.out.println("nota inavalida. ");
                break;
            }
        }

        int soma = 0;
        int med = 0;
        for(int g = 0; g < notas.length; g++){
            soma = soma + notas[g];
        }
        med = soma/ notas.length;
        System.out.println("A media é " + med);
        //Soma de 1 a n
        System.out.println("Digite o valor der n: ");
        int l = sc.nextInt();
        int som = 0;
        for(int z = 0; z < l; z++){
            som = som + z;
        }
        System.out.printf("O resultado da soma de 1 a %d é igual a %d%n", l, som);
        //fatorial
        System.out.println("Qual é o numero que vc deseja o fatorial? ");
        int fat, res;
        fat = sc.nextInt();
        res = 1;
        for(int d = 2; d <= fat; d++){
            res = res * d;

        }
        System.out.printf("%d! é %d.", fat, res);
        //Menos inteiro no array
        System.out.println("Digite o tamanho do array: ");
        int tama = sc.nextInt();
        int[] lista = new int[tama];
        System.out.println("Digite os elementos do array: ");
        for(int v = 0; v < tama; v++){
            lista[v] = sc.nextInt();
        }
        int saida = lista[0];
        for(int m = 1; m < tama; m++){
            if(lista[m] < saida){
                saida = lista[m];
            }

        }
        System.out.println(saida);
        //Elementos maior que 10
        int[] array = new int[5];
        System.out.println("Digite os elementos do array: ");
        for(int t = 0; t < 5; t++){
            array[t] = sc.nextInt();


        }
        for(int q = 0; q < 5; q++){
            if (array[q] > 10){
                System.out.println(array[q]);
            }
        }
        //Matriz
        int[][] matriz = new int [2][2];
        int linha1, linha2, det;
        System.out.println("Quais elementos fazem parte da matriz");
        for(int w = 0; w < 2; w++){
            for(int j = 0; j < 2; j++){
                matriz[w][j] = sc.nextInt();
            }
        }
        linha1 = matriz[0][0] * matriz[1][1];
        linha2 = matriz[0][1] * matriz[1][0];
        det = linha1 - linha2;
        System.out.printf("O determinante da matriz é %d",det);
        //Menu
        System.out.println("Selecione a opção que deseja, 1-listar, 2-adicionar, 3-buscar, 4-sair");
        String[] resistores = new String[5];
        String[] valores = new String[5];
        for(int r = 0; r < 5; r++){
            resistores[r] = sc.next();
            valores[r] = sc.next();
        }
        while(0 < 1){
            int escolha = sc.nextInt();
            if (escolha == 1){
                for(int y = 0; y < 5; y++){
                    System.out.printf(resistores[y]);
                    System.out.printf(valores[y]);
                }
            }
        }

    }
}