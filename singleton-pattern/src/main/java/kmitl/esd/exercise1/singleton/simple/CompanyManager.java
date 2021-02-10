package kmitl.esd.exercise1.singleton.simple;

/**
 * Company manager which used singleton pattern
 */
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
}
