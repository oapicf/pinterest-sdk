package model

import play.api.libs.json._

/**
  * Invite statuses used for filters.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class InviteFilterStatus(
)

object InviteFilterStatus {
  implicit lazy val inviteFilterStatusJsonFormat: Format[InviteFilterStatus] = Json.format[InviteFilterStatus]
}

