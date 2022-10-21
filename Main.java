public class Main {
    public static void main(String[] args) {
        play(new Guitar());
    }

    public static void play(Playable playable){
        playable.play();
    }
}
