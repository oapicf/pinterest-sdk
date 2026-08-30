package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VideoMetadataWithItemType.
  * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time.
  * @param height Height (in pixels). Field maybe null after creation due to video processing time.
  * @param itemType Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
  * @param videoUrl Video url (720p).  **Note:** This field is limited and not available to all apps.
  * @param videoUrlHls Video url (HLS).  **Note:** This field is limited and not available to all apps.
  * @param width Width (in pixels). Field maybe null after creation due to video processing time.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class VideoMetadataWithItemType(
  coverImageUrl: Option[String],
  duration: Option[BigDecimal],
  height: Option[Int],
  itemType: VideoMetadataWithItemType.ItemType.Value,
  videoUrl: Option[String],
  videoUrlHls: Option[String],
  width: Option[Int]
)

object VideoMetadataWithItemType {
  implicit lazy val videoMetadataWithItemTypeJsonFormat: Format[VideoMetadataWithItemType] = Json.format[VideoMetadataWithItemType]

  // noinspection TypeAnnotation
  object ItemType extends Enumeration {
    val Video = Value("video")

    type ItemType = Value
    implicit lazy val ItemTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

