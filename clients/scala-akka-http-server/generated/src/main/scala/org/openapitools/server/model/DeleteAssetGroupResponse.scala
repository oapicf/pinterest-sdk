package org.openapitools.server.model


/**
 * @param deletedAssetGroups A list of ids of successfully deleted asset groups. for example: ''null''
 * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error. for example: ''null''
*/
final case class DeleteAssetGroupResponse (
  deletedAssetGroups: Option[Seq[String]] = None,
  exceptions: Option[Seq[DeleteAssetGroupResponseExceptionsInner]] = None
)

