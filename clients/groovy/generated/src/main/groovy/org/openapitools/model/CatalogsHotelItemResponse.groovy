package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAttributes;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Pin;

@Canonical
class CatalogsHotelItemResponse {
    
    CatalogsType catalogType
    /* The catalog hotel id in the merchant namespace */
    String hotelId
    /* The pins mapped to the item */
    List<Pin> pins
    
    CatalogsHotelAttributes attributes
}
