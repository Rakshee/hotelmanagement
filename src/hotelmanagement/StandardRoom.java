package hotelmanagement;

public class StandardRoom extends Room{

	

	boolean ac_availability;
	
	public StandardRoom(String roomId, int roomNum, double roomFare,boolean ac_availability) {
		super(roomId, roomNum, roomFare);
		this.ac_availability=ac_availability;
	}

	@Override
	void roomInfo() {
		System.out.println("=========Standard Room Information===========");
		System.out.println("Room Id     : "+super.roomId);
		System.out.println("Room Number     : "+super.roomNum);
		System.out.println("Room Fare     : "+super.roomFare);
		System.out.println("Ac availability    : "+ac_availability);
		System.out.println("...........");
	}
	
}
