import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Raffle {
    private List<Toy> toys;

    public Raffle() {
        toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        this.toys.add(toy);
    }

    public void giveToy() throws IOException {
        Random rnd = new Random();

        boolean isToySelect = false;

        while(!isToySelect) {
            for (Toy toy : this.toys) {
                int chance = toy.GetToyDropRate() / 10;

                if(toy.GetToyQuantity() > 0) {
                    if(rnd.nextInt(1, 10) <= chance) {
                        new Logging(toy.GetToyTitle());
                        toy.ChangeQuantity("remove");

                        isToySelect = true;
                        break;
                    }
                } else {
                    toys.remove(toy);
                    break;
                }
            }
        }
    }
}
