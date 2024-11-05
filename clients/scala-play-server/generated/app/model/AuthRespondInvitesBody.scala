package model

import play.api.libs.json._

/**
  * An object with a list of all the invites the user would like to respond to and the action to take.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AuthRespondInvitesBody(
  invites: List[AuthRespondInvitesBodyInvitesInner]
)

object AuthRespondInvitesBody {
  implicit lazy val authRespondInvitesBodyJsonFormat: Format[AuthRespondInvitesBody] = Json.format[AuthRespondInvitesBody]
}

