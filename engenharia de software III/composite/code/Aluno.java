public class Aluno implements Integrante{
    private String nome;
    private int RG;
    private int matricula;

    public Scruchie(String nome, int RG, int matricula){
        this.nome = nome;
        this.RG = RG;
        this.matricula = matricula;
    }

    public String getnome(){
        return this.nome;
    }
    public int getRG(){
        return this.RG;
    }
    public int getmatricula(){
        return this.matricula;
    }

    public void setnome(String nome){
        this.nome = nome;
    }
    public void setRG(int matricula){
        this.RG = RG;
    }
    public void setmatricula(int nome){
        this.matricula = matricula;
    }

    @Override
  public void matricularIntegrante() {
    System.out.println("Matriculando integrante " + this.nome + ". Matricula: " + this.matricula);
  }
}