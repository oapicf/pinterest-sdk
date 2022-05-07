package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PinPromotionSummaryStatus;

@Canonical
class AdResponseAllOf1 {
    /* The ID of the advertiser that this ad belongs to. */
    String adAccountId
    /* ID of the ad campaign that contains this ad. */
    String campaignId
    /* Destination URL template for all items within a collections drawer. */
    String collectionItemsDestinationUrlTemplate
    /* Pin creation time. Unix timestamp in seconds. */
    Integer createdTime
    /* The ID of this ad. */
    String id
    /* Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */
    List<String> rejectedReasons = new ArrayList<RejectedReasonsEnum>()
    /* Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */
    List<String> rejectionLabels = new ArrayList<String>()
    /* Ad review status */
    String reviewStatus
    /* Always \"ad\". */
    String type
    /* Last update time. Unix timestamp in seconds. */
    Integer updatedTime
    /* Ad summary status */
    PinPromotionSummaryStatus summaryStatus
}
