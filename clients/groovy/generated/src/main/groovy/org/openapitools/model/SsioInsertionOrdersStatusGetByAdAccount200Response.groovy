package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SSIOInsertionOrderStatus;

@Canonical
class SsioInsertionOrdersStatusGetByAdAccount200Response {
    /* Insertion orders status by ad acount id */
    List<SSIOInsertionOrderStatus> items = new ArrayList<>()
    
    String bookmark
}
