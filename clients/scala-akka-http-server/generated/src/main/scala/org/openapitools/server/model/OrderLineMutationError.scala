package org.openapitools.server.model


/**
 * = OrderLineMutationError =
 *
 * @param data  for example: ''null''
 * @param errorMessages Error messages. for example: ''null''
*/
final case class OrderLineMutationError (
  data: Option[OrderLine] = None,
  errorMessages: Option[Seq[String]] = None
)

