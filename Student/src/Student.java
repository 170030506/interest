
public class Student {
private String regno;
private String name;
private String subject;
/**
 * @return the regno
 */
public String getRegno() {
	return regno;
}
/**
 * @param regno the regno to set
 */
public void setRegno(String regno) {
	this.regno = regno;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the subject
 */
public String getSubject() {
	return subject;
}
/**
 * @param subject the subject to set
 */
public void setSubject(String subject) {
	this.subject = subject;
}
public static void main(String[] args) {
	Student studentobj=new Student();
	studentobj.setRegno("1421");
	studentobj.setName("suresh");
	studentobj.setSubject("java");
	System.out.println(studentobj.getRegno()+" "+studentobj.getName()+" "+studentobj.getSubject());
}
}
