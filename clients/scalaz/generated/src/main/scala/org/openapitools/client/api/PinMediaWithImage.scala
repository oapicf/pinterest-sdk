package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaWithImage._

case class PinMediaWithImage (
  images: Option[ImageSize],
mediaType: MediaType)

object PinMediaWithImage {
  import DateTimeCodecs._
  sealed trait MediaType
  case object Image extends MediaType

  object MediaType {
    def toMediaType(s: String): Option[MediaType] = s match {
      case "Image" => Some(Image)
      case _ => None
    }

    def fromMediaType(x: MediaType): String = x match {
      case Image => "Image"
    }
  }

  implicit val MediaTypeEnumEncoder: EncodeJson[MediaType] =
    EncodeJson[MediaType](is => StringEncodeJson(MediaType.fromMediaType(is)))

  implicit val MediaTypeEnumDecoder: DecodeJson[MediaType] =
    DecodeJson.optionDecoder[MediaType](n => n.string.flatMap(jStr => MediaType.toMediaType(jStr)), "MediaType failed to de-serialize")

  implicit val PinMediaWithImageCodecJson: CodecJson[PinMediaWithImage] = CodecJson.derive[PinMediaWithImage]
  implicit val PinMediaWithImageDecoder: EntityDecoder[PinMediaWithImage] = jsonOf[PinMediaWithImage]
  implicit val PinMediaWithImageEncoder: EntityEncoder[PinMediaWithImage] = jsonEncoderOf[PinMediaWithImage]
}
