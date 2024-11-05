package org.openapitools.server.model


/**
 * @param assetGroupsToUpdate A list of asset groups and the data that will be used to update them. for example: ''null''
*/
final case class UpdateAssetGroupBody (
  assetGroupsToUpdate: Option[Seq[UpdateAssetGroupBodyAssetGroupsToUpdateInner]] = None
)

