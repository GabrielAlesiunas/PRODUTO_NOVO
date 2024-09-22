import java.time.LocalDate;

class Main {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;

    // Construtor 1: Recebe todos os atributos por parâmetro
    public Main(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao, LocalDate dataValidade) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    // Construtor 2: Recebe nome, preço de custo, preço de venda e data de fabricação
    // A data de validade será 1 mês após a data de fabricação
    public Main(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataFabricacao.plusMonths(1); // Data de validade 1 mês após a fabricação
    }

    // Construtor 3: Recebe apenas nome e preço de custo
    // O preço de venda será 10% a mais sobre o preço de custo
    // A data de validade será 1 mês após a data de fabricação
    public Main(String nome, double precoCusto) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoCusto * 1.10; // Preço de venda com 10% a mais sobre o preço de custo
        this.dataFabricacao = LocalDate.now(); // Data de fabricação é a data atual
        this.dataValidade = dataFabricacao.plusMonths(1); // Data de validade 1 mês após a fabricação
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Método para exibir os detalhes do produto
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço de Custo: " + precoCusto);
        System.out.println("Preço de Venda: " + precoVenda);
        System.out.println("Data de Fabricação: " + dataFabricacao);
        System.out.println("Data de Validade: " + dataValidade);
    }

    // Testando a classe
    public static void main(String[] args) {
        // Testando Construtor 1
        Main produto1 = new Main("Teclado Gamer", 230.0, 430.0, LocalDate.of(2024, 9, 10), LocalDate.of(2025, 9, 11));
        produto1.exibirDetalhes();
        
        System.out.println();

        // Testando Construtor 2
        Main produto2 = new Main("Mouse Gamer", 45.0, 150.0, LocalDate.of(2024, 8, 7));
        produto2.exibirDetalhes();

        System.out.println();

        // Testando Construtor 3
        Main produto3 = new Main("HeadSet Gamer", 80.0);
        produto3.exibirDetalhes();
    }
}
