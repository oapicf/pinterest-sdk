package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignCreateRequestAllOf1._

case class CampaignCreateRequestAllOf1 (
  bidOptions: Option[CampaignBidOptionsCreate],
intendedPromotionType: Option[IntendedPromotionType],
/* Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES */
  isAutomatedCampaign: Option[Boolean],
/* Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. */
  isCampaignBudgetOptimization: Option[Boolean],
/* Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. */
  isFlexibleDailyBudgets: Option[Boolean],
/* Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. */
  isLtvOptimized: Option[Boolean],
/* Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. */
  isPerformancePlus: Option[Boolean],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>. */
  isTopOfSearch: Option[Boolean],
objectiveType: ObjectiveType,
status: Option[EntityStatus])

object CampaignCreateRequestAllOf1 {
  import DateTimeCodecs._

  implicit val CampaignCreateRequestAllOf1CodecJson: CodecJson[CampaignCreateRequestAllOf1] = CodecJson.derive[CampaignCreateRequestAllOf1]
  implicit val CampaignCreateRequestAllOf1Decoder: EntityDecoder[CampaignCreateRequestAllOf1] = jsonOf[CampaignCreateRequestAllOf1]
  implicit val CampaignCreateRequestAllOf1Encoder: EntityEncoder[CampaignCreateRequestAllOf1] = jsonEncoderOf[CampaignCreateRequestAllOf1]
}
