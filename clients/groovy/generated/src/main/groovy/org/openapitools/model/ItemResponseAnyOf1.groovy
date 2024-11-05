package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CatalogsCreativeAssetsItemErrorResponse;
import org.openapitools.model.CatalogsHotelItemErrorResponse;
import org.openapitools.model.CatalogsRetailItemErrorResponse;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.ItemValidationEvent;

@Canonical
class ItemResponseAnyOf1 {
    
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
