package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LinkedBusiness.
  * @param username Username
  * @param imageSmallUrl image_small_url
  * @param imageMediumUrl image_medium_url
  * @param imageLargeUrl image_large_url
  * @param imageXlargeUrl image_xlarge_url
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class LinkedBusiness(
  username: Option[String],
  imageSmallUrl: Option[String],
  imageMediumUrl: Option[String],
  imageLargeUrl: Option[String],
  imageXlargeUrl: Option[String]
)

object LinkedBusiness {
  implicit lazy val linkedBusinessJsonFormat: Format[LinkedBusiness] = Json.format[LinkedBusiness]
}

