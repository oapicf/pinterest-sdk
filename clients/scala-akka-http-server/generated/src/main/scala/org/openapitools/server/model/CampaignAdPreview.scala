package org.openapitools.server.model


/**
 * = CampaignAdPreviewData =
 *
 * Campaign ad preview record.
 *
 * @param adAccountId Advertiser ID for this preview. for example: ''549755885175''
 * @param adGroupId Ad group ID to create a preview record for. for example: ''1234567890''
 * @param clientId Client ID that created preview. for example: ''null''
 * @param expiresAt Unix timestamp in milliseconds for preview expiration. for example: ''null''
 * @param isActive Whether preview link is active. for example: ''null''
 * @param pinId Pin ID for pin promotion preview. for example: ''null''
 * @param pinPromotionId Pin promotion ID for this preview. for example: ''null''
 * @param promotedProductGroupId Promoted product group ID for catalog previews. for example: ''null''
 * @param url Campaign ad preview URL. for example: ''https://ads.pinterest.com/web-ad-preview/748db198-bd61-4a6f-b756-996c034e8cbb/''
 * @param userId User ID that created preview. for example: ''null''
 * @param uuid Pin promotion preview key. for example: ''null''
*/
final case class CampaignAdPreview (
  adAccountId: String,
  adGroupId: String,
  clientId: Option[Int] = None,
  expiresAt: Int,
  isActive: Boolean,
  pinId: Option[Int] = None,
  pinPromotionId: Option[Int] = None,
  promotedProductGroupId: Option[Int] = None,
  url: String,
  userId: Int,
  uuid: String
)

