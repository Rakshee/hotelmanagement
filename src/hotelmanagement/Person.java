package hotelmanagement;

public abstract class Person {
protected String id;
protected String name;
protected String contactNum;

public Person(String id,String name,String contactNum) {
	this.id=id;
	this.name=name;
	this.contactNum=contactNum;
	
}

abstract void show();

}
