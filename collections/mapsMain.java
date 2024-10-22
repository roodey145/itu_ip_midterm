package collections;

public class mapsMain {
    public static void main(String[] args) {
        Maps map = new Maps();

        Maps.Student abdul = map.new Student("abdulrahman mohsen", 25);
        Maps.Student jackub = map.new Student("jackub idk", 30);
        Maps.Student victoria = map.new Student("victoria jackub's brother", -3);

        map.addStudent(abdul);
        map.addStudent(jackub);
        map.addStudent(victoria);

        map.registerStudentToCourse("Math", abdul.getStudentID());
        map.registerStudentToCourse("Math", abdul.getStudentID());
        map.registerStudentToCourse("Math", jackub.getStudentID());
        map.registerStudentToCourse("Programming", jackub.getStudentID());
        map.registerStudentToCourse("Programming", abdul.getStudentID());
        map.registerStudentToCourse("Programming", victoria.getStudentID());

        map.displayCourseData("Math");
        map.displayCourseData("Programming");
        map.displayCourseData("Doesn'tExist");
    }
}
