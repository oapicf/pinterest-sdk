package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupResponse.
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
  * @param campaignId Campaign ID of the ad group.
  * @param id Ad group ID.
  * @param `type` Always \"adgroup\".
  * @param adAccountId Advertiser ID.
  * @param createdTime Ad group creation time. Unix timestamp in seconds.
  * @param updatedTime Ad group last update time. Unix timestamp in seconds.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class AdGroupResponse(
  name: Option[String],
  status: Option[EntityStatus],
  budgetInMicroCurrency: Option[Int],
  bidInMicroCurrency: Option[Int],
  budgetType: Option[AdGroupResponse.BudgetType.Value],
  startTime: Option[Int],
  endTime: Option[Int],
  targetingSpec: Option[Map[String, List[String]]],
  lifetimeFrequencyCap: Option[Int],
  trackingUrls: Option[TrackingUrls],
  autoTargetingEnabled: Option[Boolean],
  placementGroup: Option[PlacementGroupType],
  pacingDeliveryType: Option[PacingDeliveryType],
  conversionLearningModeType: Option[AdGroupResponse.ConversionLearningModeType.Value],
  summaryStatus: Option[AdGroupSummaryStatus],
  feedProfileId: Option[String],
  campaignId: Option[String],
  billableEvent: Option[ActionType],
  id: Option[String],
  `type`: Option[String],
  adAccountId: Option[String],
  createdTime: Option[Int],
  updatedTime: Option[Int]
)

object AdGroupResponse {
  implicit lazy val adGroupResponseJsonFormat: Format[AdGroupResponse] = Json.format[AdGroupResponse]

  // noinspection TypeAnnotation
  object BudgetType extends Enumeration {
    val DAILY = Value("DAILY")
    val LIFETIME = Value("LIFETIME")
    val CBOADGROUP = Value("CBO_ADGROUP")

    type BudgetType = Value
    implicit lazy val BudgetTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ConversionLearningModeType extends Enumeration {
    val NOTACTIVE = Value("NOT_ACTIVE")
    val ACTIVE = Value("ACTIVE")
    val Null = Value("null")

    type ConversionLearningModeType = Value
    implicit lazy val ConversionLearningModeTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

