package model

import play.api.libs.json._

/**
  * An internal role type used on business access, EMPLOYEE, ADMIN.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class Role(
)

object Role {
  implicit lazy val roleJsonFormat: Format[Role] = Json.format[Role]
}

