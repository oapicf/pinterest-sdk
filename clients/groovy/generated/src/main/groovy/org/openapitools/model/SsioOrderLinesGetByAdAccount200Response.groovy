package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SSIOOrderLine;

@Canonical
class SsioOrderLinesGetByAdAccount200Response {
    /* SSIO order lines by ad acount id */
    List<SSIOOrderLine> items = new ArrayList<>()
    
    String bookmark
}
