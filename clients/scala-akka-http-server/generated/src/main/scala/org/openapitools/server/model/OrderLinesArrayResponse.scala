package org.openapitools.server.model


/**
 * = OrderLinesArrayResponse =
 *
 * @param items  for example: ''null''
*/
final case class OrderLinesArrayResponse (
  items: Option[Seq[OrderLines]] = None
)

