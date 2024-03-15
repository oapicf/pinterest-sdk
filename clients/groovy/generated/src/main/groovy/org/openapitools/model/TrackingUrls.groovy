package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class TrackingUrls {
    
    List<String> impression
    
    List<String> click
    
    List<String> engagement
    
    List<String> buyableButton
    
    List<String> audienceVerification
}
