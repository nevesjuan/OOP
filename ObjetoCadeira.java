import java.util.Scanner;

         public class ObjetoCadeira {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cadeira cadeira1 = new Cadeira();
        Cadeira cadeira2 = new Cadeira();
        Cadeira cadeira3 = new Cadeira();

        String nome1, nome2, nome3;
        String marca1, marca2, marca3;
        int velocidade1, velocidade2, velocidade3;
        int preco1, preco2, preco3;

        System.out.println("Insira o nome da cadeira 1: ");
        nome1 = ler.nextLine();
        System.out.println("Insira a marca da cadeira 1: ");
        marca1 = ler.nextLine();
        System.out.println("Insira a velocidade dda cadeira 1: ");
        velocidade1 = ler.nextInt();
        System.out.println("Insira o preco 1: ");
        preco1 = ler.nextInt();

        System.out.println("Insira o nome da cadeira 2: ");
        nome2 = ler.nextLine();
        System.out.println("Insira a marca da cadeira 2: ");
        marca2 = ler.nextLine();
        System.out.println("Insira a velocidade dda cadeira 2: ");
        velocidade2 = ler.nextInt();
        System.out.println("Insira o preco 2: ");
        preco2 = ler.nextInt();

        System.out.println("Insira o nome da cadeira 3: ");
        nome3 = ler.nextLine();
        System.out.println("Insira a marca da cadeira 3: ");
        marca3 = ler.nextLine();
        System.out.println("Insira a velocidade dda cadeira 3: ");
        velocidade3 = ler.nextInt();
        System.out.println("Insira o preco 3: ");
        preco3 = ler.nextInt();

        cadeira1.setNome(nome1);
        cadeira1.setMarca(marca1);
        cadeira1.setVelocidade(velocidade1);
        cadeira1.setPreco(preco1);

        cadeira2.setNome(nome2);
        cadeira2.setMarca(marca2);
        cadeira2.setVelocidade(velocidade2);
        cadeira2.setPreco(preco2);

        cadeira3.setNome(nome3);
        cadeira3.setMarca(marca3);
        cadeira3.setVelocidade(velocidade3);
        cadeira3.setPreco(preco3);

        System.out.println("-----CADEIRA 1-----");
        System.out.println("Tipo do aviao Nº1" + cadeira1.getNome());
        System.out.println("Cor do aviao Nº1" + cadeira1.getMarca());
        System.out.println("Velocidade do aviao Nº1" + cadeira1.getVelocidade());
        System.out.println("Quantidade de assentos do aviao Nº1" + cadeira1.getPreco());

        System.out.println("-----CADEIRA 2-----");
        System.out.println("Tipo do aviao Nº2" + cadeira2.getNome());
        System.out.println("Cor do aviao Nº2" + cadeira2.getMarca());
        System.out.println("Velocidade do aviao Nº2" + cadeira2.getVelocidade());
        System.out.println("Quantidade de assentos do aviao Nº2" + cadeira2.getPreco());

        System.out.println("-----CADEIRA 3-----");
        System.out.println("Tipo do aviao Nº3" + cadeira3.getNome());
        System.out.println("Cor do aviao Nº3" + cadeira3.getMarca());
        System.out.println("Velocidade do aviao Nº3" + cadeira3.getVelocidade());
        System.out.println("Quantidade de assentos do aviao Nº3" + cadeira3.getPreco());
    }
}




