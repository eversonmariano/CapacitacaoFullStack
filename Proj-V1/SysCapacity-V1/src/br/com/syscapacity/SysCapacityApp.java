package br.com.syscapacity;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class SysCapacityApp {

    //Atributos
    List<ServidorPublico> servidores = new LinkedList<>();
    List<Curso> cursos = new LinkedList<>();

    //Métodos CRUD - ServidorPublico
//  (1) adicionarServidorPublico()
//• (2) listarServidoresPublicos()
//• (3) listarServidorPublico(int matricula)
//• (4) alterarServidorPublico(ServidorPublico servidor)
//• (5) excluirServidorPublico(int matricula)
    //Método ServidorPublico
//• (6) calcularFolhaServidoresPublicos()

    //MÉTODOS CURSOS
//  (1) adicionarCurso()
//• (2) listarCursos()
//• (3) listarCurso(int cdCurso)
//• (4) alterarCurso(Curso curso)
//• (5) excluirServidorPublico(int cdCurso)

    //CREATE SERVIDOR
    public void adicionarServidorPublico() {
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula"));
        String nome = JOptionPane.showInputDialog("Digite a nome");
        String orgao = JOptionPane.showInputDialog("Digite o orgão");
        String cargo = JOptionPane.showInputDialog("Digite o cargo");
        String lotacao = JOptionPane.showInputDialog("Digite a lotação");
        String email = JOptionPane.showInputDialog("Digite a email");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));

        ServidorPublico servidor = new ServidorPublico(matricula, nome, orgao, cargo, lotacao, email, salario);
        servidores.add(servidor);
    }

    //CREATE CURSO
    public void adicionarCurso(){
        int idcurso = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do curso: "));
        String nome = JOptionPane.showInputDialog("Digite o nome do curso: ");
        String formaRealizacao = JOptionPane.showInputDialog("Digite a forma de realização do curso:");
        String ofertante = JOptionPane.showInputDialog("Qual escola dará o curso");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do curso: "));
        Curso curso = new Curso(idcurso, nome, formaRealizacao, ofertante, valor);
        cursos.add(curso);

    }


    //READ SERVIDORES PUBLICOS
    public void listarServidoresPublicos() {
        for (ServidorPublico servidor : servidores){
            System.out.println(servidor);
        }
    }

    //READ CURSOS
    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    //Busca de Servidor Publico por matrícula
    public void listarServidorPorMatricula(int matricula) {
        boolean encontrou = false;

        for (ServidorPublico servidor : servidores){
            if (servidor.getMatricula() == matricula){
                System.out.println(servidor);
                break;
            }

        }
        if(!encontrou){
            System.out.println("O servidor com a matrícula informada não existe!");

        }
    }

    //Busca de Curso por id
    public void listarCursoPorID(int idCurso) {
        boolean encontrou = false;
        for (Curso curso : cursos) {
            if (curso.getIdcurso() == idCurso){
                encontrou = true;
                System.out.println(curso);
                break;
            }
        }
        if (!encontrou){
            System.out.println("O curso não foi encontrado!");
        }
    }

    //UPDATE de Cursos por id
    public void alterarCurso(Curso cursoAlterado) {
        boolean encontrou = false;

        for (Curso curso : cursos){
            if (curso.getIdcurso() == cursoAlterado.getIdcurso()){
                encontrou = true;
                cursos.remove(curso);
                cursos.add(cursoAlterado);
                break;
            }
        }
        if(!encontrou){
            System.out.println("Id inexistente!");
        }
        else{
            System.out.println("A Alteração do Curso de Id "+ cursoAlterado.getIdcurso() + " foi alterado com sucesso!");
        }
    }


    //UPDATE de Servidor por Matrícula
    public void alterarServidorPublico(ServidorPublico servidorAlterado) {
        boolean encontrou = false;

        for (ServidorPublico servidor : servidores){
            if (servidor.getMatricula() == servidorAlterado.getMatricula()){
                encontrou = true;
                servidores.remove(servidor);
                servidores.add(servidorAlterado);
                break;
            }
        }
        if(!encontrou){
            System.out.println("O servidor com a matrícula informada não existe!");
        }
        else{
            System.out.println("A Alteração do Servidor Publico de matrícula "+ servidorAlterado.getMatricula() + " foi alterado com sucesso!");
        }
    }

    //DELETE Servidor Publico por Matrícula
    public void excluirServidorPublico(int matricula) {
        boolean encontrou = false;

        for (ServidorPublico servidor : servidores){
            if (servidor.getMatricula() == matricula){
                encontrou = true;
                servidores.remove(servidor);
                break;
            }
        }
        if(!encontrou){
            System.out.println("O servidor com a matrícula informada não existe!");
        }
        else{
            System.out.println("O Servidor Publico de matrícula "+ matricula + " foi excluído com sucesso!");
        }

    }

    //DELETE Curso por Id
    public void deletarCurso(Curso curso) {
        boolean encontrou = false;

        for (Curso curso1 : cursos){
            if (curso.getIdcurso() == curso.getIdcurso()){
                encontrou = true;
                cursos.remove(curso1);
                break;
            }
        }
        if(!encontrou){
            System.out.println("Id inexistente!");
        }
        else{
            System.out.println("O Curso de Id "+ curso.getIdcurso() + " foi excluído com sucesso!");
        }
    }

    //Método ServidorPublico
        public void calcularFolhaSalarial() {
        double folhaSalarial = 0.0;

        for (ServidorPublico servidor : servidores ){
            folhaSalarial += servidor.getSalario();
        }
        System.out.println("A folha salarial é: " + folhaSalarial);

    }
    public static void main(String[] args) {

        SysCapacityApp sistema = new SysCapacityApp();
//        sistema.adicionarServidorPublico();
//        sistema.adicionarServidorPublico();
//        System.out.println("adicionado 2 servidores");
//        sistema.listarServidoresPublicos();
//       //sistema.listarServidorPorMatricula(1);
//      //sistema.listarServidorPorMatricula(3);
//        ServidorPublico servidorAlterado = new ServidorPublico(1, "ell","if",
//                "estudante", "cg", "japa@", 100.00 );
//        sistema.alterarServidorPublico(servidorAlterado);
//      //sistema.excluirServidorPublico(1);
//        System.out.println("listar servidores");
//        sistema.listarServidoresPublicos();
//        sistema.calcularFolhaSalarial();

        sistema.adicionarCurso();
        sistema.adicionarCurso();
        System.out.println("adicionado 2 Cursos");
        sistema.listarCursos();
        System.out.println("Lista de curso por ID");
        sistema.listarCursoPorID(1);
      //sistema.listarServidorPorMatricula(3);

        Curso curso = new Curso(1, "História", "EAD", "UniFacisa", 300.00);
        System.out.println("Curso Alterado:");
        sistema.alterarCurso(curso);
        sistema.listarCursos();
      //sistema.excluirServidorPublico(1);





    }
}
