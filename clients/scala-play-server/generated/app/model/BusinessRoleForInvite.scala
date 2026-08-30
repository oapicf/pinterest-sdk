package model

import play.api.libs.json._

/**
  * The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BusinessRoleForInvite(
)

object BusinessRoleForInvite {
  implicit lazy val businessRoleForInviteJsonFormat: Format[BusinessRoleForInvite] = Json.format[BusinessRoleForInvite]
}

