package model

import play.api.libs.json._

/**
  * Request body for updating asset roles for existing invites.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CreateAssetInvitesRequest(
  invites: List[CreateAssetInvitesRequestItem]
)

object CreateAssetInvitesRequest {
  implicit lazy val createAssetInvitesRequestJsonFormat: Format[CreateAssetInvitesRequest] = Json.format[CreateAssetInvitesRequest]
}

