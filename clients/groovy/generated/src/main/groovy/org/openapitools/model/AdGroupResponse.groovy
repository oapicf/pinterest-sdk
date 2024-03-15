package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ActionType;
import org.openapitools.model.AdGroupCommonOptimizationGoalMetadata;
import org.openapitools.model.AdGroupCommonTrackingUrls;
import org.openapitools.model.AdGroupSummaryStatus;
import org.openapitools.model.BudgetType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PacingDeliveryType;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;

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
    
    AdGroupCommonOptimizationGoalMetadata optimizationGoalMetadata
    
    BudgetType budgetType
    /* Ad group start time. Unix timestamp in seconds. Defaults to current time. */
    Integer startTime
    /* Ad group end time. Unix timestamp in seconds. */
    Integer endTime
    
    TargetingSpec targetingSpec
    /* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. */
    Integer lifetimeFrequencyCap
    
    AdGroupCommonTrackingUrls trackingUrls
    /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
    Boolean autoTargetingEnabled
    /* <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>. */
    PlacementGroupType placementGroup
    
    PacingDeliveryType pacingDeliveryType
    /* Campaign ID of the ad group. */
    String campaignId
    
    ActionType billableEvent

    enum BidStrategyTypeEnum {
    
        AUTOMATIC_BID("AUTOMATIC_BID"),
        
        MAX_BID("MAX_BID"),
        
        TARGET_AVG("TARGET_AVG"),
        
        NULL("null")
    
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

    /* Bid strategy type */
    BidStrategyTypeEnum bidStrategyType
    /* Ad group ID. */
    String id
    /* Advertiser ID. */
    String adAccountId
    /* Ad group creation time. Unix timestamp in seconds. */
    Integer createdTime
    /* Ad group last update time. Unix timestamp in seconds. */
    Integer updatedTime
    /* Always \"adgroup\". */
    String type = "adgroup"

    enum ConversionLearningModeTypeEnum {
    
        NOT_ACTIVE("NOT_ACTIVE"),
        
        ACTIVE("ACTIVE"),
        
        NULL("null")
    
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
    /* Ad group summary status. */
    AdGroupSummaryStatus summaryStatus
    /* Feed Profile ID associated to the adgroup. */
    String feedProfileId
    /* [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. */
    Object dcaAssets = null
}
