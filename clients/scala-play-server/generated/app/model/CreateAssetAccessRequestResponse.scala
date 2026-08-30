package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateAssetAccessRequestResponse.
  * @param exceptions A list of errors associated with the asset access requests. Will be returned if there is an error.
  * @param invites An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CreateAssetAccessRequestResponse(
  exceptions: Option[List[AssetAccessRequestError]],
  invites: Option[Map[String, String]],
)

object CreateAssetAccessRequestResponse {
  implicit lazy val createAssetAccessRequestResponseJsonFormat: Format[CreateAssetAccessRequestResponse] = Json.format[CreateAssetAccessRequestResponse]
}

