package model

import play.api.libs.json._

/**
  * Created/updated resource on success or error details on failure
  * @param adAccountId Advertiser ID for this preview.
  * @param adGroupId Ad group ID to create a preview record for.
  * @param clientId Client ID that created preview.
  * @param expiresAt Unix timestamp in milliseconds for preview expiration.
  * @param isActive Whether preview link is active.
  * @param pinId Pin ID for pin promotion preview.
  * @param pinPromotionId Pin promotion ID for this preview.
  * @param promotedProductGroupId Promoted product group ID for catalog previews.
  * @param url Campaign ad preview URL.
  * @param userId User ID that created preview.
  * @param uuid Pin promotion preview key.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignAdPreviewCreate200ResponseInnerData(
  adAccountId: String,
  adGroupId: String,
  clientId: Option[Int],
  expiresAt: Int,
  isActive: Boolean,
  pinId: Option[Int],
  pinPromotionId: Option[Int],
  promotedProductGroupId: Option[Int],
  url: String,
  userId: Int,
  uuid: String,
  exceptions: Error
)

object CampaignAdPreviewCreate200ResponseInnerData {
  implicit lazy val campaignAdPreviewCreate200ResponseInnerDataJsonFormat: Format[CampaignAdPreviewCreate200ResponseInnerData] = Json.format[CampaignAdPreviewCreate200ResponseInnerData]
}

