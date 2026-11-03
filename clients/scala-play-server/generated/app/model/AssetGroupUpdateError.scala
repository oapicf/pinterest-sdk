package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssetGroupUpdateError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AssetGroupUpdateError(
  assetGroupId: Option[String],
  code: Option[Int],
  message: Option[String]
)

object AssetGroupUpdateError {
  implicit lazy val assetGroupUpdateErrorJsonFormat: Format[AssetGroupUpdateError] = Json.format[AssetGroupUpdateError]
}

