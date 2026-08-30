package model

import play.api.libs.json._

/**
  * Asset ID with permission levels.
  * @param id Unique identifier of a business asset.
  * @param permissions Permission levels member or partner has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AssetIdWithPermissions(
  id: Option[String],
  permissions: Option[List[String]]
)

object AssetIdWithPermissions {
  implicit lazy val assetIdWithPermissionsJsonFormat: Format[AssetIdWithPermissions] = Json.format[AssetIdWithPermissions]
}

