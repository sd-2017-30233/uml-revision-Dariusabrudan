/**
 * Created by dariu on 3/8/2017.
 */
public class UsedFile implements File {
    private String name;
    public UsedFile(String n)
    {
        this.name=n;
        load(name);
    }
    public void display(){
        System.out.println("Se afiseaza continutul fisierului "+name);
    }
    public void load(String name)
    {
        System.out.println("Se incarca " + name);
    }
}
