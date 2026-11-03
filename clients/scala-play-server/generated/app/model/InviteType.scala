package model

import play.api.libs.json._

/**
  * The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner's business assets.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class InviteType(
)

object InviteType {
  implicit lazy val inviteTypeJsonFormat: Format[InviteType] = Json.format[InviteType]
}

