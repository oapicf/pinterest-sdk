package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ProductCategoriesEngagementType;

@Canonical
class TrendingProductCategory {
    /* Engagement type */
    ProductCategoriesEngagementType engagementType
    /* Month-over-month change percentage */
    Integer pctChangeMom
    /* Relative volume percentage */
    Integer percentRelativeVolume
    /* Pinterest Product Category Id */
    Integer pinterestProductCategoryId
    /* Product Category Name */
    String productCategory
    /* Vertical name associated with the product category */
    List<String> verticals = new ArrayList<>()
}
