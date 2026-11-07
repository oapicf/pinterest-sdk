package model

import play.api.libs.json._

/**
  * Permission levels available on a business asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class Permissions(
)

object Permissions {
  implicit lazy val permissionsJsonFormat: Format[Permissions] = Json.format[Permissions]
}

