
import java.util.LinkedHashMap;
import java.util.Map;

public class Ques4 {

    public static void main(String[] args) {

        Employee1 e1 = new Employee1(20, "Vikash", "SE");
        Employee1 e2 = new Employee1(228, "Vikas", "DE");
        Employee1 e3 = new Employee1(27, "Vivek", "AEM");
        Employee1 e4 = new Employee1(38,"Prakash","Android Developer");

        Map<Employee1, Integer> map = new LinkedHashMap<>();

        map.put(e1, 150);
        map.put(e2, 2000);
        map.put(e3, 3882);
        map.put(e4, 1855232);
        for (Employee1 key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }

}