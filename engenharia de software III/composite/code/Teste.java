public class Test{
    public static void main(String[] args) throws Exception{
        Faculdade faculadade = new Faculdade();
        Aluno joao = new Aluno('joão',"1234578","951258");
        Professor giuliano = new Professor('Giuliano',"8754156568","544155");

        Faculdade.addIntegrante(joao);
        Faculdade.addIntegrante(giuliano);
        Faculde.matricularIntegrante();
    }
}