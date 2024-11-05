package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class TrackingUrls {
    
    List<String> impression = new ArrayList<>()
    
    List<String> click = new ArrayList<>()
    
    List<String> engagement = new ArrayList<>()
    
    List<String> buyableButton = new ArrayList<>()
    
    List<String> audienceVerification = new ArrayList<>()
}
