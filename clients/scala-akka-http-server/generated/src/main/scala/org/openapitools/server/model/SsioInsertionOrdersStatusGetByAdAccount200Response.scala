package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items Insertion orders status by ad acount id for example: ''null''
*/
final case class SsioInsertionOrdersStatusGetByAdAccount200Response (
  bookmark: Option[String] = None,
  items: Seq[SSIOInsertionOrderStatus]
)

