package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaWithVideo._

case class PinMediaWithVideo (
  coverImageUrl: Option[String],
/* Duration (in miliseconds). Field maybe null after creation due to video processing time. */
  duration: Option[BigDecimal],
/* Height (in pixels). Field maybe null after creation due to video processing time. */
  height: Option[Integer],
images: Option[ImageSize],
mediaType: MediaType,
/* Video url (720p).  **Note:** This field is limited and not available to all apps. */
  videoUrl: Option[String],
/* Width (in pixels). Field maybe null after creation due to video processing time. */
  width: Option[Integer])

object PinMediaWithVideo {
  import DateTimeCodecs._
  sealed trait MediaType
  case object Video extends MediaType

  object MediaType {
    def toMediaType(s: String): Option[MediaType] = s match {
      case "Video" => Some(Video)
      case _ => None
    }

    def fromMediaType(x: MediaType): String = x match {
      case Video => "Video"
    }
  }

  implicit val MediaTypeEnumEncoder: EncodeJson[MediaType] =
    EncodeJson[MediaType](is => StringEncodeJson(MediaType.fromMediaType(is)))

  implicit val MediaTypeEnumDecoder: DecodeJson[MediaType] =
    DecodeJson.optionDecoder[MediaType](n => n.string.flatMap(jStr => MediaType.toMediaType(jStr)), "MediaType failed to de-serialize")

  implicit val PinMediaWithVideoCodecJson: CodecJson[PinMediaWithVideo] = CodecJson.derive[PinMediaWithVideo]
  implicit val PinMediaWithVideoDecoder: EntityDecoder[PinMediaWithVideo] = jsonOf[PinMediaWithVideo]
  implicit val PinMediaWithVideoEncoder: EntityEncoder[PinMediaWithVideo] = jsonEncoderOf[PinMediaWithVideo]
}
