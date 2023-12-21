public class Toy {
    private int toyId;
    private String toyTitle;
    private int quantity;
    private int dropRate;

    public Toy(int id, String title, int quantity, int rate) {
        this.toyId = id;
        this.toyTitle = title;
        this.quantity = quantity;
        this.dropRate = rate;
    }

    public void ChangeRate(int rate) {
        this.dropRate = rate;
    }

    public void ChangeQuantity(String operation, int quantity) {
        switch (operation) {
            case "add":
                this.quantity += quantity;
                break;
            case "remove":
                this.quantity -= quantity;
                break;
        }
    }

    public void ChangeQuantity(String operation) {
        this.ChangeQuantity(operation, 1);
    }

    public int GetToyId() {
        return this.toyId;
    }

    public int GetToyDropRate() {
        return this.dropRate;
    }

    public String GetToyTitle() {
        return this.toyTitle;
    }

    public int GetToyQuantity() {
        return this.quantity;
    }
}
