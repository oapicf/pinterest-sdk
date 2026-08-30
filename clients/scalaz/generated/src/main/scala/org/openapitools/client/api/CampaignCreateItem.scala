package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignCreateItem._

case class CampaignCreateItem (
  /* Setting this field does nothing. The ad account ID gets set from the path parameter. */
  adAccountId: Option[String],
/* [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for `APP_INSTALL` campaigns. */
  appId: Option[String],
/* [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for `APP_INSTALL` campaigns. */
  appPlatform: Option[MobileAppPlatform],
/* [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers. */
  bidOptions: Option[CampaignBidOptions],
/* Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. */
  dailySpendCap: Option[Integer],
/* Setting this field does nothing. */
  defaultAdGroupBudgetInMicroCurrency: Option[Integer],
/* Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. */
  endTime: Option[Integer],
intendedPromotionType: Option[IntendedPromotionType],
/* Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES */
  isAutomatedCampaign: Option[Boolean],
/* Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. */
  isCampaignBudgetOptimization: Option[Boolean],
/* Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. */
  isFlexibleDailyBudgets: Option[Boolean],
/* Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. */
  isLtvOptimized: Option[Boolean],
/* Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/) */
  isPerformancePlus: Option[Boolean],
/* Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled. */
  isTopOfSearch: Option[Boolean],
/* Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. */
  lifetimeSpendCap: Option[Integer],
/* Campaign name - 255 chars max. */
  name: String,
objectiveType: ConversionObjectiveType,
/* Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired. */
  orderLineId: Option[String],
/* Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. */
  startTime: Option[Integer],
status: Option[EntityStatus],
trackingUrls: Option[TrackingUrls])

object CampaignCreateItem {
  import DateTimeCodecs._

  implicit val CampaignCreateItemCodecJson: CodecJson[CampaignCreateItem] = CodecJson.derive[CampaignCreateItem]
  implicit val CampaignCreateItemDecoder: EntityDecoder[CampaignCreateItem] = jsonOf[CampaignCreateItem]
  implicit val CampaignCreateItemEncoder: EntityEncoder[CampaignCreateItem] = jsonEncoderOf[CampaignCreateItem]
}
