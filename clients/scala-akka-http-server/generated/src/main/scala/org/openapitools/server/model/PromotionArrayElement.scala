package org.openapitools.server.model


/**
 * @param data  for example: ''null''
 * @param exception  for example: ''null''
*/
final case class PromotionArrayElement (
  data: Option[Promotion] = None,
  exception: Option[Exception] = None
)

