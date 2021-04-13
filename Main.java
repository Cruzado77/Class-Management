import java.util.Scanner;

import java.util.InputMismatchException;

public class Main {
    static Scanner tecla = new Scanner(System.in);
    static Escola escola = new Escola();
    
    public static void main(String[] args) {
        
        //Inicializador do programa
        boolean quit = false;
        while(!quit){
           System.out.println("Digite a opção: ");
           System.out.println("1 - Criar Turma");
           System.out.println("2 - Adicionar Aluno");
           System.out.println("3 - Adicionar Professor");
           System.out.println("4 - Mostrar Turma");
           System.out.println("5 - Sair");
           System.out.println("Digite a opção: ");
           try{
                int opc = tecla.nextInt();
                switch (opc){
                    case 1:{
                        escola.createTurma();
                        break;   
                    }
                    case 2:{
                        escola.createAluno();
                        break;
                    }
                    case 3:{
                        escola.createProfessor();
                        break;
                    }
                    case 4:{
                        escola.printTurmas();
                        break;
                    }
                    case 5:{
                        quit = true;
                        break;
                    }
                    default:
                        System.out.println("Opção Inválida!!!");
                        break;
                }
            }
            catch(InputMismatchException inputMismatchException){
                tecla.nextLine();
                System.out.println("Opção Inválida!!!");
            }
        }
           
       
    }
}
