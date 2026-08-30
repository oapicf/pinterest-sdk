package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OrderLine;

@Canonical
class OrderLineMutationError {
    
    OrderLine data
    /* Error messages. */
    List<String> errorMessages = new ArrayList<>()
}
