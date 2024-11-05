package model

import play.api.libs.json._

/**
  * Request body for updating asset roles for existing invites.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateAssetInvitesRequest(
  invites: List[CreateAssetInvitesRequestItem]
)

object CreateAssetInvitesRequest {
  implicit lazy val createAssetInvitesRequestJsonFormat: Format[CreateAssetInvitesRequest] = Json.format[CreateAssetInvitesRequest]
}

