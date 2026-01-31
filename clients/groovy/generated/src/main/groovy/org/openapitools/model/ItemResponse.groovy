package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsAttributes;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.ItemResponseOneOf;
import org.openapitools.model.ItemResponseOneOf1;
import org.openapitools.model.ItemValidationEvent;
import org.openapitools.model.Pin;

@Canonical
class ItemResponse {
    
    CatalogsType catalogType
    
    CatalogsCreativeAssetsAttributes attributes
    /* The catalog item id in the merchant namespace */
    String itemId
    /* The pins mapped to the item */
    List<Pin> pins
    /* The catalog hotel id in the merchant namespace */
    String hotelId
    /* The catalog creative assets id in the merchant namespace */
    String creativeAssetsId
    /* Array with the errors for the item id requested */
    List<ItemValidationEvent> errors = new ArrayList<>()
}
