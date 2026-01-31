package org.openapitools.server.model


/**
 * = LabelCreateRequest =
 *
 * @param labels Labels that you are applying to the campaign. for example: ''null''
 * @param parentId Unique identifier of the asset you are labelling. Currently, you can only label campaigns. for example: ''626753052072''
*/
final case class LabelCreateRequest (
  labels: Seq[LabelCreateRequestLabelsInner],
  parentId: String
)

