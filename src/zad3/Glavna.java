package zad3;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
    public static void main(String[] args) {

        XmlCreator xml = new XmlCreator();
        List<Student> s = new ArrayList<Student>();
        s.add(new Student("Mario", "Trajkovski", 100));
        s.add(new Student("Mitko", "Markovski", 105));
        xml.createXMLFile("xml.xml", s);
    }
}
