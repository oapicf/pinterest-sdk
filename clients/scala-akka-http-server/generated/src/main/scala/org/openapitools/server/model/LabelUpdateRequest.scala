package org.openapitools.server.model


/**
 * = LabelUpdateRequest =
 *
 * @param labels Labels that you are applying to the campaign. for example: ''null''
*/
final case class LabelUpdateRequest (
  labels: Seq[LabelUpdateRequestLabelsInner]
)

