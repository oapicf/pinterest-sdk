package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaWithImages._

case class PinMediaWithImages (
  items: Option[List[ImageMetadata]],
mediaType: MediaType)

object PinMediaWithImages {
  import DateTimeCodecs._
  sealed trait MediaType
  case object MultipleImages extends MediaType

  object MediaType {
    def toMediaType(s: String): Option[MediaType] = s match {
      case "MultipleImages" => Some(MultipleImages)
      case _ => None
    }

    def fromMediaType(x: MediaType): String = x match {
      case MultipleImages => "MultipleImages"
    }
  }

  implicit val MediaTypeEnumEncoder: EncodeJson[MediaType] =
    EncodeJson[MediaType](is => StringEncodeJson(MediaType.fromMediaType(is)))

  implicit val MediaTypeEnumDecoder: DecodeJson[MediaType] =
    DecodeJson.optionDecoder[MediaType](n => n.string.flatMap(jStr => MediaType.toMediaType(jStr)), "MediaType failed to de-serialize")

  implicit val PinMediaWithImagesCodecJson: CodecJson[PinMediaWithImages] = CodecJson.derive[PinMediaWithImages]
  implicit val PinMediaWithImagesDecoder: EntityDecoder[PinMediaWithImages] = jsonOf[PinMediaWithImages]
  implicit val PinMediaWithImagesEncoder: EntityEncoder[PinMediaWithImages] = jsonEncoderOf[PinMediaWithImages]
}
