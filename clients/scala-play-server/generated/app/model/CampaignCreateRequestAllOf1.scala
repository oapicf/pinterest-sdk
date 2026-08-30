package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignCreateRequestAllOf1.
  * @param isAutomatedCampaign Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
  * @param isCampaignBudgetOptimization Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
  * @param isFlexibleDailyBudgets Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
  * @param isLtvOptimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
  * @param isPerformancePlus Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
  * @param isTopOfSearch <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignCreateRequestAllOf1(
  bidOptions: Option[CampaignBidOptionsCreate],
  intendedPromotionType: Option[IntendedPromotionType],
  isAutomatedCampaign: Option[Boolean],
  isCampaignBudgetOptimization: Option[Boolean],
  isFlexibleDailyBudgets: Option[Boolean],
  isLtvOptimized: Option[Boolean],
  isPerformancePlus: Option[Boolean],
  isTopOfSearch: Option[Boolean],
  objectiveType: ObjectiveType,
  status: Option[EntityStatus]
)

object CampaignCreateRequestAllOf1 {
  implicit lazy val campaignCreateRequestAllOf1JsonFormat: Format[CampaignCreateRequestAllOf1] = Json.format[CampaignCreateRequestAllOf1]
}

