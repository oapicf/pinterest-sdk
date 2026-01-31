package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.InterestsEnum;
import org.openapitools.model.ProductCategoryRegion;
import org.openapitools.model.TrendingTopic;

@Canonical
class FeaturedTrend {
    /* The main interest category */
    InterestsEnum interest
    /* Market code (e.g., 'US', 'UK', etc.) */
    ProductCategoryRegion market
    /* List of trending topics within this interest category */
    List<TrendingTopic> trends = new ArrayList<>()
}
