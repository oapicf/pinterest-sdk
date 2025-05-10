package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AuthRespondInvitesBody_invites_inner.
  * @param inviteId Unique identifier of an invite.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AuthRespondInvitesBodyInvitesInner(
  action: AuthRespondInvitesBodyInvitesInnerAction,
  inviteId: String
)

object AuthRespondInvitesBodyInvitesInner {
  implicit lazy val authRespondInvitesBodyInvitesInnerJsonFormat: Format[AuthRespondInvitesBodyInvitesInner] = Json.format[AuthRespondInvitesBodyInvitesInner]
}

