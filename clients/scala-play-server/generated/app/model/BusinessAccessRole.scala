package model

import play.api.libs.json._

/**
  * Permission role for business access.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class BusinessAccessRole(
)

object BusinessAccessRole {
  implicit lazy val businessAccessRoleJsonFormat: Format[BusinessAccessRole] = Json.format[BusinessAccessRole]
}

