package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaSourceImagesBase64._

case class PinMediaSourceImagesBase64 (
  sourceType: Option[SourceType],
/* Array with image objects. */
  items: List[PinMediaSourceImagesBase64ItemsInner],
index: Option[Integer])

object PinMediaSourceImagesBase64 {
  import DateTimeCodecs._
  sealed trait SourceType
  case object MultipleImageBase64 extends SourceType

  object SourceType {
    def toSourceType(s: String): Option[SourceType] = s match {
      case "MultipleImageBase64" => Some(MultipleImageBase64)
      case _ => None
    }

    def fromSourceType(x: SourceType): String = x match {
      case MultipleImageBase64 => "MultipleImageBase64"
    }
  }

  implicit val SourceTypeEnumEncoder: EncodeJson[SourceType] =
    EncodeJson[SourceType](is => StringEncodeJson(SourceType.fromSourceType(is)))

  implicit val SourceTypeEnumDecoder: DecodeJson[SourceType] =
    DecodeJson.optionDecoder[SourceType](n => n.string.flatMap(jStr => SourceType.toSourceType(jStr)), "SourceType failed to de-serialize")

  implicit val PinMediaSourceImagesBase64CodecJson: CodecJson[PinMediaSourceImagesBase64] = CodecJson.derive[PinMediaSourceImagesBase64]
  implicit val PinMediaSourceImagesBase64Decoder: EntityDecoder[PinMediaSourceImagesBase64] = jsonOf[PinMediaSourceImagesBase64]
  implicit val PinMediaSourceImagesBase64Encoder: EntityEncoder[PinMediaSourceImagesBase64] = jsonEncoderOf[PinMediaSourceImagesBase64]
}
