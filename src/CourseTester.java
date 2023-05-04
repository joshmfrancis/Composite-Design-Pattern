/**
 * File: CourseTester.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 02/23/2023
 * Java class description: This class is the driver class for this project. This
 * class uses the helper class, "Course.java" for its methods. See Course.java
 * for more information. This class makes courses and calls the
 * .addPreRequisite() method to add them to the hierarchy of needed
 * prerequisites. Then, the program calls the .getPreRequisites() method to get
 * the needed prerequisites of the course CSC 285. This course! This project is
 * an example of The Composite Pattern Design.
 */

/**
 * Main class
 *
 * @author josh
 */
public class CourseTester
{

    /**
     * Main method to create the course objects, add them to the prerequisites,
     * and print them to the console.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Creates new course objects with the parameters for
        // (Department, Number, Title, Description)
        Course CSC285 = new Course("CSC", "285", "OOD", "Object Oriented Design");
        Course CSC145 = new Course("CSC", "145", "Java II", "Java I");
        Course CSC135 = new Course("CSC", "135", "Java I", "Java II");
        Course CSC120 = new Course("CSC", "120", "Intro CS", "Intro to Computer Science");
        Course MATH101 = new Course("MATH", "101", "College Algebra", "College Algebra");

        // Adds the course (in the parameters) to the Course object
        // (dot operated on) as a prerequisite
        CSC285.addPreRequisite(CSC145);
        CSC145.addPreRequisite(CSC135);
        CSC135.addPreRequisite(CSC120);
        CSC135.addPreRequisite(MATH101);

        // prints the CSC 285 prerequisites formatted from the
        // .getPreRequisites() method to the console
        // CSC 285 has a prerequisite of CSC 145, 135, 120, and Math 101, so it
        // prints all of those prerequisite formatted
        System.out.println(CSC285.getPreRequisites());
    }

}
