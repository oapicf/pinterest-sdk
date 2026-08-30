package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items  for example: ''null''
*/
final case class PromotionsList200Response (
  bookmark: Option[String] = None,
  items: Seq[Promotion]
)

