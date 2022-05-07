package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ActionType;
import org.openapitools.model.AdGroupResponseAllOf;
import org.openapitools.model.AdGroupResponseAllOf1;
import org.openapitools.model.AdGroupSummaryStatus;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TrackingUrls;

@Canonical
class AdGroupResponse {
    /* Ad group name. */
    String name
    /* Ad group/entity status. */
    EntityStatus status
    /* Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */
    Integer budgetInMicroCurrency
    /* Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. */
    Integer bidInMicroCurrency
    /* Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. */
    String budgetType
    /* Ad group start time. Unix timestamp in seconds. Defaults to current time. */
    Integer startTime
    /* Ad group end time. Unix timestamp in seconds. */
    Integer endTime
    /* Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}' */
    Map<String, List<String>> targetingSpec = new HashMap<String, List<String>>()
    /* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field. */
    Integer lifetimeFrequencyCap
    /* Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>. */
    TrackingUrls trackingUrls
    /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
    Boolean autoTargetingEnabled
    /* <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>. */
    PlacementGroupType placementGroup
    /* Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. */
    PacingDeliveryType pacingDeliveryType
    /* oCPM learn mode */
    String conversionLearningModeType
    /* Ad group summary status. */
    AdGroupSummaryStatus summaryStatus
    /* Feed Profile ID associated to the adgroup. */
    String feedProfileId
    /* Campaign ID of the ad group. */
    String campaignId
    
    ActionType billableEvent
    /* Ad group ID. */
    String id
    /* Always \"adgroup\". */
    String type
    /* Advertiser ID. */
    String adAccountId
    /* Ad group creation time. Unix timestamp in seconds. */
    Integer createdTime
    /* Ad group last update time. Unix timestamp in seconds. */
    Integer updatedTime
}
