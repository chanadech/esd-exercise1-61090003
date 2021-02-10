package kmitl.esd.exercise1.model.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    /**
     * Test for company create
     */
    @Test
    void create() {
        Company company = Company.create(CompanyType.LOCAL);
        assertNotNull(company);

    }

    @Test
    void getId() {
    }

    @Test
    void setId() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void testSetName() {
    }

    @Test
    void getTaxId() {
    }
}