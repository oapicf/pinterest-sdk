package model

import play.api.libs.json._

/**
  * Resource create or update operation model.
  * @param about Brand Account about information
  * @param name Brand Account name
  * @param username Brand Account username
  * @param website Brand Account website
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BrandAccountUpdate(
  about: Option[String],
  country: Option[Country],
  name: Option[String],
  profileImage: Option[BrandAccountProfileImageUpdate],
  username: Option[String],
  website: Option[String]
)

object BrandAccountUpdate {
  implicit lazy val brandAccountUpdateJsonFormat: Format[BrandAccountUpdate] = Json.format[BrandAccountUpdate]
}

