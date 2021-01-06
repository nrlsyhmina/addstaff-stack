import javax.swing.*;
import java.util.Stack;

public class StaffApp
{
    public static void main(String[] argd)
    {
        Stack staff = new Stack();
        String name = "", dob = "";
        double salary = 0.00;
        int stop = 1;
        
        stop = Integer.parseInt(JOptionPane.showInputDialog("Press 0 to start: "));
        while (stop!=1)
        {
            name = JOptionPane.showInputDialog("Enter Name: ");
            dob = JOptionPane.showInputDialog("Enter DOB (Ex:18 Nov 1999): ");
            salary = Double.parseDouble(JOptionPane.showInputDialog("Enter Salary: "));
            Staff s = new Staff();
            s.setStaff(name, dob, salary);
            staff.push(s);
            
            stop = Integer.parseInt(JOptionPane.showInputDialog("Press 1 to stop, 0 to continue: "));
        }
        
        System.out.println("Name: " + name + "\n" + "DOB: " + dob + "\n" + "Salary: " +  salary);
        
        Object ob;
        Staff st;
        String n = "";
        while(!staff.isEmpty())
        {
            ob = staff.pop();
            st = (Staff)ob;
            n = st.getName();
        }
        System.out.print("After pop: " + "\n" + n);
  
    }
}
