package MidQues;

public class Pets {
    String color = "White";
    String habit = "Sitting";
    int num = 5;

    Pets(){
        this.color = color;
        this.habit = habit;
    }
    Pets(String color, String habit){
        this.color = color;
        this.habit = habit;
    }
    Pets(String color){
        this.color = color;
        this.habit = habit;
    }

    void printPets(){
        System.out.println(color+" Cat is "+habit);
    }

    void updateInfo(String color){
        this.color = color;
    }
    void updateInfo(int num){
        this.num = num;
        System.out.println("Brown Cat's weight is now 5kg");
    }
    void updateInfo(String color,String habit){
        this.color = color;
        this.habit = habit;
    }

}