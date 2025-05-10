package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateAssetAccessRequestResponse.
  * @param exceptions A list of errors associated with the asset access requests. Will be returned if there is an error.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CreateAssetAccessRequestResponse(
  exceptions: Option[List[CreateAssetAccessRequestErrorMessageInner]],
  invites: Option[Map[String, String]],
)

object CreateAssetAccessRequestResponse {
  implicit lazy val createAssetAccessRequestResponseJsonFormat: Format[CreateAssetAccessRequestResponse] = Json.format[CreateAssetAccessRequestResponse]
}

