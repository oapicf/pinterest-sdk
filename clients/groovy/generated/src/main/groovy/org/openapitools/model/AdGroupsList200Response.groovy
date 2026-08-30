package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdGroup;

@Canonical
class AdGroupsList200Response {
    
    String bookmark
    
    List<AdGroup> items = new ArrayList<>()
}
