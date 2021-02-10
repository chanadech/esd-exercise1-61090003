package kmitl.esd.exercise1.model.business;

/**
 * Superclass for the company inh. tree
 */
public abstract class Company implements ICompany {

    private String taxId;

    /**
     * factory method for subclasses
     * @param companyType type of the company
     * @return return an object of the company type
     */
    public static Company create(CompanyType companyType) {
        Company company = null;
        switch (companyType) {
            case LOCAL :
                company = new LocalCompany();
            case FOREIGN :
                company = new ForeignCompany();
        };
        return company;
    }

    // fields
    protected long id;
    protected String name;

    // Constructor
    public Company() {
    }

    /**
     * method for getting id
     *
     * @return id
     */
    public long getId() {
        return id;
    }



    /**
     * method for setting id
     *
     * @param id company id
     * @return void
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * method for get name
     *
     * @return name
     */
    public String getName() {
        return name;
    }


    public String setName() {
        return null;
    }

    /**
     * method for set name
     *
     * @param name company name
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *  method for get taxid
     * @return taxId
     */
    public String getTaxId() {
        return this.taxId;
    }
}
