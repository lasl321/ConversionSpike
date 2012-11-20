import com.zynx.spike.Filter

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement
class Checklist {
    @XmlElement
    String name

    @XmlElement
    List<Filter> filters

    Checklist() {
        filters = new ArrayList<Filter>()
    }
}
