package org.openapitools.server.model


/**
 * @param assetGroupsToUpdate A list of asset groups and the data that will be used to update them. for example: ''null''
 * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error. for example: ''null''
 * @param updatedAssetGroups A list of successfully edited asset groups. for example: ''null''
*/
final case class AssetGroupModificationReadOrUpdate (
  assetGroupsToUpdate: Option[Seq[AssetGroupUpdateItemReadOrUpdateItem]] = None,
  exceptions: Option[Seq[AssetGroupUpdateError]] = None,
  updatedAssetGroups: Option[Seq[AssetGroupBinding]] = None
)

