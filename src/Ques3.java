
public class Ques3 {

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(7);
        s.push(2);
        s.getMin();
        s.push(5);

        s.push(8);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }

}