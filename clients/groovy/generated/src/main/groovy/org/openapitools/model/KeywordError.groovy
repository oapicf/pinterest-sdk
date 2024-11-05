package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Keyword;

@Canonical
class KeywordError {
    
    Keyword data
    
    List<String> errorMessages = new ArrayList<>()
}
