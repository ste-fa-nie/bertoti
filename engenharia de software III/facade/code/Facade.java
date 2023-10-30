class Facade {
    private amplificador Amplificador;
    private dvdPlayer DvdPlayer;
    private projetor Projetor;

    public Facade() {
        amplificador = new Amplificador();
        dvdPlayer = new DvdPlayer();
        projetor = new Projetor();
    }

    public void amplificarSom(String audioFile) {
        amplificador.amplificarSom(audioFile);
    }

    public void playDvd(String videoFile) {
        dvdPlayer.playDvd(videoFile);
    }

    public void projetarImagem(String imageFile) {
        projetor.projetarImagem(imageFile);
    }
}