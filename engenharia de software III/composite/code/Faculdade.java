public class Faculdade implements Integrante{
    private List<Integrante> integrantes;
    private int matricula;

    public Faculdade(){
        this.integrantes = new ArrayList<>();
        this.matricula = 0;
    }

    @Override
    public void matricularIntegrante(){
        System.out.println("Integrante da faculadade:"+this.matricula);
    }

   
    public void addIntegrante(Integrante integrantes){
        integrantes.add(integrante);
        this.matricula += integrante.getMatricula();
    }

    public List<Integrante> getMatricula(){
        return integrantes
    }

     @Override
    public int getMatricula(){
        return this.matricula;
    }
}