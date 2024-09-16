package string;

public class Manipulate {
    private String str;

    public Manipulate() {
        this.str = "";
    }

    public void setStr(String str1) {
        this.str = str1;
    }

    public void print() {
        System.out.println(this.str);
    }

    public int len() {
        int count = 0;
        char newStr[] = this.str.toCharArray();
        for (char c : newStr)
            count++;
        return count;
    }

    public String substr(String findStr, int size) {
        char src[] = this.str.toCharArray();
        char sub[] = findStr.toCharArray();
        String foundSub = "";
        int index = 0;
        for (char e : src) {
            index++;
            if (e == sub[0]) {
                break;
            }
        }
        if (index != size) {
            index -= 1;
            for (int i = index; i < size; i++) {
                foundSub = foundSub.concat(Character.toString(src[i]));
            }
            return foundSub;
        } else {
            return null;
        }
    }
}
