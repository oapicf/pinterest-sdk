package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.IneligibleProductTagsErrorDetails;

@Canonical
class ProductTagsError {
    
    Integer code
    /* Details about which product tags failed eligibility check. */
    IneligibleProductTagsErrorDetails details
    
    String message
}
