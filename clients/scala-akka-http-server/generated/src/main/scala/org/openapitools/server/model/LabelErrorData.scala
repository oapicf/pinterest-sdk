package org.openapitools.server.model


/**
 * @param id Label ID. for example: ''1106385754497''
 * @param labelType  for example: ''null''
 * @param status  for example: ''null''
 * @param value Label name. 100-character limit. for example: ''null''
*/
final case class LabelErrorData (
  id: Option[String] = None,
  labelType: Option[NullableLabelType] = None,
  status: Option[NullableLabelStatus] = None,
  value: Option[String] = None
)

