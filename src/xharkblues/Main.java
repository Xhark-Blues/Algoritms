package xharkblues;

import xharkblues.DAO.DAO;
import xharkblues.DAO.DAOIntf;

public class Main {

    public static void main(String[] args) {
        //System.out.println(System.getProperty("user.dir"));
        DAOIntf dao = new DAO("scenes.xml");
        //dao.getScene();
    }
}
