package org.openapitools.server.model


/**
 * @param data  for example: ''null''
 * @param exceptions  for example: ''null''
*/
final case class LeadFormArrayResponseItemsInner (
  data: Option[LeadFormResponse] = None,
  exceptions: Option[Seq[Exception]] = None
)

