package org.tango.dynmaicattrteest;

import org.tango.server.attribute.AttributeValue;
import org.tango.server.dynamic.DynamicManager;

import fr.esrf.Tango.AttrQuality;
import fr.esrf.Tango.DevFailed;

public class CreateDynamicAttrs implements Runnable{
	
	
	private DynamicManager dm;
	
	public CreateDynamicAttrs(DynamicManager dynamicmanager) {
		
		dm = dynamicmanager;
		System.out.println("Value of dynmaic manager in constructor : - "+dm);
	}
	
	public void run() 
	{
		DynamicAttrTest d1 = new DynamicAttrTest("AttrFormOutside1");
		DynamicAttrTest d2 = new DynamicAttrTest("AttrFormOutside2");
		DynamicAttrTest d3 = new DynamicAttrTest("AttrFormOutside3");
		
		try {
			System.out.println("Value of dynmaic manager while adding : - "+dm);
			dm.addAttribute(d1);
			dm.addAttribute(d2);
			dm.addAttribute(d3);
		} catch (DevFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*AttributeValue attributeValueNew;
		try {
			attributeValueNew = new AttributeValue("NOT OK");
			attributeValueNew.setQuality(AttrQuality.ATTR_VALID);
			d1.setValue(attributeValueNew);
			d2.setValue(attributeValueNew);
			d3.setValue(attributeValueNew);
		} catch (DevFailed e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
	}

}
