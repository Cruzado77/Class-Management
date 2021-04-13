import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author juanj e Raphael Sena
 */
public class Escola {
    //Atributos
    ArrayList<Aluno> alunos;
    ArrayList<Turma> turmas;
    ArrayList<Professor> professores;
    
    //Constructor
    public Escola() {
        alunos = new ArrayList();
        turmas = new ArrayList();
        professores = new ArrayList();
    }
    
    
    //Getters e setters
    public ArrayList<Aluno> getAlunosGeral() {
        return alunos;
    }

    public void setAlunosGeral(ArrayList<Aluno> alunosGeral) {
        
        this.alunos = alunosGeral;
    }

    public ArrayList<Turma> getTurmasGeral() {
        return turmas;
    }

    public void setTurmasGeral(ArrayList<Turma> turmasGeral) {
        this.turmas = turmasGeral;
    }

    public ArrayList<Professor> getProfGeral() {
        return professores;
    }

    public void setProfGeral(ArrayList<Professor> profGeral) {
        this.professores = profGeral;
    }
    
    //Métodos
    public void criarTurma(){
        Scanner tecla = new Scanner(System.in);
        System.out.println("Escolha uma das turmas: ");
        System.out.println("0) Criar Turma");
        for(int i = 0; i<this.turmas.size(); i++){
            System.out.printf((i+1) + ") " + this.turmas.get(i).getCodigoTurma());
        }
        int opc = tecla.nextInt();
        if(opc == 0){
            
        }
    }
    
    public void createAluno() {
        Scanner tecla = new Scanner(System.in);
        Aluno aluno = new Aluno();
        try{
            System.out.println("Digite o nome do aluno: ");
            aluno.setNome(tecla.nextLine());
            System.out.println("Digite a idade: ");
            aluno.setIdade(tecla.nextInt());
            System.out.println("Digite a matrícula: ");
            aluno.setMatricula(tecla.nextInt()); 
            if(this.isPessoa(aluno)){
                System.out.println("Não foi possivel criar aluno, matrícula já existe!");
            }else{
                this.alunos.add(aluno);   
            }
        }
        catch(InputMismatchException inputMismatchException){
            System.out.println("Dados de entrada inválidos!");
        }
                
    }
    
    public void createProfessor(){
        Scanner tecla = new Scanner(System.in);
        Professor professor = new Professor();
        try{
            System.out.println("Digite o nome do professor: ");
            professor.setNome(tecla.nextLine());
            System.out.println("Digite a idade: ");
            professor.setIdade(tecla.nextInt());
            System.out.println("Digite a matrícula: ");
            professor.setMatricula(tecla.nextInt());
            if(this.isPessoa(professor)){
                System.out.println("Não foi possivel criar professor, matrícula já existe!");
            }else{
                this.professores.add(professor);      
            }
        }
        catch(InputMismatchException inputMismatchException){
            System.out.println("Dados de entrada inválidos!");
        }
          
    }
     
    public void createTurma(){
        Scanner tecla = new Scanner(System.in);
        Turma turma = new Turma();
        System.out.println("Digite o código da turma: ");
        turma.setCodigoTurma(tecla.nextLine());
        try{
            turma.setAlunosTurma(this.selectAlunos());
            turma.setProfTurma(this.selectProfessores());
            this.turmas.add(turma);
        }
        catch(InputMismatchException inputMismatchException){
            System.out.println("Dados de entrada inválidos!");
        }
    }
    
    private ArrayList<Aluno> selectAlunos(){
        Scanner tecla = new Scanner(System.in);
        ArrayList<Aluno> selected = new ArrayList<Aluno>();
        ArrayList<Aluno> temp = new ArrayList<Aluno>(alunos);
        int i, opc;
        while(true){
            System.out.println("Selecione os alunos: "); 
            System.out.println("0 - Finalizar");
            for(i=0; i < temp.size(); i++){
                System.out.println(i+1 +"-" + temp.get(i).getNome());

            } 
            opc = tecla.nextInt();
            if(opc == 0){
                break;
               
            }
            if(opc > 0 & opc <= temp.size()){
                selected.add(temp.get(opc-1));
                temp.remove(opc-1);
                continue;
            }
            System.out.println("Opção Inválida!!!");
        }
        return selected;
    }
    
    private ArrayList<Professor> selectProfessores(){
        Scanner tecla = new Scanner(System.in);
        ArrayList<Professor> selected = new ArrayList<Professor>();
        ArrayList<Professor> temp = new ArrayList<Professor>(professores);
        int i, opc;
        while(true){
            System.out.println("Selecione os professores: "); 
            System.out.println("0 - Finalizar");
            for(i=0; i < temp.size(); i++){
                System.out.println(i+1 +"-" + temp.get(i).getNome());

            } 
            opc = tecla.nextInt();
            if(opc == 0){
                break;
               
            }
            if(opc > 0 & opc <= temp.size()){
                selected.add(temp.get(opc-1));
                temp.remove(opc-1);
                continue;
            }
            System.out.println("Opção Inválida!!!");
        }
        return selected;
    }
    
    public void printTurmas(){
        for(Turma i: this.turmas){
            i.printTurma();
        }
    }
    //Polimorfismo
    public boolean isPessoa(Pessoa pessoa){
        for(Pessoa i : this.alunos){
            if(i.equals(pessoa)){
                return true;
            }
        }
        for(Pessoa i : this.professores){
            if(i.equals(pessoa)){
                return true;
            }
        }
        return false;
    }
}