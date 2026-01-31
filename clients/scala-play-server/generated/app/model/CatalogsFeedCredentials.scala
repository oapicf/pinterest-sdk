package model

import play.api.libs.json._

/**
  * This field is **OPTIONAL**. Use this if your feed file requires username and password.
  * @param password The required password for downloading a feed.
  * @param username The required username for downloading a feed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsFeedCredentials(
  password: String,
  username: String
)

object CatalogsFeedCredentials {
  implicit lazy val catalogsFeedCredentialsJsonFormat: Format[CatalogsFeedCredentials] = Json.format[CatalogsFeedCredentials]
}

