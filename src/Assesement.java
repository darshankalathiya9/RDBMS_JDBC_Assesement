import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// Create Class AddCourse for Performed Add Course Action
class AddCourse implements ActionListener {
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2, t3, t4, t5;
	JButton j1;

	// Create Constructor
	AddCourse() {
		// Set Frame Dimension, Visibility & Layout
		JFrame fr1 = new JFrame("Add Coruse");
		fr1.setVisible(true);
		fr1.setLayout(null);
		fr1.setSize(1000, 700);

		l1 = new JLabel("Coruse ID");
		l1.setBounds(100, 100, 150, 20);
		fr1.add(l1);
		l2 = new JLabel("Coruse Name");
		l2.setBounds(100, 130, 150, 20);
		fr1.add(l2);
		l3 = new JLabel("Coruse Fees");
		l3.setBounds(100, 160, 150, 20);
		fr1.add(l3);
		l4 = new JLabel("Coruse Duration");
		l4.setBounds(100, 190, 150, 20);
		fr1.add(l4);
		l5 = new JLabel("Coruse Detail");
		l5.setBounds(100, 220, 150, 20);
		fr1.add(l5);

		t1 = new JTextField();
		t1.setBounds(250, 100, 150, 20);
		fr1.add(t1);
		t2 = new JTextField();
		t2.setBounds(250, 130, 150, 20);
		fr1.add(t2);
		t3 = new JTextField();
		t3.setBounds(250, 160, 150, 20);
		fr1.add(t3);
		t4 = new JTextField();
		t4.setBounds(250, 190, 150, 20);
		fr1.add(t4);
		t5 = new JTextField();
		t5.setBounds(250, 220, 150, 20);
		fr1.add(t5);

		j1 = new JButton("Submit");
		j1.setBounds(175, 260, 150, 20);
		fr1.add(j1);

		// Make Button Clicked To EventTable
		j1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// If User Clicked Submit Button Than Registration Action Performed.
		if (e.getSource() == j1) {
			System.out.println("Submit button clicked.");

			// Fetch Data From User Input
			int ID = Integer.parseInt(t1.getText());
			String Name = t2.getText();
			int Fees = Integer.parseInt(t3.getText());
			String Duration = t4.getText();
			String Detail = t5.getText();

			try {
				// Provide Connectivity : User Input Is Stored Into Database Table
				Connection connection = Assesement.createconnection();
				String sql = "insert into course (ID, Name, Fees, Duration, Detail) values (?,?,?,?,?)";
				PreparedStatement pst = connection.prepareStatement(sql);

				// Data Set Into Table
				pst.setInt(1, ID);
				pst.setString(2, Name);
				pst.setInt(3, Fees);
				pst.setString(4, Duration);
				pst.setString(5, Detail);
				pst.executeUpdate();

				// If Registration Succesfully, than Print console Messege & SetText Empty.
				System.out.println("Registration Succesfully.");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");

			} catch (Exception e2) {
				// If Exception Is Generated Than Handle by printStackTrace.
				e2.printStackTrace();
			}
		}
	}
}

//Create Class ViewCourse for Performed View all Course
class ViewCourse implements ActionListener {
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2, t3, t4, t5;
	JButton j1;

	// Create Constructor
	ViewCourse() {
		// Set Frame Dimension, Visibility & Layout
		JFrame fr1 = new JFrame("Add Coruse");
		fr1.setVisible(true);
		fr1.setLayout(null);
		fr1.setSize(1000, 700);

		l1 = new JLabel("Coruse ID");
		l1.setBounds(100, 100, 150, 20);
		fr1.add(l1);
		l2 = new JLabel("Coruse Name");
		l2.setBounds(100, 130, 150, 20);
		fr1.add(l2);
		l3 = new JLabel("Coruse Fees");
		l3.setBounds(100, 160, 150, 20);
		fr1.add(l3);
		l4 = new JLabel("Coruse Duration");
		l4.setBounds(100, 190, 150, 20);
		fr1.add(l4);
		l5 = new JLabel("Coruse Detail");
		l5.setBounds(100, 220, 150, 20);
		fr1.add(l5);

		t1 = new JTextField();
		t1.setBounds(250, 100, 150, 20);
		fr1.add(t1);
		t2 = new JTextField();
		t2.setBounds(250, 130, 150, 20);
		fr1.add(t2);
		t3 = new JTextField();
		t3.setBounds(250, 160, 150, 20);
		fr1.add(t3);
		t4 = new JTextField();
		t4.setBounds(250, 190, 150, 20);
		fr1.add(t4);
		t5 = new JTextField();
		t5.setBounds(250, 220, 150, 20);
		fr1.add(t5);

		j1 = new JButton("Submit");
		j1.setBounds(175, 260, 150, 20);
		fr1.add(j1);

		// Make Button Clicked To EventTable
		j1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// If User Clicked Submit Button Than Registration Action Performed.
		if (e.getSource() == j1) {
			System.out.println("Submit button clicked.");

			// Fetch Data From User Input
			int ID = Integer.parseInt(t1.getText());
			String Name = t2.getText();
			int Fees = Integer.parseInt(t3.getText());
			String Duration = t4.getText();
			String Detail = t5.getText();

			try {
				// Provide Connectivity : User Input Is Stored Into Database Table
				Connection connection = Assesement.createconnection();
				String sql = "insert into course (ID, Name, Fees, Duration, Detail) values (?,?,?,?,?)";
				PreparedStatement pst = connection.prepareStatement(sql);

				// Data Set Into Table
				pst.setInt(1, ID);
				pst.setString(2, Name);
				pst.setInt(3, Fees);
				pst.setString(4, Duration);
				pst.setString(5, Detail);
				pst.executeUpdate();

				// If Registration Succesfully, than Print console Messege & SetText Empty.
				System.out.println("Registration Succesfully.");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");

			} catch (Exception e2) {
				// If Exception Is Generated Than Handle by printStackTrace.
				e2.printStackTrace();
			}
		}
	}
}

class FetchSearch {
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2, t3, t4, t5;

	FetchSearch() {
		// Set Frame Dimension, Visibility & Layout
		JFrame fr1 = new JFrame(" Coruse");
		fr1.setVisible(true);
		fr1.setLayout(null);
		fr1.setSize(1000, 700);

		l1 = new JLabel("Coruse ID");
		l1.setBounds(100, 100, 150, 20);
		fr1.add(l1);
		l2 = new JLabel("Coruse Name");
		l2.setBounds(100, 130, 150, 20);
		fr1.add(l2);
		l3 = new JLabel("Coruse Fees");
		l3.setBounds(100, 160, 150, 20);
		fr1.add(l3);
		l4 = new JLabel("Coruse Duration");
		l4.setBounds(100, 190, 150, 20);
		fr1.add(l4);
		l5 = new JLabel("Coruse Detail");
		l5.setBounds(100, 220, 150, 20);
		fr1.add(l5);

		t1 = new JTextField();
		t1.setBounds(250, 100, 150, 20);
		fr1.add(t1);
		t2 = new JTextField();
		t2.setBounds(250, 130, 150, 20);
		fr1.add(t2);
		t3 = new JTextField();
		t3.setBounds(250, 160, 150, 20);
		fr1.add(t3);
		t4 = new JTextField();
		t4.setBounds(250, 190, 150, 20);
		fr1.add(t4);
		t5 = new JTextField();
		t5.setBounds(250, 220, 150, 20);
		fr1.add(t5);
	}
}

//Create Class SearchCourse for Performed Search Course Details
class SearchCourse implements ActionListener {
	JLabel l1, l2, l3, l4, l5,l6;
	JTextField t1, t2, t3, t4, t5,t6;
	JButton b6;

	// Create Constructor
	SearchCourse() {
		JFrame fr = new JFrame("Registration Form");
		fr.setVisible(true);
		fr.setSize(1300, 730);
		fr.setLayout(null);

		l6 = new JLabel("Course ID for Search");
		l6.setBounds(100, 100, 250, 20);
		fr.add(l6);
		
		t6 = new JTextField();
		t6.setBounds(250, 100, 150, 20);
		fr.add(t6);
		
		b6=new JButton("Search");
		b6.setBounds(150, 150, 100, 20);
		fr.add(b6);
		
		b6.addActionListener(this);
		
		JFrame fr1 = new JFrame(" Coruse");
		fr1.setVisible(true);
		fr1.setLayout(null);
		fr1.setSize(1000, 700);

		l1 = new JLabel("Coruse ID");
		l1.setBounds(100, 100, 150, 20);
		fr1.add(l1);
		l2 = new JLabel("Coruse Name");
		l2.setBounds(100, 130, 150, 20);
		fr1.add(l2);
		l3 = new JLabel("Coruse Fees");
		l3.setBounds(100, 160, 150, 20);
		fr1.add(l3);
		l4 = new JLabel("Coruse Duration");
		l4.setBounds(100, 190, 150, 20);
		fr1.add(l4);
		l5 = new JLabel("Coruse Detail");
		l5.setBounds(100, 220, 150, 20);
		fr1.add(l5);

		t1 = new JTextField();
		t1.setBounds(250, 100, 150, 20);
		fr1.add(t1);
		t2 = new JTextField();
		t2.setBounds(250, 130, 150, 20);
		fr1.add(t2);
		t3 = new JTextField();
		t3.setBounds(250, 160, 150, 20);
		fr1.add(t3);
		t4 = new JTextField();
		t4.setBounds(250, 190, 150, 20);
		fr1.add(t4);
		t5 = new JTextField();
		t5.setBounds(250, 220, 150, 20);
		fr1.add(t5);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// If User Clicked Submit Button Than Registration Action Performed.
		if (e.getSource() == b6) {
			System.out.println("Search button clicked.");

			// Fetch Data From User Input
			int ID = Integer.parseInt(t6.getText());
//			new FetchSearch();
			try {
				// Provide Connectivity : User Input Is Stored Into Database Table
				Connection connection = Assesement.createconnection();
				String sql = "select * from course where id = ?";
				PreparedStatement pst = connection.prepareStatement(sql);

				pst.setInt(1, ID);
				ResultSet rs = pst.executeQuery();

				// If Course Id Exists, Than Fetch Data OtherWise Print Console screen Message.
				if (rs.next()) {
					t1.setText(String.valueOf(rs.getInt("ID")));
					t2.setText(rs.getString("Name"));
					t3.setText(String.valueOf(rs.getString("Fees")));
					t4.setText(rs.getString("Duration"));
					t5.setText(rs.getString("Detail"));
				} else {
					System.out.println("Data Not Found.");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
				}

			} catch (Exception e2) {
				// If Exception Is Generated Than Handle by printStackTrace.
				e2.printStackTrace();
			}
		}
	}
}

//Create Class EditCourse for Performed Add Edit course Details
class EditCourse implements ActionListener {
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2, t3, t4, t5;
	JButton j1;

	// Create Constructor
	EditCourse() {
		// Set Frame Dimension, Visibility & Layout
		JFrame fr1 = new JFrame("Add Coruse");
		fr1.setVisible(true);
		fr1.setLayout(null);
		fr1.setSize(1000, 700);

		l1 = new JLabel("Coruse ID");
		l1.setBounds(100, 100, 150, 20);
		fr1.add(l1);
		l2 = new JLabel("Coruse Name");
		l2.setBounds(100, 130, 150, 20);
		fr1.add(l2);
		l3 = new JLabel("Coruse Fees");
		l3.setBounds(100, 160, 150, 20);
		fr1.add(l3);
		l4 = new JLabel("Coruse Duration");
		l4.setBounds(100, 190, 150, 20);
		fr1.add(l4);
		l5 = new JLabel("Coruse Detail");
		l5.setBounds(100, 220, 150, 20);
		fr1.add(l5);

		t1 = new JTextField();
		t1.setBounds(250, 100, 150, 20);
		fr1.add(t1);
		t2 = new JTextField();
		t2.setBounds(250, 130, 150, 20);
		fr1.add(t2);
		t3 = new JTextField();
		t3.setBounds(250, 160, 150, 20);
		fr1.add(t3);
		t4 = new JTextField();
		t4.setBounds(250, 190, 150, 20);
		fr1.add(t4);
		t5 = new JTextField();
		t5.setBounds(250, 220, 150, 20);
		fr1.add(t5);

		j1 = new JButton("Submit");
		j1.setBounds(175, 260, 150, 20);
		fr1.add(j1);

		// Make Button Clicked To EventTable
		j1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// If User Clicked Submit Button Than Registration Action Performed.
		if (e.getSource() == j1) {
			System.out.println("Submit button clicked.");

			// Fetch Data From User Input
			int ID = Integer.parseInt(t1.getText());
			String Name = t2.getText();
			int Fees = Integer.parseInt(t3.getText());
			String Duration = t4.getText();
			String Detail = t5.getText();

			try {
				// Provide Connectivity : User Input Is Stored Into Database Table
				Connection connection = Assesement.createconnection();
				String sql = "insert into course (ID, Name, Fees, Duration, Detail) values (?,?,?,?,?)";
				PreparedStatement pst = connection.prepareStatement(sql);

				// Data Set Into Table
				pst.setInt(1, ID);
				pst.setString(2, Name);
				pst.setInt(3, Fees);
				pst.setString(4, Duration);
				pst.setString(5, Detail);
				pst.executeUpdate();

				// If Registration Succesfully, than Print console Messege & SetText Empty.
				System.out.println("Registration Succesfully.");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");

			} catch (Exception e2) {
				// If Exception Is Generated Than Handle by printStackTrace.
				e2.printStackTrace();
			}
		}
	}
}

//Create Class EditCourse for Performed Delete Specified course
class DeleteCourse implements ActionListener {
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2, t3, t4, t5;
	JButton j1;

	// Create Constructor
	DeleteCourse() {
		// Set Frame Dimension, Visibility & Layout
		JFrame fr1 = new JFrame("Add Coruse");
		fr1.setVisible(true);
		fr1.setLayout(null);
		fr1.setSize(1000, 700);

		l1 = new JLabel("Coruse ID");
		l1.setBounds(100, 100, 150, 20);
		fr1.add(l1);
		l2 = new JLabel("Coruse Name");
		l2.setBounds(100, 130, 150, 20);
		fr1.add(l2);
		l3 = new JLabel("Coruse Fees");
		l3.setBounds(100, 160, 150, 20);
		fr1.add(l3);
		l4 = new JLabel("Coruse Duration");
		l4.setBounds(100, 190, 150, 20);
		fr1.add(l4);
		l5 = new JLabel("Coruse Detail");
		l5.setBounds(100, 220, 150, 20);
		fr1.add(l5);

		t1 = new JTextField();
		t1.setBounds(250, 100, 150, 20);
		fr1.add(t1);
		t2 = new JTextField();
		t2.setBounds(250, 130, 150, 20);
		fr1.add(t2);
		t3 = new JTextField();
		t3.setBounds(250, 160, 150, 20);
		fr1.add(t3);
		t4 = new JTextField();
		t4.setBounds(250, 190, 150, 20);
		fr1.add(t4);
		t5 = new JTextField();
		t5.setBounds(250, 220, 150, 20);
		fr1.add(t5);

		j1 = new JButton("Submit");
		j1.setBounds(175, 260, 150, 20);
		fr1.add(j1);

		// Make Button Clicked To EventTable
		j1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// If User Clicked Submit Button Than Registration Action Performed.
		if (e.getSource() == j1) {
			System.out.println("Submit button clicked.");

			// Fetch Data From User Input
			int ID = Integer.parseInt(t1.getText());
			String Name = t2.getText();
			int Fees = Integer.parseInt(t3.getText());
			String Duration = t4.getText();
			String Detail = t5.getText();

			try {
				// Provide Connectivity : User Input Is Stored Into Database Table
				Connection connection = Assesement.createconnection();
				String sql = "insert into course (ID, Name, Fees, Duration, Detail) values (?,?,?,?,?)";
				PreparedStatement pst = connection.prepareStatement(sql);

				// Data Set Into Table
				pst.setInt(1, ID);
				pst.setString(2, Name);
				pst.setInt(3, Fees);
				pst.setString(4, Duration);
				pst.setString(5, Detail);
				pst.executeUpdate();

				// If Registration Succesfully, than Print console Messege & SetText Empty.
				System.out.println("Registration Succesfully.");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");

			} catch (Exception e2) {
				// If Exception Is Generated Than Handle by printStackTrace.
				e2.printStackTrace();
			}
		}
	}
}

public class Assesement implements ActionListener {

	JButton b1, b2, b3, b4, b5;

	// Create Constructor
	Assesement() {

		// Set Frame Dimension, Visibility & Layout
		JFrame fr = new JFrame("Coruses CRUD Operation");
		fr.setVisible(true);
		fr.setLayout(null);
		fr.setSize(500, 500);

		b1 = new JButton("Add Course");
		b1.setBounds(100, 100, 200, 20);
		fr.add(b1);
		b2 = new JButton("View Course");
		b2.setBounds(100, 140, 200, 20);
		fr.add(b2);
		b3 = new JButton("Search Course");
		b3.setBounds(100, 180, 200, 20);
		fr.add(b3);
		b4 = new JButton("Edit Course");
		b4.setBounds(100, 220, 200, 20);
		fr.add(b4);
		b5 = new JButton("Delete Course");
		b5.setBounds(100, 260, 200, 20);
		fr.add(b5);

		// Make Button Clicked To EventTable
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}

	public static void main(String[] args) {
		// Create Object of Assessment Method
		new Assesement();
	}

	// Create Connection With Database
	public static Connection createconnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rdbms_jdbc", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// If User Clicked AddCourse Button Than Registration Action Performed.
		if (e.getSource() == b1) {
			System.out.println("Add Course Button Clicked. ");
			try {
				// Create Object & Called Method AddCourse
				new AddCourse();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		// If User clicked ViewCourse Button Than View All Course.
		else if (e.getSource() == b2) {
			System.out.println("View Course Button Clicked. ");
			try {
				// Create Object & Called Method ViewCourse
				new ViewCourse();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		// If User clicked SearchCourse Button Than Search Course by Id Performed.
		else if (e.getSource() == b3) {
			System.out.println("Search Course Button Clicked. ");
			try {
				// Create Object & Called Method SearchCourse
				new SearchCourse();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		// If User clicked EditCourse Button Than Edit Course Details.
		else if (e.getSource() == b4) {
			System.out.println("Edit Course Button Clicked. ");
			try {
				// Create Object & Called Method EditCourse
				new EditCourse();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		// If User clicked DeleteCourse Button Than Delete Specified Course.
		else if (e.getSource() == b4) {
			System.out.println("Delete Course Button Clicked. ");
			try {
				// Create Object & Called Method DeleteCourse
				new DeleteCourse();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
