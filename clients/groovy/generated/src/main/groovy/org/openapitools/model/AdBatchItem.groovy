package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Ad;
import org.openapitools.model.PinterestLibError;

@Canonical
class AdBatchItem {
    
    Ad data
    
    PinterestLibError exceptions
}
