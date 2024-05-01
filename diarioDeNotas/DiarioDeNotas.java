import java.util.Scanner;

public class DiarioDeNotas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 'Aluno' se você for um aluno e 'Professor' se você um professor" );
        String usuario1  = sc.nextLine();

         if(usuario1.equalsIgnoreCase("Professor")){
         Professor professor = new Professor();
         professor.identificarUsuario();
         professor.visualizarNotas();

         }else if(usuario1.equalsIgnoreCase("Aluno")){
            Aluno aluno = new Aluno();
            aluno.identificarUsuario();
            aluno.visualizarNotas();
            
         }else{
            System.out.println("Opção invalida ");

         }
         sc.close();
    }
  

}