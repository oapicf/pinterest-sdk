package model

import play.api.libs.json._

/**
  * Resource create or update operation model with required body fields (no OptionalProperties).
  * @param name New system user name
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class SystemUserUpdateWithRequiredBody(
  name: String
)

object SystemUserUpdateWithRequiredBody {
  implicit lazy val systemUserUpdateWithRequiredBodyJsonFormat: Format[SystemUserUpdateWithRequiredBody] = Json.format[SystemUserUpdateWithRequiredBody]
}

