package org.openapitools.server.model


/**
 * = LabelBulkUpdateRequest =
 *
 * @param id Label ID. for example: ''null''
 * @param parentId Unique identifier of the asset you are labelling. Currently, you can only label campaigns. for example: ''null''
 * @param status  for example: ''null''
*/
final case class LabelBulkUpdateRequest (
  id: String,
  parentId: String,
  status: LabelStatusBulkUpdate
)

