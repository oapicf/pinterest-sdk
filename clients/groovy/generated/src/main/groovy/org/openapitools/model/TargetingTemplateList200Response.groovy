package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TargetingTemplateGetResponseData;

@Canonical
class TargetingTemplateList200Response {
    
    String bookmark
    
    List<TargetingTemplateGetResponseData> items = new ArrayList<>()
}
