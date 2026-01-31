package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VideoMetadataWithItemType.
  * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time.
  * @param height Height (in pixels). Field maybe null after creation due to video processing time.
  * @param videoUrl Video url (720p).  **Note:** This field is limited and not available to all apps.
  * @param width Width (in pixels). Field maybe null after creation due to video processing time.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class VideoMetadataWithItemType(
  coverImageUrl: Option[String],
  duration: Option[BigDecimal],
  height: Option[Int],
  itemType: Option[String],
  videoUrl: Option[String],
  width: Option[Int]
)

object VideoMetadataWithItemType {
  implicit lazy val videoMetadataWithItemTypeJsonFormat: Format[VideoMetadataWithItemType] = Json.format[VideoMetadataWithItemType]
}

