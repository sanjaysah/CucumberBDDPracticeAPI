package com.RSA.resources;

import com.RSA.PojoClasses.AddPlace;
import com.RSA.PojoClasses.Locationn;

import java.util.ArrayList;

public class TestDataBuild {
    public static AddPlace Add_Place_Payload(){
        //Request Body Serialization using POJO
        Locationn loc = new Locationn();
        loc.setLat(-38.383494);
        loc.setLng(33.427362);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("shoe park");
        arrayList.add("shop");
        AddPlace addP = new AddPlace();
        addP.setAccuracy(50);
        addP.setAddress("29, side layout, cohen 09");
        addP.setLanguage("French-IN");
        addP.setLocation(loc);
        addP.setName("Frontline house");
        addP.setTypes(arrayList);
        addP.setWebsite("http://google.com");
        addP.setPhone_number("(+91) 983 893 3937");
        return addP;
    }
}
