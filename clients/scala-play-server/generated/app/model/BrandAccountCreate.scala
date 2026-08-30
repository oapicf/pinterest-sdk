package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param about Brand Account about information
  * @param name Brand Account name
  * @param username Brand Account username
  * @param website Brand Account website
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BrandAccountCreate(
  about: Option[String],
  country: Country,
  name: String,
  profileImage: Option[BrandAccountProfileImage],
  username: String,
  website: Option[String]
)

object BrandAccountCreate {
  implicit lazy val brandAccountCreateJsonFormat: Format[BrandAccountCreate] = Json.format[BrandAccountCreate]
}

