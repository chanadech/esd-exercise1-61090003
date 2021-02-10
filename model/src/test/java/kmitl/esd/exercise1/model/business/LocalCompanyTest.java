package kmitl.esd.exercise1.model.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalCompanyTest {

    private static LocalCompany localCompany;

    @BeforeEach
    void setUp() {
        localCompany = new LocalCompany();
    }

    @Test
    void getCompanyType() {
        assertEquals(localCompany.getCompanyType(),CompanyType.LOCAL);
    }

    @Test
    void getName() {
    }

    @Test
    void something() {
    }
}