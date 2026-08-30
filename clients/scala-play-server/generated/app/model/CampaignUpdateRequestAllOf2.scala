package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignUpdateRequestAllOf2.
  * @param isLtvOptimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
  * @param isPerformancePlus Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
  * @param isTopOfSearch Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignUpdateRequestAllOf2(
  bidOptions: Option[CampaignBidOptionsUpdate],
  intendedPromotionType: Option[IntendedPromotionType],
  isLtvOptimized: Option[Boolean],
  isPerformancePlus: Option[Boolean],
  isTopOfSearch: Option[Boolean],
  objectiveType: Option[ObjectiveType]
)

object CampaignUpdateRequestAllOf2 {
  implicit lazy val campaignUpdateRequestAllOf2JsonFormat: Format[CampaignUpdateRequestAllOf2] = Json.format[CampaignUpdateRequestAllOf2]
}

