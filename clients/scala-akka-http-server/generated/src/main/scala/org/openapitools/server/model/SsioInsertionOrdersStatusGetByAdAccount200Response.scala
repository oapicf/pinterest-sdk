package org.openapitools.server.model


/**
 * @param items Insertion orders status by ad acount id for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class SsioInsertionOrdersStatusGetByAdAccount200Response (
  items: Seq[SSIOInsertionOrderStatus],
  bookmark: Option[String] = None
)

