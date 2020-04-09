//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Commands;

public class NotEnough {
    public NotEnough() {
    }

    public static boolean checkParametrs(String[] strings, int a) {
        if (strings.length != a) {
            System.out.println("Неверное число параметров. Нужно " + a);
            return false;
        } else {
            return true;
        }
    }
}
S