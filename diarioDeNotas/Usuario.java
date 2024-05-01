import java.util.Scanner;

public class Usuario {
    private String nome;
    private int idade;
    private String email;
    private String tipoUsuario;

    Scanner sc = new Scanner(System.in);
    public void identificarUsuario() {

    System.out.println("Digite seu nome ");
    nome = sc.nextLine();
    
    System.out.println("Digite seu email ");
    email= sc.nextLine();

    System.out.println("Digite sua idade ");
    idade = sc.nextInt();

    }

    String getNome(){
        return nome;
       }
    
       
       public void setNome(String nome){
        this.nome = nome ;
       }
    
       public int getIdade(){
        return idade;
       }
    
       
       public void setIdade(int idade){
        this.idade = idade ;
       }
    
       public String getEmail(){
        return email;
       }
    
       
       public void setEmail(String email){
        this.email = email ;
       }

       public String getTipoUsuario(){
        return tipoUsuario;
       }
    
       
       public void setTipoUsuario(String tipoUsuario){
        this.tipoUsuario = tipoUsuario;
       }
}
