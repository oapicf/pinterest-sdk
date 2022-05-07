package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

@Canonical
class TrackingUrls {
    
    List<String> impression = new ArrayList<String>()
    
    List<String> click = new ArrayList<String>()
    
    List<String> engagement = new ArrayList<String>()
    
    List<String> buyableButton = new ArrayList<String>()
    
    List<String> audienceVerification = new ArrayList<String>()
}
