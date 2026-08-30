package org.openapitools.server.model


/**
 * = OrderLineMutationResult =
 *
 * @param errors Error list if update(s) fail. for example: ''null''
 * @param orderLine Order Line object array. for example: ''null''
*/
final case class OrderLineMutationResult (
  errors: Option[Seq[OrderLineMutationError]] = None,
  orderLine: Option[Seq[OrderLine]] = None
)

