package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssetAccessRequestError.
  * @param code Error code associated with the error in requesting asset access.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AssetAccessRequestError(
  code: Option[Int],
  messages: Option[List[String]]
)

object AssetAccessRequestError {
  implicit lazy val assetAccessRequestErrorJsonFormat: Format[AssetAccessRequestError] = Json.format[AssetAccessRequestError]
}

