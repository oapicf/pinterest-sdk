package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssetGroupModification.
  * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error.
  * @param updatedAssetGroups A list of successfully edited asset groups.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AssetGroupModification(
  exceptions: Option[List[AssetGroupUpdateError]],
  updatedAssetGroups: Option[List[AssetGroupBinding]]
)

object AssetGroupModification {
  implicit lazy val assetGroupModificationJsonFormat: Format[AssetGroupModification] = Json.format[AssetGroupModification]
}

