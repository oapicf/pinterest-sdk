package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssetGroupUpdateItemReadOrUpdateItem.
  * @param assetGroupId Unique identifier of the asset group to update.
  * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
  * @param assetsToAdd A list of asset ids to add to the asset group.
  * @param assetsToRemove A list of asset ids to remove from the asset group.
  * @param description Asset group description.
  * @param name Asset Group name.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AssetGroupUpdateItemReadOrUpdateItem(
  assetGroupId: String,
  assetGroupTypes: Option[List[AssetGroupType]],
  assetsToAdd: Option[List[String]],
  assetsToRemove: Option[List[String]],
  description: Option[String],
  name: Option[String]
)

object AssetGroupUpdateItemReadOrUpdateItem {
  implicit lazy val assetGroupUpdateItemReadOrUpdateItemJsonFormat: Format[AssetGroupUpdateItemReadOrUpdateItem] = Json.format[AssetGroupUpdateItemReadOrUpdateItem]
}

