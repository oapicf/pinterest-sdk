package model

import play.api.libs.json._

/**
  * An object containing the permissions a business has on the asset.
  * @param assetGroupInfo An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
  * @param assetId Unique identifier of a business asset.
  * @param permissions Permission levels the requesting business has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BaseBusinessAssets(
  assetGroupInfo: Option[AssetGroupBinding],
  assetId: Option[String],
  assetType: Option[AssetTypeResponse],
  permissions: Option[List[String]]
)

object BaseBusinessAssets {
  implicit lazy val baseBusinessAssetsJsonFormat: Format[BaseBusinessAssets] = Json.format[BaseBusinessAssets]
}

