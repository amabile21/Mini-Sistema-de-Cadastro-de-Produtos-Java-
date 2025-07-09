import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--- CADASTRO DE PRODUTO ---");
        System.out.print("Nome do produto: ");
        String nome = input.nextLine();

        System.out.print("Preço: ");
        double preco = input.nextDouble();

        if(preco < 0) System.out.println("Digite um valor válido (acima de R$ 0,00)");
        System.out.print("Preço: ");
        preco = input.nextDouble();

        System.out.print("Código: ");
        int codigo = input.nextInt();

        Produto produto1 = new Produto(nome, preco, codigo);

        System.out.println("Deseja cadastrar novo produto?");
        System.out.println("1 - SIM");
        System.out.println("2 - NÃO");
        String opcao = input.next();

        while (opcao.equals("1")) {
            produto1.cadastrarNovoProduto();
        }

        System.out.println("Produto cadastrado!");
        produto1.exibirInfo();

        input.close();
    }
}
