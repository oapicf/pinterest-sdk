package model

import play.api.libs.json._

/**
  * An object with the list of invite/request ids to cancel.
  * @param inviteIds A list of invite/request ids to cancel.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CancelInvitesRequest(
  inviteIds: List[String]
)

object CancelInvitesRequest {
  implicit lazy val cancelInvitesRequestJsonFormat: Format[CancelInvitesRequest] = Json.format[CancelInvitesRequest]
}

