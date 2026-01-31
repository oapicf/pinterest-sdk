package model

import play.api.libs.json._

/**
  * The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BusinessRoleForMembers(
)

object BusinessRoleForMembers {
  implicit lazy val businessRoleForMembersJsonFormat: Format[BusinessRoleForMembers] = Json.format[BusinessRoleForMembers]
}

