public class PersonalComputer extends Product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;
    //you can see the obvious advantage here, because if you use extends option to inherit,
    //java only lets you inherit from one class at a time. You could see, that we'd run into difficulties
    //and limitations quite quickly, if our only tool was inheritance.
    //we should add constructor

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase,
                            Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");
    } //making this private because only one method, is the personal computer itself.a
    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }
}
