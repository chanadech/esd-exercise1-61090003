package kmitl.esd.exercise1.composite;

public class Main {
    /**
     * Main function for run composite pattern
     *
     * @return void
     */
    public static void main(String args[]) {
       BusinessUnit team1 = new Team(1, "Marketing department");
       BusinessUnit team2 = new Team(2, "System Plan department");
        BusinessUnit team3 = new Team(3, "Architecture Plan department");

        Department department = new Department(4, "Center department");

        department.addDepartment(team1);
        department.addDepartment(team2);
        department.addDepartment(team3);

        department.printDepartmentName();
    }
}
