package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ProductCategoriesEngagementType;
import org.openapitools.model.VerticalProductCategory;

@Canonical
class TrendingProductCategory {
    /* Engagement type */
    ProductCategoriesEngagementType engagementType
    /* Month-over-month change percentage */
    Integer pctChangeMom
    /* Relative volume percentage */
    Integer percentRelativeVolume
    /* Product Category Name */
    String productCategory
    /* Vertical name associated with the product category */
    List<VerticalProductCategory> verticals = new ArrayList<>()
}
