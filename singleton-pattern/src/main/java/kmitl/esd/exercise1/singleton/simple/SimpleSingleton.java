package kmitl.esd.exercise1.singleton.simple;

import java.util.logging.Logger;

public class SimpleSingleton {

    /**
     * the main for Singleton pattern
     *
     * @return void
     */
    public static void main(String args[]) {
        CompanyManager companyManager = CompanyManager.getInstance();
        Logger.getLogger(SimpleSingleton.class.getName()).info("Simple singleton pattern : " + companyManager);
    }
}
