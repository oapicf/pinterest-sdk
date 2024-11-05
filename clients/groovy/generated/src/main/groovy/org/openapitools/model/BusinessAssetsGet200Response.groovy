package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GetBusinessAssetsResponse;

@Canonical
class BusinessAssetsGet200Response {
    /* List of assets the requesting business has access to. */
    List<GetBusinessAssetsResponse> items = new ArrayList<>()
    
    String bookmark
}
