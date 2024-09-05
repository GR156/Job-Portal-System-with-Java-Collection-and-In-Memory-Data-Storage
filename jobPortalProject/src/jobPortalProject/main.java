package jobPortalProject;

	import java.util.Scanner;

	public class main {
		public static void main(String[] args) { 
	        jobportal jobPortal = new jobportal();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("Welcome to the Online Job Portal");
	            System.out.println("1. Add Employer");
	            System.out.println("2. Add Job");
	            System.out.println("3. View Jobs");
	            System.out.println("4. Apply for Job");
	            System.out.println("5. View Applicants for a Job");
	            System.out.println("6. Exit");
	            System.out.print("Choose an option: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Employer Name: ");
	                    String empName = scanner.nextLine();
	                    System.out.print("Enter Employer Email: ");
	                    String empEmail = scanner.nextLine();
	                    jobPortal.addEmployer(empName, empEmail);
	                    break;
	                case 2:
	                    System.out.print("Enter Job Title: ");
	                    String jobTitle = scanner.nextLine();
	                    System.out.print("Enter Job Description: ");
	                    String jobDesc = scanner.nextLine();
	                    System.out.print("Enter Employer ID: ");
	                    int empId = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    jobPortal.addJob(jobTitle, jobDesc, empId);
	                    break;
	                case 3:
	                    jobPortal.viewJobs();
	                    break;
	                case 4:
	                    System.out.print("Enter Job ID: ");
	                    int jobId = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    System.out.print("Enter Applicant Name: ");
	                    String applicantName = scanner.nextLine();
	                    System.out.print("Enter Applicant Email: ");
	                    String applicantEmail = scanner.nextLine();
	                    jobPortal.applyForJob(jobId, applicantName, applicantEmail);
	                    break;
	                case 5:
	                    System.out.print("Enter Job ID: ");
	                    int viewJobId = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    jobPortal.viewApplicantsForJob(viewJobId);
	                    break;
	                case 6:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 6);

	        scanner.close();
	    }
	}


