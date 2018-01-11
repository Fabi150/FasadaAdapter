public class Men {
    private String name;

    public Men(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sizeChestUp (){
        System.out.println(this.name + " - Synthol injection to chest added.");
    }

    public void shapeAbs (){
        System.out.println(this.name + " - Testosterone injection added.");
    }

    public void shapeAss (){
        System.out.println(this.name + " - Silicon implants added to ass");
    }
}
