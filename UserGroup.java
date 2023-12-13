import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Denzel Galamgam
 */
public class UserGroup extends UserManager
{
    private ArrayList<UserManager> members;
    public static HashMap<String, UserGroup> groups = new HashMap<String, UserGroup>();
    
    public static HashMap<String, UserGroup> getGroups() {
        return new HashMap<>(groups);
    }

    private long creationTime;
    public UserGroup(String id)
    {
        members = new ArrayList<UserManager>();
        this.id = id;
        groups.put(id, this);
         
            this.creationTime = System.currentTimeMillis();
    }

    @Override
    public void add(UserManager um) 
    {
        if(um.getMembers() == null)
            members.add((User)um);
        else
            members.add((UserGroup)um);
    }
    public ArrayList<UserManager> getMembers()
    {
        return members;
    }
    
    public static boolean exists(String uid)
    {
        return groups.containsKey(uid);
    }
    
    public static UserGroup findGroup(String s)
    {
        return groups.get(s);
    }

    @Override
    public void accept(InfoVisitor v) 
    {
        v.visit(this);
    }
}