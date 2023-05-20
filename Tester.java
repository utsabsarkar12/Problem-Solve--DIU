package Practice;

public class Tester implements Account,Bank{
    double total = 71000;
    double clear = 56000;
    double newPay;

    public void due(){
        System.out.println(+total);
    }

    public void pay(){
        System.out.println(+clear);

    }
    public void haveToPay(){
        newPay = total-clear;
        System.out.println(+newPay);
    }

}
