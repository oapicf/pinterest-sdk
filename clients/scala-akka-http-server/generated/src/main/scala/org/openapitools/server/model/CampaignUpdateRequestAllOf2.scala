package org.openapitools.server.model


/**
 * @param bidOptions  for example: ''null''
 * @param intendedPromotionType  for example: ''null''
 * @param isLtvOptimized Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. for example: ''null''
 * @param isPerformancePlus Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field. for example: ''null''
 * @param isTopOfSearch Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. for example: ''null''
 * @param objectiveType  for example: ''null''
*/
final case class CampaignUpdateRequestAllOf2 (
  bidOptions: Option[CampaignBidOptionsUpdate] = None,
  intendedPromotionType: Option[IntendedPromotionType] = None,
  isLtvOptimized: Option[Boolean] = None,
  isPerformancePlus: Option[Boolean] = None,
  isTopOfSearch: Option[Boolean] = None,
  objectiveType: Option[ObjectiveType] = None
)

