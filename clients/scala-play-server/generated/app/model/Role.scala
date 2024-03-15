package model

import play.api.libs.json._

/**
  * An internal role type used on business access, EMPLOYEE, ADMIN.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class Role(
)

object Role {
  implicit lazy val roleJsonFormat: Format[Role] = Json.format[Role]
}

