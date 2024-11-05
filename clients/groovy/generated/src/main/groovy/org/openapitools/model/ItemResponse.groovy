package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsAttributes;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.ItemResponseAnyOf;
import org.openapitools.model.ItemResponseAnyOf1;
import org.openapitools.model.ItemValidationEvent;
import org.openapitools.model.Pin;

@Canonical
class ItemResponse {
    
    CatalogsType catalogType
    /* The catalog item id in the merchant namespace */
    String itemId
    /* Array with the errors for the item id requested */
    List<ItemValidationEvent> errors = new ArrayList<>()
    /* The catalog hotel id in the merchant namespace */
    String hotelId
    /* The catalog creative assets id in the merchant namespace */
    String creativeAssetsId
}
