package jobPortalProject;

	import java.util.ArrayList;
	import java.util.List;

	public class jobportal {
	    private List<employer> employers = new ArrayList<>();
	    private List<job> jobs = new ArrayList<>();
	    private List<applicant> applicants = new ArrayList<>();
	    private int employerIdCounter = 1;
	    private int jobIdCounter = 1;
	    private int applicantIdCounter = 1;

	    // Methods for managing data
	    public void addEmployer(String name, String email) {
	        employer employer = new employer(employerIdCounter++, name, email);
	        employers.add(employer);
	        System.out.println("Employer added successfully!");
	    }

	    public void addJob(String title, String description, int employerId) {
	        job job = new job(jobIdCounter++, title, description, employerId);
	        jobs.add(job);
	        System.out.println("Job added successfully!");
	    }

	    public void viewJobs() {
	        System.out.println("Available Jobs:");
	        for (job job : jobs) {
	            System.out.println("ID: " + job.getId() + ", Title: " + job.getTitle() +
	                               ", Description: " + job.getDescription());
	        }
	    }

	    public void applyForJob(int jobId, String name, String email) {
	        applicant applicant = new applicant(applicantIdCounter++, name, email, jobId);
	        applicants.add(applicant);
	        System.out.println("Application submitted successfully!");
	    }

	    public void viewApplicantsForJob(int jobId) {
	        System.out.println("Applicants for Job ID " + jobId + ":");
	        for (applicant applicant : applicants) {
	            if (applicant.getJobId() == jobId) {
	                System.out.println("ID: " + applicant.getId() + ", Name: " + applicant.getName() +
	                                   ", Email: " + applicant.getEmail());
	            }
	        }
	    }
	}


