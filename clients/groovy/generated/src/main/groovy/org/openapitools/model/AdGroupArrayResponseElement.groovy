package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdGroupResponse;
import org.openapitools.model.Exception;

@Canonical
class AdGroupArrayResponseElement {
    
    AdGroupResponse data
    
    List<Exception> exceptions = new ArrayList<>()
}
