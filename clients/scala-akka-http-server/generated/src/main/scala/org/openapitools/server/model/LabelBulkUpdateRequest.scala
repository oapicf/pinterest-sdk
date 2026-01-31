package org.openapitools.server.model


/**
 * = LabelBulkUpdateRequest =
 *
 * @param id Label ID. for example: ''1106385754497''
 * @param status Set status to `ARCHIVED` to remove the label from the parent entity. for example: ''ARCHIVED''
 * @param value </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit. for example: ''null''
*/
final case class LabelBulkUpdateRequest (
  id: String,
  status: Option[String] = None,
  value: Option[String] = None
)

