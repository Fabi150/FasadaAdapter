// Fasada dla obiektów Men, Women i Robot

public class PersonFacade {
    private Men men;
    private Women women;
    private Robot robot;

    RobotAdapter robotAdapter;

    public PersonFacade(Men men, Women women, Robot robot) {
        this.men = men;
        this.women = women;
        this.robot = robot;
        this. robotAdapter = new RobotAdapter(robot);
    }

    public void fixChest (){
        this.men.sizeChestUp();
        this.women.syliconBoobs();
        robotAdapter.sizeChestUp();
    }

    public void fixAbs (){
        this.men.shapeAbs();
        this.women.absLiposuction();
        robotAdapter.shapeAbs();
    }

    public void fixAss (){
        this.men.shapeAss();
        this.women.assSizeUpp();
        robotAdapter.shapeAss();
    }
}
