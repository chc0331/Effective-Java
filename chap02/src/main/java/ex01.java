public class ex01 {
    public static void main(String[] args) {

        Job job1 = Job.developer();
        Job job2 = Job.doctor();
        System.out.println(job1.toString());
        System.out.println(job2.toString());

    }
}

//장점1. 이름을 가질 수 있다. 반환될 객체의 특성을 명확하게 나타낼 수 있다.
class Job {
    String name;
    int salary;

    public Job(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static Job developer(){
        return new Job("developer",400);
    }

    public static Job doctor(){
        return new Job("doctor",500);
    }

    @Override
    public String toString() {
        return "name : " + name + " / salary : " + salary;
    }
}
