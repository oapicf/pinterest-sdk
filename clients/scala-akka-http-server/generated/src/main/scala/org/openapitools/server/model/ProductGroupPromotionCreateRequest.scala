package org.openapitools.server.model


/**
 * = ProductGroupPromotionCreateRequest =
 *
 * @param adGroupId ID of the Ad Group the Product Group Promotion belongs to. for example: ''2680059592705''
 * @param productGroupPromotion  for example: ''null''
*/
final case class ProductGroupPromotionCreateRequest (
  adGroupId: String,
  productGroupPromotion: Seq[ProductGroupPromotion]
)

