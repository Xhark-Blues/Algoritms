package xharkblues.DAO;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="scene")
public class DAOScene {

    @XmlElement(name="element", type = DAOElement.class)
    private ArrayList<DAOElement> listOfElements =  new ArrayList<>();
    @Override
    public String toString() {
        String s = "";
        for(DAOElement elem:listOfElements){
            s = s + "\n\t" + elem;
        }
        return "DAOScene{" +
                "listOfElements=" + s +
                '}';
    }

}