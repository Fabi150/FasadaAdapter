public class Main {

    public static void main(String[] args){
        Men mezczyzna = new Men("Marek");
        Women kobieta = new Women ("Gosia");
        Robot robot = new Robot ("Terminator");

        PersonFacade operacja = new PersonFacade(mezczyzna, kobieta, robot);
        operacja.fixChest();
        operacja.fixAbs();
        operacja.fixAss();
    }

}