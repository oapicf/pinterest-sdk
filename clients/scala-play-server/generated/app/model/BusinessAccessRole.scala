package model

import play.api.libs.json._

/**
  * Permission role for business access.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BusinessAccessRole(
)

object BusinessAccessRole {
  implicit lazy val businessAccessRoleJsonFormat: Format[BusinessAccessRole] = Json.format[BusinessAccessRole]
}

