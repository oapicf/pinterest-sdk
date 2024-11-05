package model

import play.api.libs.json._

/**
  * An internal role type used on business access, EMPLOYEE, ADMIN.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class Role(
)

object Role {
  implicit lazy val roleJsonFormat: Format[Role] = Json.format[Role]
}

