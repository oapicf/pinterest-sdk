package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdCollectionsHeaderType;
import org.openapitools.model.AdDisapprovalReasons;
import org.openapitools.model.AdReviewStatus;
import org.openapitools.model.CartingProduct;
import org.openapitools.model.CreativeType;
import org.openapitools.model.CustomizableCTAType;
import org.openapitools.model.DisclosureType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;
import org.openapitools.model.PinPromotionSummaryStatus;
import org.openapitools.model.QuizPinData;
import org.openapitools.model.TrackingUrls;

@Canonical
class Ad {
    /* The ID of the advertiser that this ad belongs to. */
    String adAccountId
    /* ID of the ad group that contains the ad. */
    String adGroupId
    /* Deep link URL for Android devices. */
    String androidDeepLink
    /* ID of the ad campaign that contains this ad. */
    String campaignId
    /* Comma-separated deep links for the carousel pin on Android. */
    List<String> carouselAndroidDeepLinks
    /* Comma-separated destination URLs for the carousel pin to promote. */
    List<String> carouselDestinationUrls
    /* Comma-separated deep links for the carousel pin on iOS. */
    List<String> carouselIosDeepLinks
    /* The vendor platform type of the carting/WTB ad. */
    Integer cartingPlatformType
    /* Array of carting/WTB products for the ad. */
    List<CartingProduct> cartingProducts = new ArrayList<>()
    /* Tracking url for the ad clicks. */
    String clickTrackingUrl
    /* Destination URL template for all items within a collections drawer. */
    String collectionItemsDestinationUrlTemplate
    
    AdCollectionsHeaderType collectionsHeaderType
    /* Pin creation time. Unix timestamp in seconds. */
    Integer createdTime
    
    CreativeType creativeType
    
    CustomizableCTAType customizableCtaType
    /* Destination URL. */
    String destinationUrl
    
    DisclosureType disclosureType
    /* URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. */
    String disclosureUrl
    
    GridClickType gridClickType
    /* The ID of this ad. */
    String id
    /* Deep link URL for iOS devices. */
    String iosDeepLink
    /* Is the ad a carting/WTB ad? */
    Boolean isCarting
    /* Whether the advertiser has accepted the terms and conditions for collage ad. */
    Boolean isCollageAcceptedTerms
    /* Whether the collage ad has a single destination url override. */
    Boolean isCollageSingleDestination
    /* Is original pin deleted? */
    Boolean isPinDeleted
    /* Is pin repinnable? */
    Boolean isRemovable
    /* Lead form ID for lead ad generation. */
    String leadFormId
    /* Name of the ad - 255 chars max. */
    String name
    /* Pin ID. This field may only be updated for draft ads. */
    String pinId
    /* Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. */
    QuizPinData quizPinData
    /* Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\". */
    List<AdDisapprovalReasons> rejectedReasons = new ArrayList<>()
    /* Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\". */
    List<String> rejectionLabels = new ArrayList<>()
    /* Ad review status */
    AdReviewStatus reviewStatus
    
    EntityStatus status
    /* Ad summary status */
    PinPromotionSummaryStatus summaryStatus
    
    TrackingUrls trackingUrls
    /* Always \"ad\". */
    String type
    /* Last update time. Unix timestamp in seconds. */
    Integer updatedTime
    /* Tracking URL for ad impressions. */
    String viewTrackingUrl
}
