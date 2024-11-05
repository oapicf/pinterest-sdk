package org.openapitools.server.model


/**
 * @param updatedAssetGroups A list of successfully edited asset groups. for example: ''null''
 * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error. for example: ''null''
*/
final case class UpdateAssetGroupResponse (
  updatedAssetGroups: Option[Seq[AssetGroupBinding]] = None,
  exceptions: Option[Seq[UpdateAssetGroupResponseExceptionsInner]] = None
)

