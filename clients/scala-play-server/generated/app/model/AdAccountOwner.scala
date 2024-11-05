package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Ad_account_owner.
  * @param username Public username for the user account
  * @param id The owning account's user ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdAccountOwner(
  username: Option[String],
  id: Option[String]
)

object AdAccountOwner {
  implicit lazy val adAccountOwnerJsonFormat: Format[AdAccountOwner] = Json.format[AdAccountOwner]
}

