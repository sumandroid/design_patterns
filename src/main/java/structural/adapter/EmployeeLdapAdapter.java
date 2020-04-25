package structural.adapter;

public class EmployeeLdapAdapter implements Employee {

    private EmployeeLdap employeeLdap;

    public EmployeeLdapAdapter(EmployeeLdap employeeLdap){
        this.employeeLdap = employeeLdap;
    }

    @Override
    public String getId() {
        return employeeLdap.getUuid();
    }

    @Override
    public String getFirstName() {
        return employeeLdap.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeLdap.getSurName();
    }

    @Override
    public String getEmail() {
        return employeeLdap.getEmail();
    }
}
