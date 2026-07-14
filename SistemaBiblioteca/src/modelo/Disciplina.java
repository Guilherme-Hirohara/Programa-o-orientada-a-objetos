
package modelo;

import java.util.ArrayList;


public class Disciplina {
    private int id; 
    private String nome; 
    private Professor professorResponsavel; 
    private static ArrayList<Aluno> alunos = new ArrayList<>(); 

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public void setAlunos(Aluno aluno) {
        alunos.add(aluno); 
    }
    
    
}
