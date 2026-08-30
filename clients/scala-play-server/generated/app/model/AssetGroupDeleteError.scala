package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssetGroupDeleteError.
  * @param assetGroupId Asset group id of the exception.
  * @param code Error code associated with the error deleting asset group.
  * @param message Error message associated with the error deleting asset group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AssetGroupDeleteError(
  assetGroupId: Option[String],
  code: Option[Int],
  message: Option[String]
)

object AssetGroupDeleteError {
  implicit lazy val assetGroupDeleteErrorJsonFormat: Format[AssetGroupDeleteError] = Json.format[AssetGroupDeleteError]
}

