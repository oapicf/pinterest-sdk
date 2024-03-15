package org.openapitools.server.model


/**
 * = ProductGroupPromotionUpdateRequest =
 *
 * @param adGroupId ID of the ad group the product group belongs to. for example: ''2680059592705''
 * @param productGroupPromotion  for example: ''null''
*/
final case class ProductGroupPromotionUpdateRequest (
  adGroupId: String,
  productGroupPromotion: Seq[ProductGroupPromotion]
)

