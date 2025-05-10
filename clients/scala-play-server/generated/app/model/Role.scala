package model

import play.api.libs.json._

/**
  * An internal role type used on business access, EMPLOYEE, ADMIN.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class Role(
)

object Role {
  implicit lazy val roleJsonFormat: Format[Role] = Json.format[Role]
}

