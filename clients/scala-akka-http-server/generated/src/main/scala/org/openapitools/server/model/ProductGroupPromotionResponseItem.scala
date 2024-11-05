package org.openapitools.server.model


/**
 * = ProductGroupPromotionResponseItem =
 *
 * @param data  for example: ''null''
 * @param exceptions  for example: ''null''
*/
final case class ProductGroupPromotionResponseItem (
  data: Option[ProductGroupPromotionResponseElement] = None,
  exceptions: Option[Seq[Exception]] = None
)

