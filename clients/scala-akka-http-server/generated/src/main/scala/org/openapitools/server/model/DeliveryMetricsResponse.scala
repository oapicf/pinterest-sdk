package org.openapitools.server.model


/**
 * @param items  for example: ''null''
*/
final case class DeliveryMetricsResponse (
  items: Option[Seq[DeliveryMetricsResponseItemsInner]] = None
)

