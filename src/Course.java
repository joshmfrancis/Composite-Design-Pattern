/**
 * File: Course.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 02/23/2023
 * Java class description: This class is the helper method for the driver class,
 * "CourseTester.java". See CourseTester.java for more information. It uses the
 * methods, .addPreRequisite() and .getPreRequisites(), to fulfill the needs of
 * the driver class, adding a prerequisite and getting a prerequisite. This
 * class instantiates the object Course, which is used to hold course
 * information to print to the console. This project is an example of The
 * Composite Pattern Design.
 */

////////////
// Import //
////////////
import java.util.ArrayList;

/**
 * Main class 
 * Instantiates the Course Object created in the Driver class
 *
 * @author josh
 */
public class Course {

    ///////////////////////////
    // Variables And Objects //
    ///////////////////////////

    // Private Global Variables
    private String department;
    private String number;
    private String title;
    private String description;

    // Arraylist - Data Structure to hold preRequisites
    ArrayList<Course> preRequisites = new ArrayList<>();

    /////////////////
    // Constructor //
    /////////////////

    /**
     * Default Constructor - Department, Number, Title, and Description are
     * passed through from the driver class when an object is made.
     *
     * @param department
     * @param number
     * @param title
     * @param description
     */
    public Course(String department, String number, String title, String description)
    {
        // Passed in from the partameters
        // Changes local variables from the method to global variables for the
        // class
        this.department = department;
        this.number = number;
        this.title = title;
        this.description = description;
    }

    /////////////
    // Methods //
    /////////////

    /**
     * Method to add preRequisites
     * Adds the passed in course to the preRequisites ArrayList
     *
     * @param course
     */

    public void addPreRequisite(Course course)
    {
        // Added to ArrayList
        this.preRequisites.add(course);
    }

    /**
     * Method to get prerequisites
     * gets getPreRequisites from the toString method and ArrayList
     *
     * @return toPrint
     */
    public String getPreRequisites()
    {
        // variable to hold the department, number, and title of the course
        // when called
        String toPrint = this.toString() + "\n";

        // for loop to add to the toPrint String
        // for each course in the ArrayList...
        for (Course course : preRequisites)
        {
            // ...call the .getPreRequisites() to call the .toString() method
            // to add the course to the return statement of this method
            toPrint += course.getPreRequisites();
        }

        // returns the courses in a formatted String after the loop has run
        // through all of the courses in the ArrayList
        return toPrint;
    }

    /**
     * toString method to be called by the method getPreRequisites().
     *
     * @return this.department + this.number + ": " + this.title; (String)
     */
    @Override
    public String toString()
    {
        return this.department + this.number + ": " + this.title;
    }

}
