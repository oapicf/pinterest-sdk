package org.openapitools.server.model


/**
 * = OrderLineError =
 *
 * @param data  for example: ''null''
 * @param errorMessages  for example: ''null''
*/
final case class OrderLineError (
  data: Option[OrderLine] = None,
  errorMessages: Option[Seq[String]] = None
)

