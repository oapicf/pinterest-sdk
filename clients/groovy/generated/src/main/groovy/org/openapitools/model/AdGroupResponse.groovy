package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ActionType;
import org.openapitools.model.AdGroupSummaryStatus;
import org.openapitools.model.BudgetType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.OptimizationGoalMetadata;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;
import org.openapitools.model.TrackingUrls;

@Canonical
class AdGroupResponse {
    /* Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>. */
    Boolean autoTargetingEnabled
    /* Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH. */
    Integer bidInMicroCurrency

    enum BidStrategyTypeEnum {
    
        AUTOMATIC_BID("AUTOMATIC_BID"),
        
        MAX_BID("MAX_BID"),
        
        TARGET_AVG("TARGET_AVG")
    
        private final String value
    
        BidStrategyTypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\". */
    BidStrategyTypeEnum bidStrategyType
    
    ActionType billableEvent
    /* Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */
    Integer budgetInMicroCurrency
    
    BudgetType budgetType
    /* Campaign ID of the ad group. */
    String campaignId
    /* Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. */
    Integer endTime
    /* Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. */
    Boolean isCreativeOptimization
    /* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. */
    Integer lifetimeFrequencyCap
    /* Ad group name. */
    String name
    /* Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`. */
    OptimizationGoalMetadata optimizationGoalMetadata
    
    PacingDeliveryType pacingDeliveryType
    /* <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. */
    PlacementGroupType placementGroup

    enum PromotionApplicationLevelEnum {
    
        NONE("NONE"),
        
        ITEM("ITEM"),
        
        AD_GROUP("AD_GROUP")
    
        private final String value
    
        PromotionApplicationLevelEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* Specify if the promotion is applied at ad group or item level */
    PromotionApplicationLevelEnum promotionApplicationLevel
    /* Promotion ID. To clear this field, set to null. */
    String promotionId = "0"
    /* Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. */
    Integer startTime
    /* Ad group/entity status. */
    EntityStatus status
    
    TargetingSpec targetingSpec
    /* Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. */
    List<String> targetingTemplateIds
    /* Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>. */
    TrackingUrls trackingUrls
    /* Advertiser ID. */
    String adAccountId
    /* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>. */
    BigDecimal bidMultiplier

    enum ConversionLearningModeTypeEnum {
    
        NOT_ACTIVE("NOT_ACTIVE"),
        
        ACTIVE("ACTIVE")
    
        private final String value
    
        ConversionLearningModeTypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* oCPM learn mode */
    ConversionLearningModeTypeEnum conversionLearningModeType
    /* Ad group creation time. Unix timestamp in seconds. */
    Integer createdTime
    /* [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. */
    Object dcaAssets = null
    /* Feed Profile ID associated to the adgroup. */
    String feedProfileId
    /* Ad group ID. */
    String id
    /* Ad group summary status. */
    AdGroupSummaryStatus summaryStatus
    /* Always \"adgroup\". */
    String type = "adgroup"
    /* Ad group last update time. Unix timestamp in seconds. */
    Integer updatedTime
}
