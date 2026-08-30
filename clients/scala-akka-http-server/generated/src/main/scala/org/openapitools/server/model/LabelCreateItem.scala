package org.openapitools.server.model


/**
 * @param labelType  for example: ''null''
 * @param value Label name. 100-character limit. for example: ''null''
*/
final case class LabelCreateItem (
  labelType: LabelType,
  value: String
)

