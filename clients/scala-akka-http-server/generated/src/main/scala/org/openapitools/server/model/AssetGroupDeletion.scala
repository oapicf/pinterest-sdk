package org.openapitools.server.model


/**
 * @param deletedAssetGroups  for example: ''null''
 * @param exceptions  for example: ''null''
*/
final case class AssetGroupDeletion (
  deletedAssetGroups: Option[Seq[String]] = None,
  exceptions: Option[Seq[AssetGroupDeleteError]] = None
)

