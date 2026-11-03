package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccountOwner.
  * @param id The owning account's user ID.
  * @param username Public username for the user account
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdAccountOwner(
  id: Option[String],
  username: Option[String]
)

object AdAccountOwner {
  implicit lazy val adAccountOwnerJsonFormat: Format[AdAccountOwner] = Json.format[AdAccountOwner]
}

