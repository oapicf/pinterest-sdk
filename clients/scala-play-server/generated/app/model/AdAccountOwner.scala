package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccountOwner.
  * @param id The owning account's user ID.
  * @param username Public username for the user account
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdAccountOwner(
  id: Option[String],
  username: Option[String]
)

object AdAccountOwner {
  implicit lazy val adAccountOwnerJsonFormat: Format[AdAccountOwner] = Json.format[AdAccountOwner]
}

