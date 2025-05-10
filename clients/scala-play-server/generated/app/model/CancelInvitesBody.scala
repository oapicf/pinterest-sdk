package model

import play.api.libs.json._

/**
  * Request body used to cancel invites
  * @param inviteIds List of invite/request ids to be cancelled
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CancelInvitesBody(
  inviteIds: List[String]
)

object CancelInvitesBody {
  implicit lazy val cancelInvitesBodyJsonFormat: Format[CancelInvitesBody] = Json.format[CancelInvitesBody]
}

