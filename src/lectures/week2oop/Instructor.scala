package lectures.week2oop

object ClassesTask {
    def main(args: Array[String]): Unit = {
        val instructor: Instructor = new Instructor(1, "вася", "пупкин")
        println(instructor.fullName())    // Вася Пупкин

        val course: Course = new Course(2, "Course Name", "1234", instructor)
        println(course.instructor.fullName())    // Вася Пупкин
        println(course.getID())    // 21
        println(course.isTaughtBy(instructor))    // true
        println(course.isTaughtBy(new Instructor(1, "Вася", "Пупкин")))    // false

        println(course.copyCourse("4321").releaseYear)    // 4321
    }

}


class Instructor(val id:Int, val name:String, val surname:String) {
    def fullName(): String = s"${this.name.split(' ').map(_.capitalize).mkString("")} ${this.surname.split(' ').map(_.capitalize).mkString("")}"
 
}
class Course(val courseID:Int, val title:String, var releaseYear:String, val instructor:Instructor){
    //возвращает id в формате courseID + instructor.id (например, если courseId = 1, а instructor.id = 2, то метод вернет 12)
    def getID(): String = s"${this.courseID}${this.instructor.id}"

    //isTaughtBy(instructor): проверяет, является ли указанный человек инструктором курса
    def isTaughtBy(instructor: Instructor): Boolean = {if(instructor==this.instructor) true else false}


    //copyCourse(newReleaseYear): возвращает новый экземпляр класса Course с обновленным значением поля releaseYear
    def copyCourse(newReleaseYear: String): Course = new Course(this.courseID,this.title, newReleaseYear, this.instructor)
}

/*

case class Instructor(id: Int, name: String, surname: String) {
    val fullName: String = s"${name.capitalize} ${surname.capitalize}"
}

case class Course(courseId: Int, title: String, releaseYear: String, instructor: Instructor) {
    def getId = s"$courseId${instructor.id}"
    def isTaughtBy(nstructor: Instructor) = this.instructor == instructor
    def copyCourse(newReleaseYear: String) = copy(releaseYear = newReleaseYear)
}

*/