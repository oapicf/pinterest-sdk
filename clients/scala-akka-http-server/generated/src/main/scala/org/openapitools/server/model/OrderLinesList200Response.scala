package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class OrderLinesList200Response (
  items: Seq[OrderLine],
  bookmark: Option[String] = None
)

