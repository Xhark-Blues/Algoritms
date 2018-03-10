package xharkblues.DAO;

import xharkblues.Model.Element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;

public class DAO implements DAOIntf{
    private String path;
    private ArrayList<DAOElement> scene;
    private JAXBContext context;

    public DAO(String path) {
        this.path = path;
        try {
            loadScene();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private void loadScene() throws JAXBException {
        this.context = JAXBContext.newInstance(DAOScene.class);
        File file = new File(path);
        Unmarshaller um = context.createUnmarshaller();

        DAOScene xmlScene = (DAOScene) um.unmarshal(file);
        System.out.println(xmlScene);
    }

    @Override
    public ArrayList<Element> getScene() {
        System.out.println(scene);
        return new ArrayList<>();
    }
}
