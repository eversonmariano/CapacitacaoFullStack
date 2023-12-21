package br.com.syscapacity;

public class ServidorPublico {

    private String matricula;
    private String nome;
    private String orgao;
    private String cargo;
    private String lotacao;
    private double salario;

    public ServidorPublico() {
    }

    public ServidorPublico(String matricula, String nome, String orgao, String cargo, String lotacao, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.orgao = orgao;
        this.cargo = cargo;
        this.lotacao = lotacao;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ServidorPublico{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", orgao='" + orgao + '\'' +
                ", cargo='" + cargo + '\'' +
                ", lotacao='" + lotacao + '\'' +
                ", salario=" + salario +
                '}';
    }
}
