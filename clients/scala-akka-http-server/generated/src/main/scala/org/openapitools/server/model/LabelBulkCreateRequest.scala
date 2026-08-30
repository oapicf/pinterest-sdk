package org.openapitools.server.model


/**
 * = LabelBulkCreateRequest =
 *
 * @param labels Labels that you are applying to the campaign. for example: ''null''
 * @param parentId Unique identifier of the asset you are labelling. Currently, you can only label campaigns. for example: ''null''
*/
final case class LabelBulkCreateRequest (
  labels: Seq[LabelCreateItem],
  parentId: String
)

