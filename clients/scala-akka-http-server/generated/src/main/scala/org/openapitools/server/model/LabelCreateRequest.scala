package org.openapitools.server.model


/**
 * = LabelCreateRequest =
 *
 * @param labels Labels that you are applying to the campaign. for example: ''null''
*/
final case class LabelCreateRequest (
  labels: Seq[LabelCreateItem]
)

