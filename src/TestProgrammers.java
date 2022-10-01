public class TestProgrammers {

    public static void main(String[] args) {
        Programmer pino = new Programmer();
        pino.name = "Pino";
        pino.age = 36;
        pino.wearsGlasses = false;

        Programmer maria = new Programmer();
        maria.name = "Maria";
        maria.age = 99;
        maria.wearsGlasses = true;

        pino.drinkCofee();
        pino.printDetails();

        maria.printDetails();
        maria.hasGlasses();
    }
}