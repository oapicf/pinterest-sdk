package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsAttributes;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Pin;

@Canonical
class CatalogsCreativeAssetsItemResponse {
    
    CatalogsType catalogType
    /* The catalog creative assets id in the merchant namespace */
    String creativeAssetsId
    /* The pins mapped to the item */
    List<Pin> pins
    
    CatalogsCreativeAssetsAttributes attributes
}
