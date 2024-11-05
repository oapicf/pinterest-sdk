package model

import play.api.libs.json._

/**
  * Request body used to cancel invites
  * @param inviteIds List of invite/request ids to be cancelled
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CancelInvitesBody(
  inviteIds: List[String]
)

object CancelInvitesBody {
  implicit lazy val cancelInvitesBodyJsonFormat: Format[CancelInvitesBody] = Json.format[CancelInvitesBody]
}

