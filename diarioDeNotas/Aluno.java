import java.util.Scanner;

public class Aluno extends Usuario{

    int ra;
    String telefone;
    Scanner sc = new Scanner(System.in);

    @Override
    public void identificarUsuario(){
    super.identificarUsuario();
    
        System.out.println("Digite a seu ra");
        ra = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o seu telefone");
        telefone = sc.nextLine();

        sc.close();

    }
}