package org.openapitools.server.model


/**
 * = PromotionArrayElement =
 *
 * @param data  for example: ''null''
 * @param exception  for example: ''null''
*/
final case class PromotionArrayElement (
  data: Option[PromotionResponse] = None,
  exception: Option[Exception] = None
)

