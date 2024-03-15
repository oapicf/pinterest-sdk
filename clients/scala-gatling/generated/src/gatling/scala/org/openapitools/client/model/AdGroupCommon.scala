
package org.openapitools.client.model


case class AdGroupCommon (
    /* Ad group name. */
    _name: Option[String],
    /* Ad group/entity status. */
    _status: Option[EntityStatus],
    /* Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. */
    _budgetInMicroCurrency: Option[Integer],
    /* Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. */
    _bidInMicroCurrency: Option[Integer],
    _optimizationGoalMetadata: Option[AdGroupCommonOptimizationGoalMetadata],
    _budgetType: Option[BudgetType],
    /* Ad group start time. Unix timestamp in seconds. Defaults to current time. */
    _startTime: Option[Integer],
    /* Ad group end time. Unix timestamp in seconds. */
    _endTime: Option[Integer],
    _targetingSpec: Option[TargetingSpec],
    /* Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. */
    _lifetimeFrequencyCap: Option[Integer],
    _trackingUrls: Option[AdGroupCommonTrackingUrls],
    /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
    _autoTargetingEnabled: Option[Boolean],
    /* <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>. */
    _placementGroup: Option[PlacementGroupType],
    _pacingDeliveryType: Option[PacingDeliveryType],
    /* Campaign ID of the ad group. */
    _campaignId: Option[String],
    _billableEvent: Option[ActionType],
    /* Bid strategy type */
    _bidStrategyType: Option[String]
)
object AdGroupCommon {
    def toStringBody(var_name: Object, var_status: Object, var_budgetInMicroCurrency: Object, var_bidInMicroCurrency: Object, var_optimizationGoalMetadata: Object, var_budgetType: Object, var_startTime: Object, var_endTime: Object, var_targetingSpec: Object, var_lifetimeFrequencyCap: Object, var_trackingUrls: Object, var_autoTargetingEnabled: Object, var_placementGroup: Object, var_pacingDeliveryType: Object, var_campaignId: Object, var_billableEvent: Object, var_bidStrategyType: Object) =
        s"""
        | {
        | "name":$var_name,"status":$var_status,"budgetInMicroCurrency":$var_budgetInMicroCurrency,"bidInMicroCurrency":$var_bidInMicroCurrency,"optimizationGoalMetadata":$var_optimizationGoalMetadata,"budgetType":$var_budgetType,"startTime":$var_startTime,"endTime":$var_endTime,"targetingSpec":$var_targetingSpec,"lifetimeFrequencyCap":$var_lifetimeFrequencyCap,"trackingUrls":$var_trackingUrls,"autoTargetingEnabled":$var_autoTargetingEnabled,"placementGroup":$var_placementGroup,"pacingDeliveryType":$var_pacingDeliveryType,"campaignId":$var_campaignId,"billableEvent":$var_billableEvent,"bidStrategyType":$var_bidStrategyType
        | }
        """.stripMargin
}
