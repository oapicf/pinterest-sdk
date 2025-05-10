package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateAssetAccessRequestErrorMessage_inner.
  * @param code Error code associated with the error in requesting asset access.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CreateAssetAccessRequestErrorMessageInner(
  code: Option[Int],
  messages: Option[List[String]]
)

object CreateAssetAccessRequestErrorMessageInner {
  implicit lazy val createAssetAccessRequestErrorMessageInnerJsonFormat: Format[CreateAssetAccessRequestErrorMessageInner] = Json.format[CreateAssetAccessRequestErrorMessageInner]
}

