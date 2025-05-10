package model

import play.api.libs.json._

/**
  * The current status of the invite.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class InviteStatus(
)

object InviteStatus {
  implicit lazy val inviteStatusJsonFormat: Format[InviteStatus] = Json.format[InviteStatus]
}

