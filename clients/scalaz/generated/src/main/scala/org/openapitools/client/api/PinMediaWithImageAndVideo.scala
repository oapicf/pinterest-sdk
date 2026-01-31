package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaWithImageAndVideo._

case class PinMediaWithImageAndVideo (
  items: Option[List[PinMediaMetadata]],
mediaType: MediaType)

object PinMediaWithImageAndVideo {
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

  implicit val PinMediaWithImageAndVideoCodecJson: CodecJson[PinMediaWithImageAndVideo] = CodecJson.derive[PinMediaWithImageAndVideo]
  implicit val PinMediaWithImageAndVideoDecoder: EntityDecoder[PinMediaWithImageAndVideo] = jsonOf[PinMediaWithImageAndVideo]
  implicit val PinMediaWithImageAndVideoEncoder: EntityEncoder[PinMediaWithImageAndVideo] = jsonEncoderOf[PinMediaWithImageAndVideo]
}
