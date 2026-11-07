package model

import play.api.libs.json._

/**
  * Operating system family.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class OsFamily(
)

object OsFamily {
  implicit lazy val osFamilyJsonFormat: Format[OsFamily] = Json.format[OsFamily]
}

