package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaWithVideos._

case class PinMediaWithVideos (
  items: Option[List[VideoMetadataWithItemType]],
mediaType: MediaType)

object PinMediaWithVideos {
  import DateTimeCodecs._
  sealed trait MediaType
  case object MultipleVideos extends MediaType

  object MediaType {
    def toMediaType(s: String): Option[MediaType] = s match {
      case "MultipleVideos" => Some(MultipleVideos)
      case _ => None
    }

    def fromMediaType(x: MediaType): String = x match {
      case MultipleVideos => "MultipleVideos"
    }
  }

  implicit val MediaTypeEnumEncoder: EncodeJson[MediaType] =
    EncodeJson[MediaType](is => StringEncodeJson(MediaType.fromMediaType(is)))

  implicit val MediaTypeEnumDecoder: DecodeJson[MediaType] =
    DecodeJson.optionDecoder[MediaType](n => n.string.flatMap(jStr => MediaType.toMediaType(jStr)), "MediaType failed to de-serialize")

  implicit val PinMediaWithVideosCodecJson: CodecJson[PinMediaWithVideos] = CodecJson.derive[PinMediaWithVideos]
  implicit val PinMediaWithVideosDecoder: EntityDecoder[PinMediaWithVideos] = jsonOf[PinMediaWithVideos]
  implicit val PinMediaWithVideosEncoder: EntityEncoder[PinMediaWithVideos] = jsonEncoderOf[PinMediaWithVideos]
}
