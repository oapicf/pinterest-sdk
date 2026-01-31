package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items SSIO order lines by ad acount id for example: ''null''
*/
final case class SsioOrderLinesGetByAdAccount200Response (
  bookmark: Option[String] = None,
  items: Seq[SSIOOrderLine]
)

