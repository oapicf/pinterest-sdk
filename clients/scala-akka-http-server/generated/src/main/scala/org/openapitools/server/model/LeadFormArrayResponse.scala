package org.openapitools.server.model


/**
 * @param items  for example: ''null''
*/
final case class LeadFormArrayResponse (
  items: Option[Seq[LeadFormArrayResponseItemsInner]] = None
)

