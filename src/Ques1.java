
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ques1 {

    public static void main(String[] args) {
        List<Float> list = new ArrayList<>();
        list.add(1.7f);
        list.add(1.6f);
        list.add(1.5f);
        list.add(1.3f);
        list.add(1.4f);
        Iterator<Float> it = list.iterator();
        double multiplyNumber = 1;
        while(it.hasNext()) {
            multiplyNumber+=it.next();
        }
        System.out.println(multiplyNumber);

    }

}
