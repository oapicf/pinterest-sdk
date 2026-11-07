package model

import play.api.libs.json._

/**
  * Invite statuses used for filters.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class InviteFilterStatus(
)

object InviteFilterStatus {
  implicit lazy val inviteFilterStatusJsonFormat: Format[InviteFilterStatus] = Json.format[InviteFilterStatus]
}

