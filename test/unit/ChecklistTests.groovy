import com.zynx.spike.Checklist
import com.zynx.spike.Filter
import com.zynx.spike.conversion.JsonConverter
import com.zynx.spike.conversion.XmlConverter
import org.junit.Before
import org.junit.Test

import static junit.framework.Assert.assertEquals

class ChecklistTests {
    private Checklist checklist

    @Before
    void before() {
        checklist = new Checklist(name: 'checklistName')
        checklist.filters.add(new Filter(name: 'f1', value: '4'))
        checklist.filters.add(new Filter(name: 'f2'))
    }

    @Test
    void shouldConvertObjectToXml() {
        println XmlConverter.toXml(checklist, true)
    }

    @Test
    void shouldConvertJsonStringToObject() {
        String json = """
{
    "myProperty": "myPropertyValue",
    "name": "checklistName",
    "filters": [
      {
        "name": "f1",
        "value": "4",
        "myHelper": { "someIntValue": "9" }
      },
      {
        "name": "f2",
        "myHelper": { "someIntValue": "9" }
      }
    ]
  }
"""

        def checklist = JsonConverter.fromJson(new StringReader(json), Checklist.class)
        assertEquals('com.zynx.spike.Checklist', checklist.getClass().getName())
        println checklist.dump()
    }
}
