package kmitl.esd.exercise1.singleton.simple;

public class CompanyManager {
    public static CompanyManager instance = null;

    protected CompanyManager() {

    }
    public static CompanyManager getInstance(){
        if (instance == null){
            synchronized (CompanyManager.class){
                if (instance == null)
                    instance = new CompanyManager();
            }
        }
        return instance;
    }
    public void doSthInstance() {
        System.out.println("Sth with the instance");
    }

    public static void doSth() {
        System.out.println("Sth");
    }
}
