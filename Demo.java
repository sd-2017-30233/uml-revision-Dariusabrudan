/**
 * Created by dariu on 3/8/2017.
 */
public class Demo {
    public static void main(String[] args) {
        File f = new ProxyFile("fisier_test.txt");

        //file loaded from disk
        f.display();
        System.out.println("");

        //file not used from disk
        f.display();
    }
}