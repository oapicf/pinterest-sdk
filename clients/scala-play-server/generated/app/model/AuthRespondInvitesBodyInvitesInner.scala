package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AuthRespondInvitesBody_invites_inner.
  * @param inviteId Unique identifier of an invite.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AuthRespondInvitesBodyInvitesInner(
  action: AuthRespondInvitesBodyInvitesInnerAction,
  inviteId: String
)

object AuthRespondInvitesBodyInvitesInner {
  implicit lazy val authRespondInvitesBodyInvitesInnerJsonFormat: Format[AuthRespondInvitesBodyInvitesInner] = Json.format[AuthRespondInvitesBodyInvitesInner]
}

