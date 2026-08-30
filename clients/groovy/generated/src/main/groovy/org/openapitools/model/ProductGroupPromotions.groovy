package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ProductGroupPromotionResponseItem;

@Canonical
class ProductGroupPromotions {
    /* Response-only: created or updated product group promotions, or exceptions. */
    List<ProductGroupPromotionResponseItem> items = new ArrayList<>()
}
