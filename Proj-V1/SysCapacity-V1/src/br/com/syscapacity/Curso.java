package br.com.syscapacity;

public class Curso {

    private int idcurso;
    private String nome;
    private String formaRealizacao;

    private String ofertante;
    private double valor;

    public Curso() {
    }

    public Curso(int idcurso, String nome, String formaRealizacao, String ofertante, double valor) {
        this.idcurso = idcurso;
        this.nome = nome;
        this.formaRealizacao = formaRealizacao;
        this.ofertante = ofertante;
        this.valor = valor;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormaRealizacao() {
        return formaRealizacao;
    }

    public void setFormaRealizacao(String formaRealizacao) {
        this.formaRealizacao = formaRealizacao;
    }

    public String getOfertante() {
        return ofertante;
    }

    public void setOfertante(String ofertante) {
        this.ofertante = ofertante;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idcurso=" + idcurso +
                ", nome='" + nome + '\'' +
                ", formaRealizacao='" + formaRealizacao + '\'' +
                ", ofertante='" + ofertante + '\'' +
                ", valor=" + valor +
                '}';
    }
}
