package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdResponse;
import org.openapitools.model.Exception;

@Canonical
class AdArrayResponseElement {
    
    AdResponse data
    
    Exception exceptions
}
