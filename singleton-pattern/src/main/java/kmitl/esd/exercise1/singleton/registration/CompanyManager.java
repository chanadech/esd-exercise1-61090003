package kmitl.esd.exercise1.singleton.registration;

public class CompanyManager implements ICompanyManager {
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
