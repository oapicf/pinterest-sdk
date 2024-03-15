package org.openapitools.server.model


/**
 * @param items SSIO order lines by ad acount id for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class SsioOrderLinesGetByAdAccount200Response (
  items: Seq[SSIOOrderLine],
  bookmark: Option[String] = None
)

