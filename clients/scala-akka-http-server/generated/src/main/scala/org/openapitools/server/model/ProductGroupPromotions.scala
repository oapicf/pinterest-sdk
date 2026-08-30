package org.openapitools.server.model


/**
 * Wrapper model for ProductGroupPromotion.
 *
 * @param items Response-only: created or updated product group promotions, or exceptions. for example: ''null''
*/
final case class ProductGroupPromotions (
  items: Option[Seq[ProductGroupPromotionResponseItem]] = None
)

