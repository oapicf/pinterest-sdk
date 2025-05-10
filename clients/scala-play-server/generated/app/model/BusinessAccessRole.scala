package model

import play.api.libs.json._

/**
  * Permission role for business access.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class BusinessAccessRole(
)

object BusinessAccessRole {
  implicit lazy val businessAccessRoleJsonFormat: Format[BusinessAccessRole] = Json.format[BusinessAccessRole]
}

