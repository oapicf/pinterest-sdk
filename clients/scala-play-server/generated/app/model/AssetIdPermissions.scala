package model

import play.api.libs.json._

/**
  * An object containing the permissions a business member has on the asset.
  * @param assetGroupInfo An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.
  * @param assetId Unique identifier of a business asset.
  * @param permissions Permission levels member or partner has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AssetIdPermissions(
  assetGroupInfo: Option[AssetGroupBinding],
  assetId: String,
  assetType: AssetTypeResponse,
  permissions: List[String]
)

object AssetIdPermissions {
  implicit lazy val assetIdPermissionsJsonFormat: Format[AssetIdPermissions] = Json.format[AssetIdPermissions]
}

