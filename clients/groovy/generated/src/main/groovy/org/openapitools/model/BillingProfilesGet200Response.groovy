package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BillingProfilesResponse;

@Canonical
class BillingProfilesGet200Response {
    
    String bookmark
    
    List<BillingProfilesResponse> items = new ArrayList<>()
}
