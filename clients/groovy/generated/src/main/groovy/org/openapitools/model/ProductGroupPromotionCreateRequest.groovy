package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ProductGroupPromotion;

@Canonical
class ProductGroupPromotionCreateRequest {
    /* ID of the Ad Group the Product Group Promotion belongs to. */
    String adGroupId
    
    List<ProductGroupPromotion> productGroupPromotion = new ArrayList<>()
}
