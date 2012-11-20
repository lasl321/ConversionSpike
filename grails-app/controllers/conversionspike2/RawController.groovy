package conversionspike2

import com.zynx.spike.Checklist
import com.zynx.spike.conversion.JsonConverter
import com.zynx.spike.conversion.XmlConverter

class RawController {

    def index() {
        def checklist = new JsonConverter().fromJson(request.reader, Checklist.class)
        render XmlConverter.toXml(checklist, true)
    }
}
