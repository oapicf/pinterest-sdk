package model

import play.api.libs.json._

/**
  * Permission levels available on a business asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class Permissions(
)

object Permissions {
  implicit lazy val permissionsJsonFormat: Format[Permissions] = Json.format[Permissions]
}

