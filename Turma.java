import java.util.ArrayList;

/**
 *
 * @author juanj
 * @author raphars
 */
public class Turma extends Classe{
    //Atributos da Turma
    private ArrayList<Aluno> alunosTurma;
    private ArrayList<Professor> profTurma;

    //Sobrecarga de metodo
    public Turma() {
        alunosTurma = new ArrayList();
    }

    public Turma(String codigoTurma, ArrayList<Aluno> alunosTurma,ArrayList<Professor> profTurma) {
        this.setCodigoTurma(codigoTurma);
        this.alunosTurma = alunosTurma;
        this.profTurma = profTurma;
    }
    
    
    public ArrayList<Aluno> getAlunosTurma() {
        return alunosTurma;
    }

    public void setAlunosTurma(ArrayList<Aluno> alunosTurma) {
        this.alunosTurma = alunosTurma;
    }

    public ArrayList<Professor> getProfTurma() {
        return this.profTurma;
    }

    public void setProfTurma(ArrayList<Professor> profTurma) {
        this.profTurma = profTurma;
    }
    
    public void printTurma(){
        System.out.println("******************************");

        System.out.println("Código da turma: "+ this.getCodigoTurma() + ":");
        
        System.out.println("Professores: ");
        for(Professor i : this.profTurma){
            System.out.println("Nome: " + i.getNome() + " Matrícula: " + i.getMatricula() + ".");      
        }
        
        System.out.println("Aluno: ");
        for(Aluno i : this.alunosTurma){
            System.out.println("Nome: " + i.getNome() + " Matrícula: "+ i.getMatricula()+ ".");
        }
        System.out.println("******************************");
        
    }
   
}

abstract class Classe{
    private String codigoTurma;

    //Getters e Setters- métodos acessores e modificadores
    public String getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    abstract public void printTurma();


}