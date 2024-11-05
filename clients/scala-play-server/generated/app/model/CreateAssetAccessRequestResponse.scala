package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateAssetAccessRequestResponse.
  * @param exceptions A list of errors associated with the asset access requests. Will be returned if there is an error.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateAssetAccessRequestResponse(
  exceptions: Option[List[CreateAssetAccessRequestErrorMessageInner]],
  invites: Option[Map[String, String]],
)

object CreateAssetAccessRequestResponse {
  implicit lazy val createAssetAccessRequestResponseJsonFormat: Format[CreateAssetAccessRequestResponse] = Json.format[CreateAssetAccessRequestResponse]
}

