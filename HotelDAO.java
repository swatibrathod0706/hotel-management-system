import java.sql.*;

public class HotelDAO {

    public void addBooking(Booking b) {
        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO booking VALUES(?,?,?,?)"
            );

            ps.setInt(1, b.id);
            ps.setString(2, b.name);
            ps.setInt(3, b.roomNo);
            ps.setDouble(4, b.amount);

            ps.executeUpdate();
            System.out.println("Booking Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
