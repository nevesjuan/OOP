import java.util.Scanner;
import java.util.concurrent.Callable;

public class ObjetoComputador {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador();

        String cpu1, cpu2,cpu3;
        String gpu1, gpu2, gpu3;
        String ram1, ram2, ram3;
        String placaMae1, placaMae2, placaMae3;
        String armazenamento1, armazenamento2, armazenamento3;
        double preco1, preco2, preco3;

        System.out.println("Insira a cpu do pc 1: ");
        cpu1 = ler.nextLine();
        System.out.println("Insira a gpu do pc 1: ");
        gpu1 = ler.nextLine();
        System.out.println("Insira a ram do pc 1: ");
        ram1 = ler.nextLine();
        System.out.println("Insira a placa mae do pc 1: ");
        placaMae1 = ler.nextLine();
        System.out.println("Insira o armazenamento do pc 1: ");
        armazenamento1 = ler.nextLine();
        System.out.println("Insira a preco do pc 1:");
        preco1 = ler.nextDouble();

        System.out.println("Insira a cpu do pc 2: ");
        cpu2 = ler.nextLine();
        System.out.println("Insira a gpu do pc 2: ");
        gpu2 = ler.nextLine();
        System.out.println("Insira a ram do pc 2: ");
        ram2 = ler.nextLine();
        System.out.println("Insira a placa mae do pc 2: ");
        placaMae2 = ler.nextLine();
        System.out.println("Insira o armazenamento do pc 2: ");
        armazenamento2 = ler.nextLine();
        System.out.println("Insira a preco do pc 2:");
        preco2 = ler.nextDouble();

        System.out.println("Insira a cpu do pc 3: ");
        cpu3 = ler.nextLine();
        System.out.println("Insira a gpu do pc 3: ");
        gpu3 = ler.nextLine();
        System.out.println("Insira a ram do pc 3: ");
        ram3 = ler.nextLine();
        System.out.println("Insira a placa mae do pc 3: ");
        placaMae3 = ler.nextLine();
        System.out.println("Insira o armazenamento do pc 3: ");
        armazenamento3 = ler.nextLine();
        System.out.println("Insira a preco do pc 3:");
        preco3 = ler.nextDouble();

        computador1.setCpu(cpu1);
        computador1.setGpu(gpu1);
        computador1.setRam(ram1);
        computador1.setPlacaMae(placaMae1);
        computador1.setArmazenamento(placaMae1);
        computador1.setPreco(preco1);

        computador2.setCpu(cpu2);
        computador2.setGpu(gpu2);
        computador2.setRam(ram2);
        computador2.setPlacaMae(placaMae2);
        computador2.setArmazenamento(placaMae2);
        computador2.setPreco(preco2);

        computador3.setCpu(cpu3);
        computador3.setGpu(gpu3);
        computador3.setRam(ram3);
        computador3.setPlacaMae(placaMae3);
        computador3.setArmazenamento(placaMae3);
        computador3.setPreco(preco3);

        System.out.println("-----Computador 1");
        System.out.println("cpu do 1º computador");
        System.out.println("gpu do 1º computador");
        System.out.println("ram do 1º computador");
        System.out.println("placa mae do 1º computador");
        System.out.println("armazenamento do 1º computador")




    }
}