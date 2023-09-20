abstract class Person {
    // Data members
    var adharId: Int = 0
    var name: String = ""
    var address: String = ""
    var phone: Int = 0
    var profession: String = ""

    // Constructor
    constructor(adharId: Int, name: String, address: String, phone: Int, profession: String) {
        this.adharId = adharId
        this.name = name
        this.address = address
        this.phone = phone
        this.profession = profession
    }

    // Abstract member functions
    abstract fun register(uid: Int): String
    abstract fun perform(duty: String): String
    abstract fun include(service: String): String
    abstract fun like(item: String): String
}

open class Student (adharId: Int, name: String, address: String, phone: Int, profession: String): Person (adharId, name, address, phone, profession) {
    // Data members
    val studentId: String = ""
    val major: String = ""
    val year: Int = 0
    val semester: Int = 0
    val college: String = ""
    val grade: Int = 0

    // Member Functions
    fun register(course: String): String {
        return("You have been registered in the course: " + course)
    }
    fun getGrade(grade: Int): Int{
        return grade
    }
    fun attend(sClass: String): String {
        return "$name is attending the class: $sClass"
    }
    fun learn(): String {
        return "$name is learning"
    }
    
    override fun register(uid: Int): String {
        return "$name is registering with UID: $uid"
    }
    override fun perform(duty: String): String {
        return "$name is performing the duty: $duty"
    }

    override fun include(service: String): String {
        return "$name is including the service: $service"
    }

    override fun like(item: String): String {
        return "$name likes the item: $item"
    }
}

open class Staff (adharId: Int, name: String, address: String, phone: Int, profession: String): Person (adharId, name, address, phone, profession) {
    // Data members
    val empId: String = ""
    val empRole: String = ""
    val empDept: String = ""
    val empSalary: Int = 0
    val empExperience: Int = 0

    // Member Functions
    fun attend(Duty: String): String {
        return "$name is attending to duty: $Duty"
    }
    fun getPromotion(): String {
        return "$name has been promoted"
    }
   	fun getSalary(): Int{
        return empSalary
    }
    
    override fun register(uid: Int): String {
        return "$name is registering with UID: $uid"
    }
    override fun perform(duty: String): String {
        return "$name is performing the duty: $duty"
    }

    override fun include(service: String): String {
        return "$name is including the service: $service"
    }

    override fun like(item: String): String {
        return "$name likes the item: $item"
    }
}
class PG_Student(adharId: Int, name: String, address: String, phone: Int, profession: String): Student (adharId, name, address, phone, profession){
	val rollNo: String = ""
    val specialization: String = ""
    
    fun submitThesis(): String{
        return "$name has submitted the thesis"
    }
}

class Faculty(adharId: Int, name: String, address: String, phone: Int, profession: String): Staff (adharId, name, address, phone, profession) {
    val facultySpecialization: String = ""
    val section: String = ""
    val noOfStudents: Int = 0
    val qualificaiton: String = ""

    fun Teach(Course: String): String{
        return "$name is teaching the course: $Course"
    }
    fun Assess(studentGrade: Int): String{
        return("Student grade has been assessed, Grade is: $studentGrade")
    }
}

class Technician(adharId: Int, name: String, address: String, phone: Int, profession: String): Staff (adharId, name, address, phone, profession) {
    val techType: String = ""


    fun maintain(lab: String): String{
        return("Lab maintained: $lab")
    }
    fun install(system: String): String{
        return("System has been installed: $system")
    }
}

fun main(){
    val student = Student(
        adharId = 987654321,
        name = "Alice Smith",
        address = "456 Elm Street",
        phone = 1234567890,
        profession = "Student",
    )
    
    
	println(student.register("Programming 101"))
    println(student.attend("Data Structures class"))
    println(student.learn())
   	
}
