import java.sql.DriverManager;
import java.util.Map;

//정적 팩토리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지  않아도 된다.
public class ex04 {
    public static void main(String[] args) {

        AConnector connector1 = AManager.getAConnector("mysql_db");
        AConnector connector2 = AManager.getAConnector("h2_db");

    }
}

interface AConnector {

}

class Ainfo{
    Map<String, AConnector> keyset;
    public AConnector connect(String url){
        return keyset.get(url);
    }
}

class AManager {
    static Ainfo ainfo  = new Ainfo();
    public static AConnector getAConnector(String url) {
        AConnector aConnector = ainfo.connect(url);
        return aConnector;
    }
}





