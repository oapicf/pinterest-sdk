package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssetGroupUpdateError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AssetGroupUpdateError(
  assetGroupId: Option[String],
  code: Option[Int],
  message: Option[String]
)

object AssetGroupUpdateError {
  implicit lazy val assetGroupUpdateErrorJsonFormat: Format[AssetGroupUpdateError] = Json.format[AssetGroupUpdateError]
}

