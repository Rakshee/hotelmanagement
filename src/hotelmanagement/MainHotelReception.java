package hotelmanagement;

public class MainHotelReception {

	public static void main(String[] args) {
		DeluxAcRoom delux=new DeluxAcRoom("delux-23",11,5000.00,100.78);
		delux.roomInfo();
		StandardRoom standard=new StandardRoom("Standard-23",17,1200.00,false);
		standard.roomInfo();
		Customer customer=new Customer("19878","Kunu","9090909090",standard);
		customer.rentRoom();
		customer.show();
	}
}
