public class ProfileCard {
    public static void main(String[] args) {

        // Storing each field in separate String variables
        String courseTitle = "CS 234 – JAVA PROFILE CARD";
        String name = "Ibrahim Mohamed";
        String studentId = "2024-04-07052";
        String year = "2nd Year";
        String background = "I know java from CS 175 and have built small web projects.";
        String goal = "I want to build a Java app by the end of this course.";
        String funFact = "I can stay under water for half a hour.";

        // Printing formatted profile card
        System.out.println("==================================================");
        System.out.println("        " + courseTitle);
        System.out.println("==================================================");

        System.out.println("Name        : " + name);
        System.out.println("Student ID  : " + studentId);
        System.out.println("Year        : " + year);

        System.out.println("--------------------------------------------------");

        System.out.println("Background  : " + background);

        System.out.println("--------------------------------------------------");

        System.out.println("Goal        : " + goal);

        System.out.println("--------------------------------------------------");

        System.out.println("Fun Fact    : " + funFact);

        System.out.println("==================================================");
    }
}