package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class MetricsResponseDataItems {
    /* Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers). */
    Object metrics
    /* The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER) */
    String targetingType
    /* The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female') */
    String targetingValue
}
