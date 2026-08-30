package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BulkCampaignDeliveryEstimatesItem;

@Canonical
class BulkCampaignDeliveryEstimatesResponse {
    /* Per-campaign delivery estimate results, in the same order as the request. */
    List<BulkCampaignDeliveryEstimatesItem> data = new ArrayList<>()
}
