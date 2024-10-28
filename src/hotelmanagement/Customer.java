package hotelmanagement;

public class Customer extends Person {

	private Room room;
	private String roomId;
	
	
	public Customer(String id, String name, String contactNum,Room room) {
		super(id, name, contactNum);
        this.room=room;
     }
	
    //customer rents a room
 	public void rentRoom() {
 		this.roomId=room.getRoomId();
 	}
	
	//implementation of absrtct cls method from person class
	@Override
	void show() {
			System.out.println("========Customer Information==========");
			System.out.println("Customer Id    :"+super.id);
			System.out.println("Customer Name    :"+super.name);
			System.out.println("Customer contact Number    :"+super.contactNum);
			System.out.println("Customer room id    :"+ roomId);



	}

	
	
	
}
