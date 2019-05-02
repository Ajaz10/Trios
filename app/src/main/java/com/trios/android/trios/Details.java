/**
 * Created by AZ on 09-Apr-19.
 */
package com.trios.android.trios;

public class Details {
String id;
String name;
String place;
String url;

public Details(){

}

    public Details(String id, String name, String place) {
        this.id = id;
        this.name = name;
        this.place = place;
        //this.url = url;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    //public String getUrl() {
      //  return url;
    //}
}
