package kmitl.esd.exercise1.composite;

import java.util.logging.Logger;

public class Team implements BusinessUnit{
    private Integer id;
    private String name;
    public Team(Integer id,String name){
        this.id = id;
        this.name = name;
    }


    /**
     * A function for print the team details
     *
     * @return void
     */
    @Override
    public void printDepartmentName() {
        Logger.getLogger(Team.class.getSimpleName()).info(" -> Team " + name);

    }

    /**
     * get method for id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * set method for id
     * @return void
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get method for name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * set method for name
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }
}
