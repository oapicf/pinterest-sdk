package org.openapitools.server.model


/**
 * = OrderLineResponse =
 *
 * @param errors Error list if update(s) fail. for example: ''null''
 * @param orderLine Order Line object array. for example: ''null''
*/
final case class OrderLineResponse (
  errors: Option[Seq[OrderLineError]] = None,
  orderLine: Option[Seq[OrderLine]] = None
)

