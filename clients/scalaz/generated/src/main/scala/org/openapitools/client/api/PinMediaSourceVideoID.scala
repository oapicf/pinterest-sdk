package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaSourceVideoID._

case class PinMediaSourceVideoID (
  sourceType: SourceType,
coverImageUrl: String,
mediaId: String)

object PinMediaSourceVideoID {
  import DateTimeCodecs._
  sealed trait SourceType
  case object VideoId extends SourceType

  object SourceType {
    def toSourceType(s: String): Option[SourceType] = s match {
      case "VideoId" => Some(VideoId)
      case _ => None
    }

    def fromSourceType(x: SourceType): String = x match {
      case VideoId => "VideoId"
    }
  }

  implicit val SourceTypeEnumEncoder: EncodeJson[SourceType] =
    EncodeJson[SourceType](is => StringEncodeJson(SourceType.fromSourceType(is)))

  implicit val SourceTypeEnumDecoder: DecodeJson[SourceType] =
    DecodeJson.optionDecoder[SourceType](n => n.string.flatMap(jStr => SourceType.toSourceType(jStr)), "SourceType failed to de-serialize")

  implicit val PinMediaSourceVideoIDCodecJson: CodecJson[PinMediaSourceVideoID] = CodecJson.derive[PinMediaSourceVideoID]
  implicit val PinMediaSourceVideoIDDecoder: EntityDecoder[PinMediaSourceVideoID] = jsonOf[PinMediaSourceVideoID]
  implicit val PinMediaSourceVideoIDEncoder: EntityEncoder[PinMediaSourceVideoID] = jsonEncoderOf[PinMediaSourceVideoID]
}
