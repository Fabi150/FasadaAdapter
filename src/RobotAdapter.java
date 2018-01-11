// Adapter z Men na Robot

public class RobotAdapter {

    private Robot robot;

    public RobotAdapter(Robot robot) {
        this.robot = robot;
    }

    public String getName() {
        return robot.getName();
    }

    public void setName(String name) {
        robot.setName(name);
    }

    public void sizeChestUp() {
        robot.addChestArmor();
    }

    public void shapeAbs() {
        robot.loadAbsBattery();
    }

    public void shapeAss() {
        robot.assEngineService();
    }
}
