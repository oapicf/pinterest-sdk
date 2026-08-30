package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DynamicTitlesGetStatus {
    /* The count of generated titles. */
    Integer generatedCount
    /* Whether dynamic titles have been generated and are ready to be reviewed for the ad group. */
    Boolean isReady
    /* The count of advertiser reviewed titles. */
    Integer reviewedCount
}
