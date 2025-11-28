package Pessoa;
public class Pessoa{
   private String nome;
   private String endereco;
   private String telefone;


public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }



   public String getNome(){
    return this.nome;

   }

   public void setNome(String novoNome){
        this.nome=novoNome;
   }

   public String getEndereco(){
    return this.endereco;
   }

   public void  setEndereco(String novoEnderco){
        this.endereco = novoEnderco;
   }

   public String getTelefone(){
    return this.telefone;
   }

   public void setTelefone(String novoTelefone){
    this.telefone=novoTelefone;
   }

     public Pessoa(){

     }
   
}