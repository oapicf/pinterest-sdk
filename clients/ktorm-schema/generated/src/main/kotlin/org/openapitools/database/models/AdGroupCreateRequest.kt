/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
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
 * @param campaignId Campaign ID of the ad group.
 * @param billableEvent 
 * @param status Ad group/entity status.
 * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
 * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
 * @param optimizationGoalMetadata Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
 * @param budgetType 
 * @param startTime Ad group start time. Unix timestamp in seconds. Defaults to current time.
 * @param endTime Ad group end time. Unix timestamp in seconds.
 * @param targetingSpec 
 * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
 * @param trackingUrls Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 * @param autoTargetingEnabled Enable auto-targeting for ad group.Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @param placementGroup <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @param pacingDeliveryType 
 * @param bidStrategyType Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.
 * @param targetingTemplateIds Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
 */
object AdGroupCreateRequests : BaseTable<AdGroupCreateRequest>("AdGroupCreateRequest") {
    val name = text("name") /* Ad group name. */
    val campaignId = text("campaign_id") /* Campaign ID of the ad group. */
    val billableEvent = long("billable_event")
    val status = long("status") /* null */ /* Ad group/entity status. */
    val budgetInMicroCurrency = int("budget_in_micro_currency") /* null */ /* Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */
    val bidInMicroCurrency = int("bid_in_micro_currency") /* null */ /* Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. */
    val optimizationGoalMetadata = long("optimization_goal_metadata") /* null */ /* Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`. */
    val budgetType = long("budget_type") /* null */
    val startTime = int("start_time") /* null */ /* Ad group start time. Unix timestamp in seconds. Defaults to current time. */
    val endTime = int("end_time") /* null */ /* Ad group end time. Unix timestamp in seconds. */
    val targetingSpec = long("targeting_spec") /* null */
    val lifetimeFrequencyCap = int("lifetime_frequency_cap") /* null */ /* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. */
    val trackingUrls = long("tracking_urls") /* null */ /* Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>. */
    val autoTargetingEnabled = boolean("auto_targeting_enabled") /* null */ /* Enable auto-targeting for ad group.Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
    val placementGroup = long("placement_group") /* null */ /* <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. */
    val pacingDeliveryType = long("pacing_delivery_type") /* null */
    val bidStrategyType = text("bid_strategy_type").transform({ AdGroupCreateRequest.BidStrategyType.valueOf(it ?: "AUTOMATIC_BID") }, { it.value }) /* null */ /* Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID. */


    /**
     * Create an entity of type AdGroupCreateRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = AdGroupCreateRequest(
        name = row[name] ?: "" /* kotlin.String */ /* Ad group name. */,
        campaignId = row[campaignId] ?: "" /* kotlin.String */ /* Campaign ID of the ad group. */,
        billableEvent = ActionTypes.createEntity(row, withReferences) /* ActionType */,
        status = EntityStatuss.createEntity(row, withReferences) /* EntityStatus? */ /* Ad group/entity status. */,
        budgetInMicroCurrency = row[budgetInMicroCurrency]  /* kotlin.Int? */ /* Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */,
        bidInMicroCurrency = row[bidInMicroCurrency]  /* kotlin.Int? */ /* Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. */,
        optimizationGoalMetadata = OptimizationGoalMetadatas.createEntity(row, withReferences) /* OptimizationGoalMetadata? */ /* Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`. */,
        budgetType = BudgetTypes.createEntity(row, withReferences) /* BudgetType? */,
        startTime = row[startTime]  /* kotlin.Int? */ /* Ad group start time. Unix timestamp in seconds. Defaults to current time. */,
        endTime = row[endTime]  /* kotlin.Int? */ /* Ad group end time. Unix timestamp in seconds. */,
        targetingSpec = TargetingSpecs.createEntity(row, withReferences) /* TargetingSpec? */,
        lifetimeFrequencyCap = row[lifetimeFrequencyCap]  /* kotlin.Int? */ /* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. */,
        trackingUrls = TrackingUrlss.createEntity(row, withReferences) /* TrackingUrls? */ /* Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>. */,
        autoTargetingEnabled = row[autoTargetingEnabled]  /* kotlin.Boolean? */ /* Enable auto-targeting for ad group.Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */,
        placementGroup = PlacementGroupTypes.createEntity(row, withReferences) /* PlacementGroupType? */ /* <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. */,
        pacingDeliveryType = PacingDeliveryTypes.createEntity(row, withReferences) /* PacingDeliveryType? */,
        bidStrategyType = row[bidStrategyType]  /* kotlin.String? */ /* Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID. */,
        targetingTemplateIds = emptyList() /* kotlin.Array<kotlin.String>? */ /* Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. */
    )

    /**
    * Assign all the columns from the entity of type AdGroupCreateRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = AdGroupCreateRequest()
    * database.update(AdGroupCreateRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: AdGroupCreateRequest) {
        this.apply {
            set(AdGroupCreateRequests.name, entity.name)
            set(AdGroupCreateRequests.campaignId, entity.campaignId)
            set(AdGroupCreateRequests.billableEvent, entity.billableEvent)
            set(AdGroupCreateRequests.status, entity.status)
            set(AdGroupCreateRequests.budgetInMicroCurrency, entity.budgetInMicroCurrency)
            set(AdGroupCreateRequests.bidInMicroCurrency, entity.bidInMicroCurrency)
            set(AdGroupCreateRequests.optimizationGoalMetadata, entity.optimizationGoalMetadata)
            set(AdGroupCreateRequests.budgetType, entity.budgetType)
            set(AdGroupCreateRequests.startTime, entity.startTime)
            set(AdGroupCreateRequests.endTime, entity.endTime)
            set(AdGroupCreateRequests.targetingSpec, entity.targetingSpec)
            set(AdGroupCreateRequests.lifetimeFrequencyCap, entity.lifetimeFrequencyCap)
            set(AdGroupCreateRequests.trackingUrls, entity.trackingUrls)
            set(AdGroupCreateRequests.autoTargetingEnabled, entity.autoTargetingEnabled)
            set(AdGroupCreateRequests.placementGroup, entity.placementGroup)
            set(AdGroupCreateRequests.pacingDeliveryType, entity.pacingDeliveryType)
            set(AdGroupCreateRequests.bidStrategyType, entity.bidStrategyType)
        }
    }

}


object AdGroupCreateRequestTargetingTemplateIds : BaseTable<Pair<kotlin.Long, kotlin.String>>("AdGroupCreateRequestTargetingTemplateIds") {
    val adGroupCreateRequest = long("adGroupCreateRequest")
    val targetingTemplateIds = text("targetingTemplateIds")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[adGroupCreateRequest] ?: 0, row[targetingTemplateIds] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(AdGroupCreateRequestTargetingTemplateIds.adGroupCreateRequest, entity.first)
            set(AdGroupCreateRequestTargetingTemplateIds.targetingTemplateIds, entity.second)
        }
    }

}

