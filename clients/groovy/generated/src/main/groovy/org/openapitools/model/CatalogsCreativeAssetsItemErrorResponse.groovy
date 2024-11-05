package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.ItemValidationEvent;

@Canonical
class CatalogsCreativeAssetsItemErrorResponse {
    
    CatalogsType catalogType
    /* The catalog creative assets id in the merchant namespace */
    String creativeAssetsId
    /* Array with the errors for the item id requested */
    List<ItemValidationEvent> errors = new ArrayList<>()
}
