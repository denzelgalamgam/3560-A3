import javax.swing.JOptionPane;

/**
 *
 * @author Denzel Galamgam
 */
public class UserVisitor implements InfoVisitor
{

    @Override
    public void visit(User u) 
    {
        JOptionPane.showMessageDialog(null, "Total # of Users: " + u.getUsers().size());
    }

    @Override
    public void visit(UserGroup ug) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}