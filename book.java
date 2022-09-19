
package BookProjects;

public class book {
   String name ; 
   Long MembershipNumber ; 
   byte age ; 
   char sex ; 

    @Override
    public String toString() {
        return "******************Library members ******************\n "
                + "MembershipNumber = " +MembershipNumber +"\n Name = "+name + "\n Age=" +age+"\n Gender = "+sex;
    }
   
}
