package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BusinessAssets;

@Canonical
class BusinessAssetsGet200Response {
    
    String bookmark
    
    List<BusinessAssets> items = new ArrayList<>()
}
