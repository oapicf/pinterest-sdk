/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * 
 * @param name Ad group name.
 * @param status Ad group/entity status.
 * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
 * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
 * @param optimizationGoalMetadata 
 * @param budgetType 
 * @param startTime Ad group start time. Unix timestamp in seconds. Defaults to current time.
 * @param endTime Ad group end time. Unix timestamp in seconds.
 * @param targetingSpec 
 * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
 * @param trackingUrls 
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @param placementGroup <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @param pacingDeliveryType 
 * @param campaignId Campaign ID of the ad group.
 * @param billableEvent 
 * @param bidStrategyType Bid strategy type
 * @param id Ad group ID.
 * @param adAccountId Advertiser ID.
 * @param createdTime Ad group creation time. Unix timestamp in seconds.
 * @param updatedTime Ad group last update time. Unix timestamp in seconds.
 * @param type Always \"adgroup\".
 * @param conversionLearningModeType oCPM learn mode
 * @param summaryStatus Ad group summary status.
 * @param feedProfileId Feed Profile ID associated to the adgroup.
 * @param dcaAssets [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
 */
object AdGroupResponses : BaseTable<AdGroupResponse>("AdGroupResponse") {
    val name = text("name") /* null */ /* Ad group name. */
    val status = long("status") /* null */ /* Ad group/entity status. */
    val budgetInMicroCurrency = int("budget_in_micro_currency") /* null */ /* Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */
    val bidInMicroCurrency = int("bid_in_micro_currency") /* null */ /* Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. */
    val optimizationGoalMetadata = long("optimization_goal_metadata") /* null */
    val budgetType = long("budget_type") /* null */
    val startTime = int("start_time") /* null */ /* Ad group start time. Unix timestamp in seconds. Defaults to current time. */
    val endTime = int("end_time") /* null */ /* Ad group end time. Unix timestamp in seconds. */
    val targetingSpec = long("targeting_spec") /* null */
    val lifetimeFrequencyCap = int("lifetime_frequency_cap") /* null */ /* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. */
    val trackingUrls = long("tracking_urls") /* null */
    val autoTargetingEnabled = boolean("auto_targeting_enabled") /* null */ /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
    val placementGroup = long("placement_group") /* null */ /* <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>. */
    val pacingDeliveryType = long("pacing_delivery_type") /* null */
    val campaignId = text("campaign_id") /* null */ /* Campaign ID of the ad group. */
    val billableEvent = long("billable_event") /* null */
    val bidStrategyType = text("bid_strategy_type").transform({ AdGroupResponse.BidStrategyType.valueOf(it ?: "AUTOMATIC_BID") }, { it.value }) /* null */ /* Bid strategy type */

    val id = text("id") /* null */ /* Ad group ID. */
    val adAccountId = text("ad_account_id") /* null */ /* Advertiser ID. */
    val createdTime = int("created_time") /* null */ /* Ad group creation time. Unix timestamp in seconds. */
    val updatedTime = int("updated_time") /* null */ /* Ad group last update time. Unix timestamp in seconds. */
    val type = text("type") /* null */ /* Always \"adgroup\". */
    val conversionLearningModeType = text("conversion_learning_mode_type").transform({ AdGroupResponse.ConversionLearningModeType.valueOf(it ?: "NOT_ACTIVE") }, { it.value }) /* null */ /* oCPM learn mode */

    val summaryStatus = long("summary_status") /* null */ /* Ad group summary status. */
    val feedProfileId = text("feed_profile_id") /* null */ /* Feed Profile ID associated to the adgroup. */
    val dcaAssets = blob("dca_assets") /* null */ /* [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. */

    /**
     * Create an entity of type AdGroupResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = AdGroupResponse(
        name = row[name]  /* kotlin.String? */ /* Ad group name. */,
        status = EntityStatuss.createEntity(row, withReferences) /* EntityStatus? */ /* Ad group/entity status. */,
        budgetInMicroCurrency = row[budgetInMicroCurrency]  /* kotlin.Int? */ /* Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */,
        bidInMicroCurrency = row[bidInMicroCurrency]  /* kotlin.Int? */ /* Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. */,
        optimizationGoalMetadata = AdGroupCommonOptimizationGoalMetadatas.createEntity(row, withReferences) /* AdGroupCommonOptimizationGoalMetadata? */,
        budgetType = BudgetTypes.createEntity(row, withReferences) /* BudgetType? */,
        startTime = row[startTime]  /* kotlin.Int? */ /* Ad group start time. Unix timestamp in seconds. Defaults to current time. */,
        endTime = row[endTime]  /* kotlin.Int? */ /* Ad group end time. Unix timestamp in seconds. */,
        targetingSpec = TargetingSpecs.createEntity(row, withReferences) /* TargetingSpec? */,
        lifetimeFrequencyCap = row[lifetimeFrequencyCap]  /* kotlin.Int? */ /* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. */,
        trackingUrls = AdGroupCommonTrackingUrlss.createEntity(row, withReferences) /* AdGroupCommonTrackingUrls? */,
        autoTargetingEnabled = row[autoTargetingEnabled]  /* kotlin.Boolean? */ /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */,
        placementGroup = PlacementGroupTypes.createEntity(row, withReferences) /* PlacementGroupType? */ /* <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>. */,
        pacingDeliveryType = PacingDeliveryTypes.createEntity(row, withReferences) /* PacingDeliveryType? */,
        campaignId = row[campaignId]  /* kotlin.String? */ /* Campaign ID of the ad group. */,
        billableEvent = ActionTypes.createEntity(row, withReferences) /* ActionType? */,
        bidStrategyType = row[bidStrategyType]  /* kotlin.String? */ /* Bid strategy type */,
        id = row[id]  /* kotlin.String? */ /* Ad group ID. */,
        adAccountId = row[adAccountId]  /* kotlin.String? */ /* Advertiser ID. */,
        createdTime = row[createdTime]  /* kotlin.Int? */ /* Ad group creation time. Unix timestamp in seconds. */,
        updatedTime = row[updatedTime]  /* kotlin.Int? */ /* Ad group last update time. Unix timestamp in seconds. */,
        type = row[type] ?: "adgroup" /* kotlin.String? */ /* Always \"adgroup\". */,
        conversionLearningModeType = row[conversionLearningModeType]  /* kotlin.String? */ /* oCPM learn mode */,
        summaryStatus = AdGroupSummaryStatuss.createEntity(row, withReferences) /* AdGroupSummaryStatus? */ /* Ad group summary status. */,
        feedProfileId = row[feedProfileId]  /* kotlin.String? */ /* Feed Profile ID associated to the adgroup. */,
        dcaAssets = row[dcaAssets]  /* kotlin.Any? */ /* [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. */
    )

    /**
    * Assign all the columns from the entity of type AdGroupResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = AdGroupResponse()
    * database.update(AdGroupResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: AdGroupResponse) {
        this.apply {
            set(AdGroupResponses.name, entity.name)
            set(AdGroupResponses.status, entity.status)
            set(AdGroupResponses.budgetInMicroCurrency, entity.budgetInMicroCurrency)
            set(AdGroupResponses.bidInMicroCurrency, entity.bidInMicroCurrency)
            set(AdGroupResponses.optimizationGoalMetadata, entity.optimizationGoalMetadata)
            set(AdGroupResponses.budgetType, entity.budgetType)
            set(AdGroupResponses.startTime, entity.startTime)
            set(AdGroupResponses.endTime, entity.endTime)
            set(AdGroupResponses.targetingSpec, entity.targetingSpec)
            set(AdGroupResponses.lifetimeFrequencyCap, entity.lifetimeFrequencyCap)
            set(AdGroupResponses.trackingUrls, entity.trackingUrls)
            set(AdGroupResponses.autoTargetingEnabled, entity.autoTargetingEnabled)
            set(AdGroupResponses.placementGroup, entity.placementGroup)
            set(AdGroupResponses.pacingDeliveryType, entity.pacingDeliveryType)
            set(AdGroupResponses.campaignId, entity.campaignId)
            set(AdGroupResponses.billableEvent, entity.billableEvent)
            set(AdGroupResponses.bidStrategyType, entity.bidStrategyType)
            set(AdGroupResponses.id, entity.id)
            set(AdGroupResponses.adAccountId, entity.adAccountId)
            set(AdGroupResponses.createdTime, entity.createdTime)
            set(AdGroupResponses.updatedTime, entity.updatedTime)
            set(AdGroupResponses.type, entity.type)
            set(AdGroupResponses.conversionLearningModeType, entity.conversionLearningModeType)
            set(AdGroupResponses.summaryStatus, entity.summaryStatus)
            set(AdGroupResponses.feedProfileId, entity.feedProfileId)
            set(AdGroupResponses.dcaAssets, entity.dcaAssets)
        }
    }

}

