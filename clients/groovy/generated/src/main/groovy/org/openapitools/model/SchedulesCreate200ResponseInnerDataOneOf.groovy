package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PinterestLibError;

@Canonical
class SchedulesCreate200ResponseInnerDataOneOf {
    
    String id
    /* Schedule ID. */
    String scheduleId
    
    PinterestLibError exceptions
}
