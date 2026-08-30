package org.openapitools.server.model


/**
 * @param promotions  for example: ''null''
*/
final case class PromotionsResponse (
  promotions: Option[Seq[PromotionArrayElement]] = None
)

