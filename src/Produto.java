import java.util.Scanner;

public class Produto {

    private String nome;
    private double preco;
    private int codigo;

    public Produto(String nome, double preco, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void cadastrarNovoProduto(){
        Scanner input = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        this.nome = input.nextLine();

        System.out.print("Preço: ");
        this.preco = input.nextDouble();

        System.out.print("Código: ");
        this.codigo = input.nextInt();
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Código: " + codigo);
        System.out.println("-------------------------------");
    }
}
