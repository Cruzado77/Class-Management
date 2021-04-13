import java.util.ArrayList;

/**
 *
 * @author juanj
 * @author raphars
 */
public class Aluno extends Pessoa {
    //Aluno recebe por herança os atributos de pessoa!
    
    

    public Aluno(String no, int idade, int matricula) {
        this.setNome(no);
        this.setIdade(idade);
        this.setMatricula(matricula);
        this.turmas = new ArrayList<Turma>();
        
    }
    
    public Aluno() {
        this.turmas = new ArrayList<Turma>();
    }
   
}

