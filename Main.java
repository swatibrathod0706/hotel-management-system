public class Main {
    public static void main(String[] args) {

        HotelDAO dao = new HotelDAO();

        Booking b1 = new Booking(1, "Swati", 101, 2000);
        dao.addBooking(b1);

    }
}
