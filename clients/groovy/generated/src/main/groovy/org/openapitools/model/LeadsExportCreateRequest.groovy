package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class LeadsExportCreateRequest {
    /* Export leads collected on and after start date (UTC). Format: YYYY-MM-DD */
    String startDate
    /* Export leads collected on and before end date (UTC). Format: YYYY-MM-DD */
    String endDate
    /* ID for the ad collecting leads */
    String adId
}
