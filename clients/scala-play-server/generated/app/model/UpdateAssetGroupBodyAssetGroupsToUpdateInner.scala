package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateAssetGroupBody_asset_groups_to_update_inner.
  * @param assetGroupId Unique identifier of the asset group to update.
  * @param name Asset Group name
  * @param description Asset group description
  * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
  * @param assetsToAdd A list of asset ids to add to the asset group.
  * @param assetsToRemove A list of asset ids to remove from the asset group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class UpdateAssetGroupBodyAssetGroupsToUpdateInner(
  assetGroupId: String,
  name: Option[String],
  description: Option[String],
  assetGroupTypes: Option[List[AssetGroupType]],
  assetsToAdd: Option[List[String]],
  assetsToRemove: Option[List[String]]
)

object UpdateAssetGroupBodyAssetGroupsToUpdateInner {
  implicit lazy val updateAssetGroupBodyAssetGroupsToUpdateInnerJsonFormat: Format[UpdateAssetGroupBodyAssetGroupsToUpdateInner] = Json.format[UpdateAssetGroupBodyAssetGroupsToUpdateInner]
}

