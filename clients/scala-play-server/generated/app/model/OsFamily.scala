package model

import play.api.libs.json._

/**
  * Operating system family.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OsFamily(
)

object OsFamily {
  implicit lazy val osFamilyJsonFormat: Format[OsFamily] = Json.format[OsFamily]
}

