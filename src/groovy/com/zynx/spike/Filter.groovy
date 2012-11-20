package com.zynx.spike

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlAttribute
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement()
class Filter {
    @XmlAttribute
    String name

    @XmlAttribute
    String value

    @XmlElement
    MyHelper myHelper = new MyHelper()
}
