package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssetGroupDeletion.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AssetGroupDeletion(
  deletedAssetGroups: Option[List[String]],
  exceptions: Option[List[AssetGroupDeleteError]]
)

object AssetGroupDeletion {
  implicit lazy val assetGroupDeletionJsonFormat: Format[AssetGroupDeletion] = Json.format[AssetGroupDeletion]
}

