package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ProductGroupPromotion;

@Canonical
class ProductGroupPromotionsCreate {
    /* ID of the ad group the product group promotion belongs to. */
    String adGroupId
    /* List of product group promotions to create or update. */
    List<ProductGroupPromotion> productGroupPromotion = new ArrayList<>()
}
