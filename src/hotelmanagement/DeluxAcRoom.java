package hotelmanagement;

public class DeluxAcRoom extends Room {
	
	double roomSize;

	public DeluxAcRoom(String roomId, int roomNum, double roomFare,double roomSize) {
		super(roomId, roomNum, roomFare);
		this.roomSize=roomSize;
	}

	@Override
	void roomInfo() {
System.out.println("========Delux Room Information=========");		
System.out.println("Room Id   : "+super.roomId);
System.out.println("Room Num   : "+super.roomNum);	
System.out.println("Room Fare   : "+super.roomFare);	
System.out.println("Room Size   : "+this.roomSize);	

System.out.println("..............");	

	}

}
