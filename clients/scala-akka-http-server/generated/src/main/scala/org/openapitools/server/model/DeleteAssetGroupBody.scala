package org.openapitools.server.model


/**
 * Request body used to delete asset groups
 *
 * @param assetGroupsToDelete List of ids of asset groups to be deleted for example: ''["666791336903426391","666791336903426392"]''
*/
final case class DeleteAssetGroupBody (
  assetGroupsToDelete: Seq[String]
)

