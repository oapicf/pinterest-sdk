
package org.openapitools.client.model


case class AdGroupCreateRequest (
    /* Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>. */
    _autoTargetingEnabled: Option[Boolean],
    /* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>. */
    _bidMultiplier: Option[Number],
    _budgetType: Option[BudgetType],
    _pacingDeliveryType: Option[PacingDeliveryType],
    /* Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH. */
    _bidInMicroCurrency: Option[Integer],
    _bidStrategyType: Option[BidStrategyType],
    _billableEvent: ActionType,
    /* Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */
    _budgetInMicroCurrency: Option[Integer],
    /* Campaign ID of the ad group. */
    _campaignId: String,
    /* Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. */
    _endTime: Option[Integer],
    /* Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. */
    _isCreativeOptimization: Option[Boolean],
    /* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. */
    _lifetimeFrequencyCap: Option[Integer],
    /* Ad group name. */
    _name: String,
    /* Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`. */
    _optimizationGoalMetadata: Option[Any],
    /* <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. */
    _placementGroup: Option[PlacementGroupType],
    /* Specify if the promotion is applied at ad group or item level */
    _promotionApplicationLevel: Option[String],
    /* Promotion ID. To clear this field, set to null. */
    _promotionId: Option[String],
    /* Promotion IDs list. To clear this field, set to an empty array []. */
    _promotionIds: Option[List[String]],
    /* Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. */
    _startTime: Option[Integer],
    /* Ad group/entity status. */
    _status: Option[EntityStatus],
    _targetingSpec: Option[TargetingSpec],
    /* Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. */
    _targetingTemplateIds: Option[List[String]],
    /* Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>. */
    _trackingUrls: Option[Any]
)
object AdGroupCreateRequest {
    def toStringBody(var_autoTargetingEnabled: Object, var_bidMultiplier: Object, var_budgetType: Object, var_pacingDeliveryType: Object, var_bidInMicroCurrency: Object, var_bidStrategyType: Object, var_billableEvent: Object, var_budgetInMicroCurrency: Object, var_campaignId: Object, var_endTime: Object, var_isCreativeOptimization: Object, var_lifetimeFrequencyCap: Object, var_name: Object, var_optimizationGoalMetadata: Object, var_placementGroup: Object, var_promotionApplicationLevel: Object, var_promotionId: Object, var_promotionIds: Object, var_startTime: Object, var_status: Object, var_targetingSpec: Object, var_targetingTemplateIds: Object, var_trackingUrls: Object) =
        s"""
        | {
        | "autoTargetingEnabled":$var_autoTargetingEnabled,"bidMultiplier":$var_bidMultiplier,"budgetType":$var_budgetType,"pacingDeliveryType":$var_pacingDeliveryType,"bidInMicroCurrency":$var_bidInMicroCurrency,"bidStrategyType":$var_bidStrategyType,"billableEvent":$var_billableEvent,"budgetInMicroCurrency":$var_budgetInMicroCurrency,"campaignId":$var_campaignId,"endTime":$var_endTime,"isCreativeOptimization":$var_isCreativeOptimization,"lifetimeFrequencyCap":$var_lifetimeFrequencyCap,"name":$var_name,"optimizationGoalMetadata":$var_optimizationGoalMetadata,"placementGroup":$var_placementGroup,"promotionApplicationLevel":$var_promotionApplicationLevel,"promotionId":$var_promotionId,"promotionIds":$var_promotionIds,"startTime":$var_startTime,"status":$var_status,"targetingSpec":$var_targetingSpec,"targetingTemplateIds":$var_targetingTemplateIds,"trackingUrls":$var_trackingUrls
        | }
        """.stripMargin
}
