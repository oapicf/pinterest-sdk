package model

import play.api.libs.json._

/**
  * This field is **OPTIONAL**. Use this if your feed file requires username and password.
  * @param password The required password for downloading a feed.
  * @param username The required username for downloading a feed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsFeedCredentials(
  password: String,
  username: String
)

object CatalogsFeedCredentials {
  implicit lazy val catalogsFeedCredentialsJsonFormat: Format[CatalogsFeedCredentials] = Json.format[CatalogsFeedCredentials]
}

