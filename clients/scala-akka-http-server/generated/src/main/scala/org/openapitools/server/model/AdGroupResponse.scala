package org.openapitools.server.model


/**
 * @param name Ad group name. for example: ''Ad Group For Pin: 687195905986''
 * @param status Ad group/entity status. for example: ''null''
 * @param budgetInMicroCurrency Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. for example: ''5000000''
 * @param bidInMicroCurrency Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. for example: ''5000000''
 * @param budgetType Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. for example: ''null''
 * @param startTime Ad group start time. Unix timestamp in seconds. Defaults to current time. for example: ''5686848000''
 * @param endTime Ad group end time. Unix timestamp in seconds. for example: ''5705424000''
 * @param targetingSpec Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}' for example: ''null''
 * @param lifetimeFrequencyCap Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field. for example: ''100''
 * @param trackingUrls Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>. for example: ''null''
 * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. for example: ''true''
 * @param placementGroup <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>. for example: ''null''
 * @param pacingDeliveryType Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. for example: ''null''
 * @param conversionLearningModeType oCPM learn mode for example: ''ACTIVE''
 * @param summaryStatus Ad group summary status. for example: ''null''
 * @param feedProfileId Feed Profile ID associated to the adgroup. for example: ''626736533506''
 * @param campaignId Campaign ID of the ad group. for example: ''626736533506''
 * @param billableEvent  for example: ''null''
 * @param id Ad group ID. for example: ''2680060704746''
 * @param `type` Always \"adgroup\". for example: ''null''
 * @param adAccountId Advertiser ID. for example: ''549755885175''
 * @param createdTime Ad group creation time. Unix timestamp in seconds. for example: ''1476477189''
 * @param updatedTime Ad group last update time. Unix timestamp in seconds. for example: ''1476477189''
*/
final case class AdGroupResponse (
  name: Option[String],
  status: Option[EntityStatus],
  budgetInMicroCurrency: Option[Int],
  bidInMicroCurrency: Option[Int],
  budgetType: Option[String],
  startTime: Option[Int],
  endTime: Option[Int],
  targetingSpec: Option[Map[String, Seq[String]]],
  lifetimeFrequencyCap: Option[Int],
  trackingUrls: Option[TrackingUrls],
  autoTargetingEnabled: Option[Boolean],
  placementGroup: Option[PlacementGroupType],
  pacingDeliveryType: Option[PacingDeliveryType],
  conversionLearningModeType: Option[String],
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

