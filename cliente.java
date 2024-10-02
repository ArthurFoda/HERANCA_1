class Cliente {
    protected String nome;
    protected String endereco;
    protected String email;

    public Cliente(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);
    }
}


class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String email, String cpf) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("CPF: " + cpf);
    }
}


class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String email, String cnpj) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("CNPJ: " + cnpj);
    }
}


class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;

    public Funcionario(String nome, String cpf, String endereco, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salário: " + salario);
    }
}


public class Main {
    public static void main(String[] args) {
        
        PessoaFisica pf1 = new PessoaFisica("João Pedro", "Rua A, 123", "joao@email.com", "123.456.789-00");
        PessoaFisica pf2 = new PessoaFisica("Maria Laura", "Rua B, 456", "maria@email.com", "987.654.321-11");

        
        PessoaJuridica pj1 = new PessoaJuridica("Empresa X", "Avenida Central, 789", "contato@empresax.com", "12.345.678/0001-00");
        PessoaJuridica pj2 = new PessoaJuridica("Empresa Y", "Avenida Oeste, 321", "contato@empresay.com", "98.765.432/0001-11");

        
        Funcionario func1 = new Funcionario("Carlos Oliveira", "321.654.987-00", "Rua C, 789", 3500.00);
        Funcionario func2 = new Funcionario("Ana Luiza", "654.987.321-11", "Rua D, 101", 4200.00);

        
        System.out.println("Informações de Pessoas Físicas:");
        pf1.exibirInfo();
        System.out.println();
        pf2.exibirInfo();
        System.out.println();

        System.out.println("Informações de Pessoas Jurídicas:");
        pj1.exibirInfo();
        System.out.println();
        pj2.exibirInfo();
        System.out.println();

        System.out.println("Informações de Funcionários:");
        func1.exibirInfo();
        System.out.println();
        func2.exibirInfo();
    }
}