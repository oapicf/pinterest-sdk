package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VideoMetadataWithItemType._

case class VideoMetadataWithItemType (
  coverImageUrl: Option[String],
/* Duration (in miliseconds). Field maybe null after creation due to video processing time. */
  duration: Option[BigDecimal],
/* Height (in pixels). Field maybe null after creation due to video processing time. */
  height: Option[Integer],
/* Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload. */
  itemType: ItemType,
/* Video url (720p).  **Note:** This field is limited and not available to all apps. */
  videoUrl: Option[String],
/* Video url (HLS).  **Note:** This field is limited and not available to all apps. */
  videoUrlHls: Option[String],
/* Width (in pixels). Field maybe null after creation due to video processing time. */
  width: Option[Integer])

object VideoMetadataWithItemType {
  import DateTimeCodecs._
  sealed trait ItemType
  case object Video extends ItemType

  object ItemType {
    def toItemType(s: String): Option[ItemType] = s match {
      case "Video" => Some(Video)
      case _ => None
    }

    def fromItemType(x: ItemType): String = x match {
      case Video => "Video"
    }
  }

  implicit val ItemTypeEnumEncoder: EncodeJson[ItemType] =
    EncodeJson[ItemType](is => StringEncodeJson(ItemType.fromItemType(is)))

  implicit val ItemTypeEnumDecoder: DecodeJson[ItemType] =
    DecodeJson.optionDecoder[ItemType](n => n.string.flatMap(jStr => ItemType.toItemType(jStr)), "ItemType failed to de-serialize")

  implicit val VideoMetadataWithItemTypeCodecJson: CodecJson[VideoMetadataWithItemType] = CodecJson.derive[VideoMetadataWithItemType]
  implicit val VideoMetadataWithItemTypeDecoder: EntityDecoder[VideoMetadataWithItemType] = jsonOf[VideoMetadataWithItemType]
  implicit val VideoMetadataWithItemTypeEncoder: EntityEncoder[VideoMetadataWithItemType] = jsonEncoderOf[VideoMetadataWithItemType]
}
