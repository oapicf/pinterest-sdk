package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LinkedBusiness.
  * @param imageLargeUrl image_large_url
  * @param imageMediumUrl image_medium_url
  * @param imageSmallUrl image_small_url
  * @param imageXlargeUrl image_xlarge_url
  * @param username Username
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LinkedBusiness(
  imageLargeUrl: Option[String],
  imageMediumUrl: Option[String],
  imageSmallUrl: Option[String],
  imageXlargeUrl: Option[String],
  username: Option[String]
)

object LinkedBusiness {
  implicit lazy val linkedBusinessJsonFormat: Format[LinkedBusiness] = Json.format[LinkedBusiness]
}

