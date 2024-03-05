public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    public Student(String studentID, String studentName, int activitiesCount) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[activitiesCount];
    }

    
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }


    public String getStudentID() {
        return studentID;
    }

    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

   
    public String getStudentName() {
        return studentName;
    }

    
    public void addextraActivity(int index, String activity) {
        if (index >= 0 && index < extraActivities.length) {
            extraActivities[index] = activity;
        } else {
            System.out.println("Invalid index for extra activity.");
        }
    }

    
    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Name: " + studentName + ", Extra Activities: " + extraActivities;
    }
}