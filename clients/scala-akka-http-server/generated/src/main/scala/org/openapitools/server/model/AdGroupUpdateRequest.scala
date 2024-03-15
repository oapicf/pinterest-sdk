package org.openapitools.server.model


/**
 * @param name Ad group name. for example: ''Ad Group For Pin: 687195905986''
 * @param status Ad group/entity status. for example: ''null''
 * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. for example: ''5000000''
 * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. for example: ''5000000''
 * @param optimizationGoalMetadata  for example: ''null''
 * @param budgetType  for example: ''null''
 * @param startTime Ad group start time. Unix timestamp in seconds. Defaults to current time. for example: ''5686848000''
 * @param endTime Ad group end time. Unix timestamp in seconds. for example: ''5705424000''
 * @param targetingSpec  for example: ''null''
 * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. for example: ''100''
 * @param trackingUrls  for example: ''null''
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. for example: ''true''
 * @param placementGroup <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>. for example: ''null''
 * @param pacingDeliveryType  for example: ''null''
 * @param campaignId Campaign ID of the ad group. for example: ''626736533506''
 * @param billableEvent  for example: ''null''
 * @param bidStrategyType Bid strategy type for example: ''MAX_BID''
 * @param id Ad group ID. for example: ''2680060704746''
*/
final case class AdGroupUpdateRequest (
  name: Option[String] = None,
  status: Option[EntityStatus] = None,
  budgetInMicroCurrency: Option[Int] = None,
  bidInMicroCurrency: Option[Int] = None,
  optimizationGoalMetadata: Option[AdGroupCommonOptimizationGoalMetadata] = None,
  budgetType: Option[BudgetType] = None,
  startTime: Option[Int] = None,
  endTime: Option[Int] = None,
  targetingSpec: Option[TargetingSpec] = None,
  lifetimeFrequencyCap: Option[Int] = None,
  trackingUrls: Option[AdGroupCommonTrackingUrls] = None,
  autoTargetingEnabled: Option[Boolean] = None,
  placementGroup: Option[PlacementGroupType] = None,
  pacingDeliveryType: Option[PacingDeliveryType] = None,
  campaignId: Option[String] = None,
  billableEvent: Option[ActionType] = None,
  bidStrategyType: Option[String] = None,
  id: String
)

