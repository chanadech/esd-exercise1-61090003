package kmitl.esd.exercise1.composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements BusinessUnit {
    private Integer id;
    private String name;

    private List<BusinessUnit> childBusinessUnits;

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childBusinessUnits = new ArrayList<>();
    }

    /**
     * A function for print the department details
     *
     * @return void
     */
    public void printDepartmentName() {
        childBusinessUnits.forEach(BusinessUnit::printDepartmentName);
    }

    /**
     * A function for add a department
     *
     * @param businessUnit department to add
     * @return void
     */
    public void addDepartment(BusinessUnit businessUnit) {
        childBusinessUnits.add(businessUnit);
    }

    /**
     * A function for removing a department
     *
     * @param businessUnit department to remove
     * @return void
     */
    public void removeDepartment(BusinessUnit businessUnit) {
        childBusinessUnits.remove(businessUnit);
    }

}
