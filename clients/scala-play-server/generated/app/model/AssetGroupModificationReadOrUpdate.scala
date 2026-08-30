package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssetGroupModificationReadOrUpdate.
  * @param assetGroupsToUpdate A list of asset groups and the data that will be used to update them.
  * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error.
  * @param updatedAssetGroups A list of successfully edited asset groups.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AssetGroupModificationReadOrUpdate(
  assetGroupsToUpdate: Option[List[AssetGroupUpdateItemReadOrUpdateItem]],
  exceptions: Option[List[AssetGroupUpdateError]],
  updatedAssetGroups: Option[List[AssetGroupBinding]]
)

object AssetGroupModificationReadOrUpdate {
  implicit lazy val assetGroupModificationReadOrUpdateJsonFormat: Format[AssetGroupModificationReadOrUpdate] = Json.format[AssetGroupModificationReadOrUpdate]
}

