
public class Employee {
private String empno;
private String empNme;
private Address addressobj;
/**
 * @return the empno
 */
public String getEmpno() {
	return empno;
}
/**
 * @param empno the empno to set
 */
public void setEmpno(String empno) {
	this.empno = empno;
}
/**
 * @return the empNme
 */
public String getEmpNme() {
	return empNme;
}
/**
 * @param empNme the empNme to set
 */
public void setEmpNme(String empNme) {
	this.empNme = empNme;
}
/**
 * @return the addressobj
 */
public Address getAddressobj() {
	return addressobj;
}
/**
 * @param addressobj the addressobj to set
 */
public void setAddressobj(Address addressobj) {
	this.addressobj = addressobj;
}
public static void main(String[] args) {
     Address addressobj=new Address();
	addressobj.setCity("Vijayawada");
	addressobj.setState("ap");
	addressobj.setCountry("india");
	Employee empobj=new Employee();
	empobj.setEmpno("1421");
	empobj.setEmpNme("suresh");
	empobj.setAddressobj(addressobj);
System.out.println(empobj.getEmpno()+""+empobj.getEmpNme()+""+empobj.getAddressobj().getCity());
}
}
