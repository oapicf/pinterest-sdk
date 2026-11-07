package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AuthRespondInvitesBodyItem.
  * @param inviteId Unique identifier of an invite.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AuthRespondInvitesBodyItem(
  action: AuthRespondInviteAction,
  inviteId: String
)

object AuthRespondInvitesBodyItem {
  implicit lazy val authRespondInvitesBodyItemJsonFormat: Format[AuthRespondInvitesBodyItem] = Json.format[AuthRespondInvitesBodyItem]
}

