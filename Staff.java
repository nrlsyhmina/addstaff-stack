public class Staff
{
   private String name;
   private String dob;
   private double salary;
   
   public Staff()
   {
       name = "";
       dob = "";
       salary = 0.00;
   }
   
   public void setStaff(String n, String d, double s)
   {
       name = n;
       dob = d;
       salary = s;
   }
   
   public String getName()
   {
       return name;
   }
   
   public String getDOB()
   {
       return dob;
   }
   
   public double getSalary()
   {
       return salary;
   }
}
