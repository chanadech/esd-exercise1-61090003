package kmitl.esd.exercise1.model.business;

// derived class, Company is the super class
// ForeignCompany inherits Company
// superclass is not an interface -> behavioral inheritance
public class ForeignCompany extends Company {
    // -> behavioral inheritance

    /**
     * get method for companytype
     * @return companytype
     */
    public CompanyType getCompanyType() {
        return CompanyType.FOREIGN;
    }

    public String getName() {
        return "Foreign Comp." + name;
    }
}
