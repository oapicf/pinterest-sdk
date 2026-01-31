package org.openapitools.server.model


/**
 * @param errors Labels that were not successfully applied. for example: ''null''
 * @param labels  for example: ''null''
*/
final case class LabelsResponse (
  errors: Option[Seq[LabelError]] = None,
  labels: Option[Seq[Label]] = None
)

