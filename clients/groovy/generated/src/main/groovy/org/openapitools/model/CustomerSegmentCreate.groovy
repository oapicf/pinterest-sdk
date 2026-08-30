package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class CustomerSegmentCreate {
    /* Audience IDs included in the customer segment. */
    List<String> audienceIds = new ArrayList<>()
    /* Customer segment name. */
    String name
}
