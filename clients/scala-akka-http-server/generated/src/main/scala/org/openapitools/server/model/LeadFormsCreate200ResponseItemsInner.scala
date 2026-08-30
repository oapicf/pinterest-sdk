package org.openapitools.server.model


/**
 * @param data  for example: ''null''
 * @param exceptions  for example: ''null''
*/
final case class LeadFormsCreate200ResponseItemsInner (
  data: Option[LeadForm] = None,
  exceptions: Option[Seq[BatchItemException]] = None
)

