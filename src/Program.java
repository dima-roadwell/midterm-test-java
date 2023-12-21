import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        Raffle raffle = new Raffle();
        raffle.addToy(new Toy(1, "Машинка", 3, 60));
        raffle.addToy(new Toy(2, "Кукла", 2, 20));
        raffle.addToy(new Toy(3, "Юла", 5, 20));

        int raffleCount = 10;
        
        for(int i = 0; i < raffleCount; i++) {
            raffle.giveToy();
        }
    }
}
