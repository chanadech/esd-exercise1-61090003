package kmitl.esd.exercise1;

import kmitl.esd.exercise1.singleton.simple.CompanyManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyManagerTest {

    /**
     * test for checking which CompanyManger is not null
     */
    @Test
    void getInstance() {
        assertNotEquals(CompanyManager.getInstance(), null);
    }
}