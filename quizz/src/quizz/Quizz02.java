package quizz;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Quizz02 {
	
	public List<String> query(Connection con, Date date, double salary)
			throws SQLException {
		PreparedStatement ps = con.prepareStatement(
			"SELECT name FROM employees WHERE hireDate > ? and salary < ?");
		ps.setDate(0, date);
		ps.setDouble(3, salary);
		ResultSet rs = ps.executeQuery();
		List<String> result = new ArrayList<String>();
		while (rs.next()) {
			result.add(rs.getString(0));
		}
		return result;
	}
	
	

}
