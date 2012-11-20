package com.zynx.spike.conversion

import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller

class XmlConverter {
    static String toXml(def object, boolean prettyPrint = false) {
        JAXBContext context = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, prettyPrint);

        StringWriter writer = new StringWriter()
        marshaller.marshal(object, writer);

        writer.toString()
    }
}
