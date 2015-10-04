
public class Computer {

    private String outfit = "";

    public Computer(String choice) {
        if (choice.equals("1")) {
            setOutfit("標準配備");
        } else if (choice.equals("2")) {
            setOutfit("自選配備");
        }
    }

    public String getOutfit() {
        return outfit;
    }

    public void setOutfit(String outfit) {
        this.outfit = outfit;
    }

}
