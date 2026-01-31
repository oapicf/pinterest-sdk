package org.openapitools.server.model


/**
 * = PromotionsResponse =
 *
 * @param promotions  for example: ''null''
*/
final case class PromotionsResponse (
  promotions: Option[Seq[PromotionArrayElement]] = None
)

