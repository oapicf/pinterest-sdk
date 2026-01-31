package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.InnerProductCategoriesMetricsHighlights;

@Canonical
class ProductCategoriesMetricsHighlights {
    /* Engagement metric value */
    InnerProductCategoriesMetricsHighlights engagement
    /* Number of outbound clicks */
    InnerProductCategoriesMetricsHighlights outboundClicks
    /* Number of pin saves */
    InnerProductCategoriesMetricsHighlights pinSaves
}
