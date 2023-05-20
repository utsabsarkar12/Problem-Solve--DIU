package Practice;

public class Student extends Dept{
    private String stuName;
    private double stuCgpa;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public double getStuCgpa() {
        return stuCgpa;
    }

    public void setStuCgpa(double stuCgpa) {
        this.stuCgpa = stuCgpa;
    }

    public void display(){
        System.out.println(""+getUniName());
        System.out.println(""+getUniAddress());
        System.out.println(""+getDept());
        System.out.println(""+getStuName());
        System.out.println(""+getStuCgpa());
    }
}
