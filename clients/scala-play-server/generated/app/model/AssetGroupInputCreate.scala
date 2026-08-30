package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssetGroupInputCreate.
  * @param assetGroupDescription Asset group description.
  * @param assetGroupName Asset Group name.
  * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AssetGroupInputCreate(
  assetGroup: Option[AssetGroupBinding],
  assetGroupDescription: String,
  assetGroupName: String,
  assetGroupTypes: List[AssetGroupType]
)

object AssetGroupInputCreate {
  implicit lazy val assetGroupInputCreateJsonFormat: Format[AssetGroupInputCreate] = Json.format[AssetGroupInputCreate]
}

