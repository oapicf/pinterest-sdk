package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VideoMetadata.
  * @param videoUrl Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
  * @param duration Duration (in milliseconds)
  * @param height Height (in pixels)
  * @param width Width (in pixels)
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class VideoMetadata(
  itemType: Option[String],
  coverImageUrl: Option[String],
  videoUrl: Option[String],
  duration: Option[BigDecimal],
  height: Option[Int],
  width: Option[Int]
)

object VideoMetadata {
  implicit lazy val videoMetadataJsonFormat: Format[VideoMetadata] = Json.format[VideoMetadata]
}

