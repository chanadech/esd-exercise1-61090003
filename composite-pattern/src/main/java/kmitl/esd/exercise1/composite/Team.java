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
}
