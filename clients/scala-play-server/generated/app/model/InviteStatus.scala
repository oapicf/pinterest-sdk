package model

import play.api.libs.json._

/**
  * The current status of an invite or request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class InviteStatus(
)

object InviteStatus {
  implicit lazy val inviteStatusJsonFormat: Format[InviteStatus] = Json.format[InviteStatus]
}

