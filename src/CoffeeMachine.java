import java.security.PublicKey;

public class CoffeeMachine {

    private String model;
    private String make;

    public CoffeeMachine (String make, String model) {
        this.make = make;
        this.model = model;
    }
    public void hotWater () {
        heatWater();
        pourWater();
        System.out.println("Serving hot water");
    }
    public void expresso () {
        heatWater();
        pourWater();
        grindBeans();
        System.out.println("Espresas tau");
    }
    public void americana (){
        expresso();
        hotWater();
        System.out.println("Serving americana");
    }

    private void grindBeans () {
        System.out.println("> Grinding beans");
    }
    private void heatWater () {
        System.out.println("> Heating water");
    }
    private void pourWater () {
        System.out.println("Pouring water");
    }

    public String getModel () {
        return this.model;
    }

    public String getMake () {
        return this.make;
    }
    public static void main (String[] args) {
        CoffeeMachine machine = new CoffeeMachine("Jura", "Z8");
        machine.hotWater();
        machine.expresso();
        machine.americana();
    }
}
