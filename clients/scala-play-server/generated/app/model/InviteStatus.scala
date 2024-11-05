package model

import play.api.libs.json._

/**
  * The current status of the invite.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class InviteStatus(
)

object InviteStatus {
  implicit lazy val inviteStatusJsonFormat: Format[InviteStatus] = Json.format[InviteStatus]
}

