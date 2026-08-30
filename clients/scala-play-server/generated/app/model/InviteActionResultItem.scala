package model

import play.api.libs.json._

/**
  * An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class InviteActionResultItem(
  exception: Option[InviteExceptionResponse],
  invite: Option[InviteBusinessRoleBinding]
)

object InviteActionResultItem {
  implicit lazy val inviteActionResultItemJsonFormat: Format[InviteActionResultItem] = Json.format[InviteActionResultItem]
}

