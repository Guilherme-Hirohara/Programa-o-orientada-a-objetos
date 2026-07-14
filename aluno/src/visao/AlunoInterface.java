
package visao;

import java.util.Scanner;
import modelo.Aluno;

public class AlunoInterface {
   Aluno aluno = new Aluno(); 
   
    public void colocar_dados()
    {
        System.out.print("Digite o seu nome:");
        Scanner ler = new Scanner(System.in); 
        aluno.setNome(ler.nextLine());  
        System.out.print("Digite o seu prontuario:"); 
        aluno.setProntuario(ler.nextLine());
        System.out.print("Digite a sua turma:");
        aluno.setTurma(ler.nextLine());
        System.out.print("Digite a sua frequencia:");
        aluno.setFrequencia(ler.nextDouble()); 
        System.out.println("");
    }
}
