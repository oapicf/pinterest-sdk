package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMedia._

case class PinMedia (
  images: Option[ImageSize],
mediaType: MediaType,
coverImageUrl: Option[String],
/* Duration (in miliseconds). Field maybe null after creation due to video processing time. */
  duration: Option[BigDecimal],
/* Height (in pixels). Field maybe null after creation due to video processing time. */
  height: Option[Integer],
/* Video url (720p).  **Note:** This field is limited and not available to all apps. */
  videoUrl: Option[String],
/* Video url (HLS).  **Note:** This field is limited and not available to all apps. */
  videoUrlHls: Option[String],
/* Width (in pixels). Field maybe null after creation due to video processing time. */
  width: Option[Integer],
items: Option[List[PinMediaMetadata]])

object PinMedia {
  import DateTimeCodecs._
  sealed trait MediaType
  case object MultipleMixed extends MediaType

  object MediaType {
    def toMediaType(s: String): Option[MediaType] = s match {
      case "MultipleMixed" => Some(MultipleMixed)
      case _ => None
    }

    def fromMediaType(x: MediaType): String = x match {
      case MultipleMixed => "MultipleMixed"
    }
  }

  implicit val MediaTypeEnumEncoder: EncodeJson[MediaType] =
    EncodeJson[MediaType](is => StringEncodeJson(MediaType.fromMediaType(is)))

  implicit val MediaTypeEnumDecoder: DecodeJson[MediaType] =
    DecodeJson.optionDecoder[MediaType](n => n.string.flatMap(jStr => MediaType.toMediaType(jStr)), "MediaType failed to de-serialize")

  implicit val PinMediaCodecJson: CodecJson[PinMedia] = CodecJson.derive[PinMedia]
  implicit val PinMediaDecoder: EntityDecoder[PinMedia] = jsonOf[PinMedia]
  implicit val PinMediaEncoder: EntityEncoder[PinMedia] = jsonEncoderOf[PinMedia]
}
