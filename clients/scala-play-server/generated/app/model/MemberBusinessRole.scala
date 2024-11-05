package model

import play.api.libs.json._

/**
  * The access level a member/partner has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. <br> - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MemberBusinessRole(
)

object MemberBusinessRole {
  implicit lazy val memberBusinessRoleJsonFormat: Format[MemberBusinessRole] = Json.format[MemberBusinessRole]
}

