
/**
 * The class Member represents members who attend a Photoclub - with name, date joined and membership type.
 * 
 * @author Annamaria Galgoczi 
 * @version 01.05.2020
 */
public class Member
{

   private String name;
   private String dateJoined;
   private String membershipType;

   /**
    * Constructor for objects of class Member
    */
   public Member(String aName, String aDate, String aMembership)
   {
      // initialise instance variables
      this.name = aName;
      this.dateJoined = aDate;
      this.membershipType = aMembership;
   }

   public String getName()
   {
      return this.name;
   }
   
   public String getDateJoined()
   {
      return this.dateJoined;
   }
   
   public String getMembershipType()
   {
      return this.membershipType;
   }
       
   public String toString()
   {
      return (this.getName() + " joined on: " + this.getDateJoined() + ", membership type: " + this.getMembershipType());
   }
}
