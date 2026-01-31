package model

import play.api.libs.json._

/**
  * Permission role for business access.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BusinessAccessRole(
)

object BusinessAccessRole {
  implicit lazy val businessAccessRoleJsonFormat: Format[BusinessAccessRole] = Json.format[BusinessAccessRole]
}

