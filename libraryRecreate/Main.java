package OOP_Basics.libraryRecreate;

import OOP_Basics.libraryRecreate.string.Manipulate;

public class Main {
    public static void main(String[] args) {
        Manipulate m = new Manipulate();
        String str = "Hello World!";
        m.setStr(str);
        m.print();
    }
}
