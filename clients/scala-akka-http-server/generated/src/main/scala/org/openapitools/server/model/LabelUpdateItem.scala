package org.openapitools.server.model


/**
 * @param id Label ID. for example: ''1106385754497''
 * @param status  for example: ''null''
 * @param value Label name. 100-character limit. for example: ''null''
*/
final case class LabelUpdateItem (
  id: String,
  status: Option[LabelStatus] = None,
  value: Option[String] = None
)

