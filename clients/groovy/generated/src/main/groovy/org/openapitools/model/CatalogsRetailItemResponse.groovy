package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.ItemAttributes;
import org.openapitools.model.Pin;

@Canonical
class CatalogsRetailItemResponse {
    
    CatalogsType catalogType
    /* The catalog retail item id in the merchant namespace */
    String itemId
    /* The pins mapped to the item */
    List<Pin> pins
    
    ItemAttributes attributes
}
