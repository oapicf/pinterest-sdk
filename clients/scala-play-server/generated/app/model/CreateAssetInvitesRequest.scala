package model

import play.api.libs.json._

/**
  * Request body for updating asset roles for existing invites.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateAssetInvitesRequest(
  invites: List[CreateAssetInvitesRequestItem]
)

object CreateAssetInvitesRequest {
  implicit lazy val createAssetInvitesRequestJsonFormat: Format[CreateAssetInvitesRequest] = Json.format[CreateAssetInvitesRequest]
}

