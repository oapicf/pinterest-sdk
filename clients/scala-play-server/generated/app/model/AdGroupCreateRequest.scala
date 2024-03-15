package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupCreateRequest.
  * @param name Ad group name.
  * @param status Ad group/entity status.
  * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  * @param startTime Ad group start time. Unix timestamp in seconds. Defaults to current time.
  * @param endTime Ad group end time. Unix timestamp in seconds.
  * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  * @param autoTargetingEnabled Enable auto-targeting for ad group.Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  * @param placementGroup <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
  * @param campaignId Campaign ID of the ad group.
  * @param bidStrategyType Bid strategy type
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdGroupCreateRequest(
  name: String,
  status: Option[EntityStatus],
  budgetInMicroCurrency: Option[Int],
  bidInMicroCurrency: Option[Int],
  optimizationGoalMetadata: Option[AdGroupCommonOptimizationGoalMetadata],
  budgetType: Option[BudgetType],
  startTime: Option[Int],
  endTime: Option[Int],
  targetingSpec: Option[TargetingSpec],
  lifetimeFrequencyCap: Option[Int],
  trackingUrls: Option[AdGroupCommonTrackingUrls],
  autoTargetingEnabled: Option[Boolean],
  placementGroup: Option[PlacementGroupType],
  pacingDeliveryType: Option[PacingDeliveryType],
  campaignId: String,
  billableEvent: ActionType,
  bidStrategyType: Option[AdGroupCreateRequest.BidStrategyType.Value]
)

object AdGroupCreateRequest {
  implicit lazy val adGroupCreateRequestJsonFormat: Format[AdGroupCreateRequest] = Json.format[AdGroupCreateRequest]

  // noinspection TypeAnnotation
  object BidStrategyType extends Enumeration {
    val AUTOMATICBID = Value("AUTOMATIC_BID")
    val MAXBID = Value("MAX_BID")
    val TARGETAVG = Value("TARGET_AVG")
    val Null = Value("null")

    type BidStrategyType = Value
    implicit lazy val BidStrategyTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

