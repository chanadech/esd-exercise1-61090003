package kmitl.esd.exercise1.singleton.simple;

import java.util.logging.Logger;

public class SimpleSingleton {
    public static void main(String args[]) {
        CompanyManager companyManager = CompanyManager.getInstance();
        Logger.getLogger(SimpleSingleton.class.getName()).info("Simple singleton pattern company manager: " + companyManager);
    }
}
