package model

import play.api.libs.json._

/**
  * An object with a list of all the invites the user would like to respond to and the action to take.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuthRespondInvitesBody(
  invites: List[AuthRespondInvitesBodyInvitesInner]
)

object AuthRespondInvitesBody {
  implicit lazy val authRespondInvitesBodyJsonFormat: Format[AuthRespondInvitesBody] = Json.format[AuthRespondInvitesBody]
}

