package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdResponseAllOf;
import org.openapitools.model.AdResponseAllOf1;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PinPromotionSummaryStatus;
import org.openapitools.model.TrackingUrls;

@Canonical
class AdResponse {
    /* ID of the ad group that contains the ad. */
    String adGroupId
    /* Deep link URL for Android devices. Not currently available. Using this field will generate an error. */
    String androidDeepLink
    /* Comma-separated deep links for the carousel pin on Android. */
    List<String> carouselAndroidDeepLinks = new ArrayList<String>()
    /* Comma-separated destination URLs for the carousel pin to promote. */
    List<String> carouselDestinationUrls = new ArrayList<String>()
    /* Comma-separated deep links for the carousel pin on iOS. */
    List<String> carouselIosDeepLinks = new ArrayList<String>()
    /* Tracking url for the ad clicks. */
    String clickTrackingUrl
    /* Ad creative type enum */
    String creativeType
    /* Destination URL. */
    String destinationUrl
    /* Deep link URL for iOS devices. Not currently available. Using this field will generate an error. */
    String iosDeepLink
    /* Is original pin deleted? */
    Boolean isPinDeleted
    /* Is pin repinnable? */
    Boolean isRemovable
    /* Name of the ad - 255 chars max. */
    String name
    /* Pin ID. */
    String pinId
    
    EntityStatus status
    
    TrackingUrls trackingUrls
    /* Tracking URL for ad impressions. */
    String viewTrackingUrl
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
