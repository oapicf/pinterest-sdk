package model

import play.api.libs.json._

/**
  * Request body for updating asset roles for existing invites.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CreateAssetInvitesRequest(
  invites: List[CreateAssetInvitesRequestItem]
)

object CreateAssetInvitesRequest {
  implicit lazy val createAssetInvitesRequestJsonFormat: Format[CreateAssetInvitesRequest] = Json.format[CreateAssetInvitesRequest]
}

