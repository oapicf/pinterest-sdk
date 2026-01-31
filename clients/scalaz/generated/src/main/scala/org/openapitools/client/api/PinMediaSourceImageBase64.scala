package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaSourceImageBase64._

case class PinMediaSourceImageBase64 (
  `contentType`: ModelContentType,
data: String,
/* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
  isStandard: Option[Boolean],
/* The source type of the media. */
  sourceType: SourceType)

object PinMediaSourceImageBase64 {
  import DateTimeCodecs._
  sealed trait SourceType
  case object ImageBase64 extends SourceType

  object SourceType {
    def toSourceType(s: String): Option[SourceType] = s match {
      case "ImageBase64" => Some(ImageBase64)
      case _ => None
    }

    def fromSourceType(x: SourceType): String = x match {
      case ImageBase64 => "ImageBase64"
    }
  }

  implicit val SourceTypeEnumEncoder: EncodeJson[SourceType] =
    EncodeJson[SourceType](is => StringEncodeJson(SourceType.fromSourceType(is)))

  implicit val SourceTypeEnumDecoder: DecodeJson[SourceType] =
    DecodeJson.optionDecoder[SourceType](n => n.string.flatMap(jStr => SourceType.toSourceType(jStr)), "SourceType failed to de-serialize")

  implicit val PinMediaSourceImageBase64CodecJson: CodecJson[PinMediaSourceImageBase64] = CodecJson.derive[PinMediaSourceImageBase64]
  implicit val PinMediaSourceImageBase64Decoder: EntityDecoder[PinMediaSourceImageBase64] = jsonOf[PinMediaSourceImageBase64]
  implicit val PinMediaSourceImageBase64Encoder: EntityEncoder[PinMediaSourceImageBase64] = jsonEncoderOf[PinMediaSourceImageBase64]
}
