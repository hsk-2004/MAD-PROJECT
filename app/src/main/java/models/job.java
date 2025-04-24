public class Job {
    private String title, company, type, location, salary;

    public Job(String title, String company, String type, String location, String salary) {
        this.title = title;
        this.company = company;
        this.type = type;
        this.location = location;
        this.salary = salary;
    }

    public String getTitle() { return title; }
    public String getCompany() { return company; }
    public String getType() { return type; }
    public String getLocation() { return location; }
    public String getSalary() { return salary; }
}
