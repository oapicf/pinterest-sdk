package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateAssetAccessRequestErrorMessage_inner.
  * @param code Error code associated with the error in requesting asset access.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateAssetAccessRequestErrorMessageInner(
  code: Option[Int],
  messages: Option[List[String]]
)

object CreateAssetAccessRequestErrorMessageInner {
  implicit lazy val createAssetAccessRequestErrorMessageInnerJsonFormat: Format[CreateAssetAccessRequestErrorMessageInner] = Json.format[CreateAssetAccessRequestErrorMessageInner]
}

