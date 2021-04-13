import java.util.ArrayList;

/**
 *
 * @author juanj
 * @author raphars
 */

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    public ArrayList<Turma> turmas;
    private int matricula;
    
    //Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    @Override
    public boolean equals(Object obj){
        Pessoa pessoa = (Pessoa)obj;
        return this.matricula == pessoa.matricula;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.matricula;
        return hash;
    }
    
}