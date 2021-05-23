//하위 자료형 객체를  반환할 수 있다.
//입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
public class ex03 {
    public static void main(String[] args) {

        Job3 job =  Job3.createJob(2);
        System.out.println(job.toString());
    }
}

class Job3 {

    String name;
    int salary;

    public Job3(String name, int salary){
        this.name=name;
        this.salary=salary;
    }

    public static Job3 createJob(int type){
        switch (type){
            case 0:
                return new developer("developer",400);
            case 1:
                return new doctor("doctor",500);
            case 2:
                return new designer("designer",200);
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return name  + " "+salary;
    }
}

class developer extends Job3{
    public developer(String name, int salary) {
        super(name, salary);
    }
}

class doctor extends Job3{
    public doctor(String name, int salary){
        super(name, salary);
    }

}

class designer extends Job3 {
    public designer(String name, int salary) {
        super(name, salary);
    }
}
