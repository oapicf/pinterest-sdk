package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssetGroupUpdateError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AssetGroupUpdateError(
  assetGroupId: Option[String],
  code: Option[Int],
  message: Option[String]
)

object AssetGroupUpdateError {
  implicit lazy val assetGroupUpdateErrorJsonFormat: Format[AssetGroupUpdateError] = Json.format[AssetGroupUpdateError]
}

