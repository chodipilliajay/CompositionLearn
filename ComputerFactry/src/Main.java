public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell",
                "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2540 x 1440");
        MotherBoard theMotherboard = new MotherBoard("BJ-200", "Asus", 4,
                6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                theCase, theMonitor, theMotherboard);

        //this is a one way of calling methods
//        thePC.getMonitor().drawPixelAt(10, 20, "pink");
//        thePC.getMotherBoard().loadProgram("Window OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}