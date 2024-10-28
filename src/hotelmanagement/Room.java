package hotelmanagement;

public abstract class Room {

	protected String roomId;
	protected int roomNum;
	protected double roomFare;
	
	
	public Room(String roomId, int roomNum, double roomFare) {
		super();
		this.roomId = roomId;
		this.roomNum = roomNum;
		this.roomFare = roomFare;
	}


	public String getRoomId() {
		return roomId;
	}


	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}


	public int getRoomNum() {
		return roomNum;
	}


	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}


	public double getRoomFare() {
		return roomFare;
	}


	public void setRoomFare(double roomFare) {
		this.roomFare = roomFare;
	}


	abstract void roomInfo();
	

}
