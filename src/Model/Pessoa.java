package Model;

public  class Pessoa {   
public  String nome,endereco,telefone;
private  String cpf;


public Pessoa(){
}

  public Pessoa(String nome,String endereco, String cpf,String telefone) { 
 
  this.nome = nome;
  this.endereco = endereco;
  this.cpf = cpf;
  this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
  
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
    public double tirarCopia(double copia){
      
         double x = 0.50;
         copia = x;
         System.out.println("Valor da cópia");
         return copia ;
     }
    
   
    
}



