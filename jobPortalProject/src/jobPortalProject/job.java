package jobPortalProject;

public class job {
	 private int id;
	    private String title;
	    private String description;
	    private int employerId;

	    public job(int id, String title, String description, int employerId) {
	        this.id = id;
	        this.title = title;
	        this.description = description;
	        this.employerId = employerId;
	    }

	    // Getters
	    public int getId() { return id; }
	    public String getTitle() { return title; }
	    public String getDescription() { return description; }
	    public int getEmployerId() { return employerId; }
}
