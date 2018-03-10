package xharkblues.DAO;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;

public class DAOElement {
    @XmlAttribute
    private int id;
    @XmlElement
    private int type;
    @XmlElement
    private int color;
    @XmlElement
    private int size;

    @XmlElement(name="location")
    private Location location;
    public static class Location {
        @XmlElementWrapper(name="absolute")
        @XmlElement(name="absolute-item")
        private ArrayList<String> absoluteItems;

        @XmlElement(name="relative")
        private Relative relative;
        public static class Relative{
            @XmlElement
            private int right;
            @XmlElement
            private int left;
            @Override
            public String toString() {
                return "Relative{" +
                        "right=" + right +
                        ", left=" + left +
                        '}';
            }
        }
        @Override
        public String toString() {
            return "Location{" +
                     relative +
                    ", Absolute" + absoluteItems +
                    "}";
        }
    }

    //<--------------------->//

    @Override
    public String toString() {
        return "Element "+id+" {" +
                "type=" + type +
                ", color=" + color +
                ", size=" + size +
                ", "+ location
                +"}";
    }
}
