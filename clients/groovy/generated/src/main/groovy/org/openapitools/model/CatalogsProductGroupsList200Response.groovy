package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsProductGroupsList200ResponseAllOfItemsInner;

@Canonical
class CatalogsProductGroupsList200Response {
    
    List<CatalogsProductGroupsList200ResponseAllOfItemsInner> items = new ArrayList<>()
    
    String bookmark
}
