package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Exception;
import org.openapitools.model.LeadFormResponse;

@Canonical
class LeadFormArrayResponseItemsInner {
    
    LeadFormResponse data
    
    List<Exception> exceptions = new ArrayList<>()
}
