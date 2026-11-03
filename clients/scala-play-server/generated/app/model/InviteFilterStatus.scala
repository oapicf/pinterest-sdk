package model

import play.api.libs.json._

/**
  * Invite statuses used for filters.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class InviteFilterStatus(
)

object InviteFilterStatus {
  implicit lazy val inviteFilterStatusJsonFormat: Format[InviteFilterStatus] = Json.format[InviteFilterStatus]
}

