package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EntityLabel;

@Canonical
class EntityLabelError {
    
    EntityLabel data
    
    List<String> errorMessages = new ArrayList<>()
}
