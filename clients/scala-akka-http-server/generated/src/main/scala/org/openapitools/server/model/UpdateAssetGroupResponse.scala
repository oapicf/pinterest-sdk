package org.openapitools.server.model


/**
 * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error. for example: ''null''
 * @param updatedAssetGroups A list of successfully edited asset groups. for example: ''null''
*/
final case class UpdateAssetGroupResponse (
  exceptions: Option[Seq[UpdateAssetGroupResponseExceptionsInner]] = None,
  updatedAssetGroups: Option[Seq[AssetGroupBinding]] = None
)

