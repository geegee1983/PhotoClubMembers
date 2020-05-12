import java.util.*;
/**
 * Class PhotoClub holds a data about a collection of Members attending the Club.
 * 
 * @author Annamaria Galgoczi 
 * @version 01.05.2020
 */
public class PhotoClub
{
   Map <String, Member> members;
      /**
    * Constructor for an empty map referenced by 'members'
    */
   public PhotoClub()
   {
      super();
      members = new TreeMap <String, Member> ();           
   }
   
   /**
    * Create an instance of Member and 
    * add it to the map (members) with "membershipNum" as the key.
    */
   public void addMember(String membershipNum, String name, String dateJoined, String memberType)
   {
      Member aMember = new Member(name, dateJoined, memberType);
      members.put(membershipNum, aMember);
   }
   
   /**
    * Populate the map with test data: 4 random members used for testing purposes
    */
   public void populateMap()
   {
      addMember("001", "John Doe", "01.01.2020", "Full"); 
      addMember("002", "Jane Doe", "02.02.2020", "Concession"); 
      addMember("003", "John Smith", "03.03.2020", "Concession"); 
      addMember("004", "Jayne Smith", "04.04.2020", "Full"); 
   }
   
   /**
    *Iterates over all membership numbers
    *to print out a the number and all details of the member 
    *associated with that membership number.
    */
   public void printMap()
   {
      for (String mn : members.keySet())
      {
         System.out.println("Member " + mn + " is " + members.get(mn));
      }
   }
   
   /**
    *Looks up a membership number and 
    *returns the details of the member associated with that number.
    */
   public void printMapValue(String aKey)
   {
      if (members.containsKey(aKey))
      {
         System.out.println("The member associated with membership number " + aKey + ": " + members.get(aKey));
      }
      else
      {
         System.out.println("Member " + aKey + " not found!");
      }
   }
   
   /**
    *Adds the member (aValue) with the associated membership number (aKey) the map members. 
    *If the key is already present the existing value is overwritten.
    */
   public void addMapEntry(String aKey, Member aValue)
   {
      members.put(aKey, aValue);
   }
   
   /**
    * Deletes the key-value pair - associated with the given key - from the map
    */
   public Boolean deleteEntry(String aKey)
   {
      if (members.containsKey(aKey))
      {
         members.remove(aKey);
         return true;
      }
      else
      {
         return false;
      }
   }
   
    /**
    *Returns all the members with a specific membershipType given as argument
    */
   public Set selectValues(String membershipType)
   {
      Set <Member> setOfValues = new HashSet <Member>();
      for (Member theMember : members.values())
      {
         if (theMember.getMembershipType() == membershipType)
         {
            setOfValues.add(theMember);
         }
      }
      return setOfValues;
   }
   
    /**
    *Returns all membership numbers that contains the 
    *String given in the argument.
    */   
   public Set selectKeys(String aString)
   {
      Set <String> setOfKeys = new TreeSet <String>();
      for (String key : members.keySet())
      {
         if (key.contains(aString))
         {
            setOfKeys.add(key);
         }
      }
      return setOfKeys;
   }
     
}
