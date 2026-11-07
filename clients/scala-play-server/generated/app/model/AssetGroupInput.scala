package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssetGroupInput.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AssetGroupInput(
  assetGroup: Option[AssetGroupBinding]
)

object AssetGroupInput {
  implicit lazy val assetGroupInputJsonFormat: Format[AssetGroupInput] = Json.format[AssetGroupInput]
}

