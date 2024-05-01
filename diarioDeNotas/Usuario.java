import java.util.Scanner;

public class Usuario {
    private String nome;
    private int idade;
    private String email;
    private String tipoUsuario;
    private int notaA1 = 70;
    private int notaA2 = 30;
    private int notaA3 =40;

    Scanner sc = new Scanner(System.in);

    public void identificarUsuario() {
      System.out.println("Digite seu nome ");
      nome = sc.nextLine();
    
      System.out.println("Digite seu email ");
      email= sc.nextLine();

      System.out.println("Digite sua idade ");
      idade = sc.nextInt();

    }
    public void visualizarNotas(){
        System.out.println("Escolha a nota que deseja visualizar: ");
        System.out.println("1. A1");
        System.out.println("2. A2");
        System.out.println("3. A3");
        int escolha = sc.nextInt();

        switch(escolha){
            case 1:
                System.out.println("Nota A1: " + notaA1);
                break;
            case 2:
                System.out.println("Nota A2: " + notaA2);
                break;
            case 3:
                System.out.println("Nota A3: " + notaA3);
                break;
            default:
                System.out.println("Opção Inválida " );
        }
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
