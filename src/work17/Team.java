package work17;
import java.util.ArrayList;
import java.util.List;
public class Team {
	private List<Role> members = new ArrayList<>(6);
	
    public int attackSum(){
        int total = 0;
        for (Role member: members){
            total += member.attack();
        }
        return total;
    }
 
    public void addMember(Role role){
        if (members.size() < 6){
            members.add(role);
        }
        else{
            System.out.println("The team already full");
        }
    }
     
    public List<Role> teamList(){
        return members;
    }
}
