package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class SingleInterestTargetingOptionResponse {
    
    String id
    
    String name
    
    List<String> childInterests
    
    Integer level
}
