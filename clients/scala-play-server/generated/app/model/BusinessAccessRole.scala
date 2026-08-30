package model

import play.api.libs.json._

/**
  * Permission role for business access.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BusinessAccessRole(
)

object BusinessAccessRole {
  implicit lazy val businessAccessRoleJsonFormat: Format[BusinessAccessRole] = Json.format[BusinessAccessRole]
}

