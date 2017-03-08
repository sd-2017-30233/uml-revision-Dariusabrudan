/**
 * Created by dariu on 3/8/2017.
 */
public class ProxyFile implements File {
        private UsedFile usedFile;
        private String name;
        public ProxyFile(String n)
        {
            this.name=n;
        }
        public void display(){
            if(usedFile==null)
                usedFile=new UsedFile(name);
            usedFile.display();
        }
}
