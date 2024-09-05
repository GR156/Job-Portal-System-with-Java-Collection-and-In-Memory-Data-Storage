package jobPortalProject;

public class applicant {
	    private int id;
	    private String name;
	    private String email;
	    private int jobId;

	    public applicant(int id, String name, String email, int jobId) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.jobId = jobId;
	    }

	    // Getters
	    public int getId() { return id; }
	    public String getName() { return name; }
	    public String getEmail() { return email; }
	    public int getJobId() { return jobId; }
	}


