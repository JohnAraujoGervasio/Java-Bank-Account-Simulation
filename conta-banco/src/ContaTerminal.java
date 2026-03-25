import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        //Aqui eu faço uma apresentação ao usuário e logo em seguída eu peço todas as entradas que o usuário deverá preencher.
        System.out.println("|========|         Olá usuário, seja bem-vindo ao BancoManeiro!        |=========|");
        System.out.println("|========|Vamos buscar sua conta, para isso, preencha os dados abaixo: |=========|");

        System.out.println("Digite o seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("Digite o número da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Digite o número da conta: ");   
        String conta = sc.nextLine();

        System.out.println("Digite o seu saldo: ");
        double saldo = sc.nextDouble();

        //Aqui a saída do programa é realizada, e todos os dados preenchidos pelo usuário são exebidos organizadamente.
        System.out.println("|========| Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque |=========|");
    
        //Aqui eu aproveito para fazer um "botão de loop", para caso o usuário queira criar outra conta.
        System.out.println("Deseja criar outra conta? (S/N)");
        String resposta = sc.next();

        while(!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")){
            System.out.println("Resposta inválida, por favor digite S para sim ou N para não.");
            resposta = sc.next();
        }

        if(resposta.equalsIgnoreCase("S")){
            main(args);
        }
        else{
            System.out.println("Muito obrigado por utilizar nossos serviços, volte sempre!!");
        }

    }
 }

