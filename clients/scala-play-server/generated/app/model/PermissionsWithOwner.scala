package model

import play.api.libs.json._

/**
  * Permission levels including the OWNER role.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PermissionsWithOwner(
)

object PermissionsWithOwner {
  implicit lazy val permissionsWithOwnerJsonFormat: Format[PermissionsWithOwner] = Json.format[PermissionsWithOwner]
}

