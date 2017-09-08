import java.util.Date;
import java.io.*
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	ArrayList<Integer> al = new ArrayList<Student>();
	
	
	}
	

	@Override
	public Student[] getStudents() {
Student[] s=al.toArray();
		return(s);
	}

	@Override
	public void setStudents(Student[] students) {
ArrayList<Integer> bl = new ArrayList<Student>(students.length);	
	al.addAll(bl);
	}

	@Override
	public Student getStudent(int index) {
		Student[] stud=new Student(Student[] students)
		Student s1=al.get(index);
		
		return s1;
	}

	@Override
	public void setStudent(Student student,int index) {
	al.set(Student student,int index)
	
	}

	@Override
	public void addFirst(Student student) {
		al.add(1,Student student);
	}

	@Override
	public void addLast(Student student) {
		al.add(al.size(),Student student);
	}

	@Override
	public void add(Student student, int index) {
	al.add(index,Student student);
	}

	@Override
	public void remove(int index) {
		al.remove(index);
	}

	@Override
	public void remove(Student student) {
		al.remove(student);
	}

	@Override
	public void removeFromIndex(int index) {
	al.remove(index,al.size());
	}

	@Override
	public void removeFromElement(Student student) {
		al.remove(student,al.size());
	}

	@Override
	public void removeToIndex(int index) {
				al.remove(1,index);
	}

	@Override
	public void removeToElement(Student student) {
al.remove(1,student);
	}

	@Override
	public void bubbleSort() {
		Collections.sort(al);
	}

	@Override
	public Student[] getByBirthDate(Date date) {

Student[] s=al.toArray();
Student d[]=new Student[s.length]
for(int i=0;i<s.length;i++)
{
	if(d==birthDate)
	{	d[i]=s[i];
	
		
	}
}
return d;
	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
tudent[] s=al.toArray();
Student d[]=new Student[s.length]
for(int i=0;i<s.length;i++)
{
	if(d==birthDate)
	{	d[i]=s[i];
	
		
	}
}
return d;
		return null;
	

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
	 
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
list.getNextSunday	 
		 return null;
	}
}
