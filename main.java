package Practice;

public class main {
    public static void main(String[] args) {
        Student S1 = new Student();
        Tester T1 = new Tester();
        S1.setUniName("Daffodil International University");
        S1.setUniAddress("Birulia, Savar");
        S1.setDept("SWE");
        S1.setStuName("Esraq");
        S1.setStuCgpa(3.66);
        S1.display();
        T1.due();
        T1.pay();
        T1.haveToPay();
    }
}
