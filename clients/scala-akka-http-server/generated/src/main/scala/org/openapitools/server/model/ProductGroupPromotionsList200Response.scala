package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class ProductGroupPromotionsList200Response (
  items: Seq[ProductGroupPromotionResponseItem],
  bookmark: Option[String] = None
)

