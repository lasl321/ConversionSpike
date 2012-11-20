package com.zynx.spike

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement
class Checklist {
    @XmlElement
    String myProperty

    @XmlElement
    String name

    @XmlElement
    List<Filter> filters

    Checklist() {
        myProperty = 'myPropertyValue'
        filters = new ArrayList<Filter>()
    }
}
