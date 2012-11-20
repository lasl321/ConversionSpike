import com.zynx.spike.Filter
import org.junit.Test

import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller

class ChecklistTests {

    @Test
    void shouldConvertObjectToXml() {
        def checklist = new Checklist(name: 'checklistName')
        checklist.filters.add(new Filter(name: 'f1', value: '4'))
        checklist.filters.add(new Filter(name: 'f2'))

        println toXml(checklist, true)
    }

    String toXml(def object, boolean prettyPrint = false) {
        JAXBContext context = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, prettyPrint);

        StringWriter writer = new StringWriter()
        marshaller.marshal(object, writer);

        writer.toString()
    }
}
