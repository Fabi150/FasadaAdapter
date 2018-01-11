public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addChestArmor (){
        System.out.println(this.name + " - Chest armor added.");
    }

    public void loadAbsBattery (){
        System.out.println(this.name + " - Abs battery loaded.");
    }

    public void assEngineService (){
        System.out.println(this.name + " - Ass engine fixed.");
    }
}
