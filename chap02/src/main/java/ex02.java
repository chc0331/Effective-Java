
//호출될때마다 인스턴스를 새로 생성하지 않아도 된다.
public class ex02 {

    public static void main(String[] args) {
        Job2 dev1 = Job2.developer();
        Job2 dev2 = Job2.developer();

        if(dev1.equals(dev2)){
            System.out.println("same");
        }else{
            System.out.println("diff");
        }

    }
}

class Job2 {
    String name;
    int salary;
    private static Job2 dev;
    private static Job2 doc;

    public Job2(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static Job2 developer() {
        if (dev == null) {
            dev = new Job2("developer", 400);
        }
        return dev;
    }

    public static Job2 doctor() {
        if (doc == null) {
            doc = new Job2("doctor", 500);
        }
        return doc;
    }

}

