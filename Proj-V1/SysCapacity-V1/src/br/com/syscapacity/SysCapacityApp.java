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

    //CREATE
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
    //READ
    public void listarServidoresPublicos() {
        for (ServidorPublico servidor : servidores){
            System.out.println(servidor);
        }
    }

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


    //UPDATE
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

    //DELETE
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
            System.out.println("O Servidor Publico de matrícula "+ matricula + " foi alterado com sucesso!");
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
        sistema.adicionarServidorPublico();
        sistema.adicionarServidorPublico();
        System.out.println("adicionado 2 servidores");
        sistema.listarServidoresPublicos();
       // sistema.listarServidorPorMatricula(12);
      //  sistema.listarServidorPorMatricula(13);
        ServidorPublico servidorAlterado = new ServidorPublico(1, "ell","if",
                "estudante", "cg", "japa@", 100.00 );
        sistema.alterarServidorPublico(servidorAlterado);

      //  sistema.excluirServidorPublico(1);
        System.out.println("listar servidores");
        sistema.listarServidoresPublicos();

        sistema.calcularFolhaSalarial();




    }
}
