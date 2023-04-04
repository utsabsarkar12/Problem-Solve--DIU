package MidQues;

public class main {
    public static void main(String[] args) {
        Pets cat1 = new Pets();
        Pets cat2 = new Pets("Brown","Jumping");
        Pets cat3 = new Pets("Black");

        cat1.printPets();
        cat2.printPets();
        cat3.printPets();

        cat1.updateInfo("Gray");
        cat2.updateInfo(5);
        cat3.updateInfo("Cinnamon","Eating");

        cat1.printPets();
        cat3.printPets();


    }
}
