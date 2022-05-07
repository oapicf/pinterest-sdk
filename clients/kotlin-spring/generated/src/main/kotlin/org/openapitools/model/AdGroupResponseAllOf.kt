package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdGroupSummaryStatus
import org.openapitools.model.EntityStatus
import org.openapitools.model.PacingDeliveryType
import org.openapitools.model.PlacementGroupType
import org.openapitools.model.TrackingUrls
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param name Ad group name.
 * @param status Ad group/entity status.
 * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
 * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
 * @param budgetType Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
 * @param startTime Ad group start time. Unix timestamp in seconds. Defaults to current time.
 * @param endTime Ad group end time. Unix timestamp in seconds.
 * @param targetingSpec Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'
 * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
 * @param trackingUrls Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @param placementGroup <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>.
 * @param pacingDeliveryType Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.
 * @param conversionLearningModeType oCPM learn mode
 * @param summaryStatus Ad group summary status.
 * @param feedProfileId Feed Profile ID associated to the adgroup.
 */
data class AdGroupResponseAllOf(

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("status") val status: EntityStatus? = null,

    @field:JsonProperty("budget_in_micro_currency") val budgetInMicroCurrency: kotlin.Int? = null,

    @field:JsonProperty("bid_in_micro_currency") val bidInMicroCurrency: kotlin.Int? = null,

    @field:JsonProperty("budget_type") val budgetType: AdGroupResponseAllOf.BudgetType? = null,

    @field:JsonProperty("start_time") val startTime: kotlin.Int? = null,

    @field:JsonProperty("end_time") val endTime: kotlin.Int? = null,

    @field:JsonProperty("targeting_spec") val targetingSpec: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null,

    @field:JsonProperty("lifetime_frequency_cap") val lifetimeFrequencyCap: kotlin.Int? = null,

    @field:Valid
    @field:JsonProperty("tracking_urls") val trackingUrls: TrackingUrls? = null,

    @field:JsonProperty("auto_targeting_enabled") val autoTargetingEnabled: kotlin.Boolean? = null,

    @field:Valid
    @field:JsonProperty("placement_group") val placementGroup: PlacementGroupType? = null,

    @field:Valid
    @field:JsonProperty("pacing_delivery_type") val pacingDeliveryType: PacingDeliveryType? = null,

    @field:JsonProperty("conversion_learning_mode_type") val conversionLearningModeType: AdGroupResponseAllOf.ConversionLearningModeType? = null,

    @field:Valid
    @field:JsonProperty("summary_status") val summaryStatus: AdGroupSummaryStatus? = null,

    @field:JsonProperty("feed_profile_id") val feedProfileId: kotlin.String? = null
) {

    /**
    * Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.
    * Values: dAILY,lIFETIME,cBOADGROUP
    */
    enum class BudgetType(val value: kotlin.String) {
    
        @JsonProperty("DAILY") dAILY("DAILY"),
    
        @JsonProperty("LIFETIME") lIFETIME("LIFETIME"),
    
        @JsonProperty("CBO_ADGROUP") cBOADGROUP("CBO_ADGROUP");
    
    }

    /**
    * oCPM learn mode
    * Values: nOTACTIVE,aCTIVE,`null`
    */
    enum class ConversionLearningModeType(val value: kotlin.String) {
    
        @JsonProperty("NOT_ACTIVE") nOTACTIVE("NOT_ACTIVE"),
    
        @JsonProperty("ACTIVE") aCTIVE("ACTIVE"),
    
        @JsonProperty("null") `null`("null");
    
    }

}

