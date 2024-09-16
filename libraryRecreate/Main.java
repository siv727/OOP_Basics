import string.Manipulate;

public class Main {
    public static void main(String[] args) {
        Manipulate m = new Manipulate();
        String str = "Hello World!";
        String str2 = "ginger";
        m.setStr(str);
        m.print();
        System.out.println(m.len());
        System.out.println(m.substr(str2, m.len()));
    }
}
