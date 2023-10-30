public class Teste {
    public static void main(String[] args) {
        Facade filme = new Facade();

        filme.playDvd("video.mp4");
        filme.amplificarSom("som.mp3");
        filme.projetarImagem("imagem.png");
    }
}