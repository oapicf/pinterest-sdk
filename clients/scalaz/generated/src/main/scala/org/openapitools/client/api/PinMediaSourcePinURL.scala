package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaSourcePinURL._

case class PinMediaSourcePinURL (
  sourceType: SourceType,
/* This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. */
  isAffiliateLink: Option[Boolean])

object PinMediaSourcePinURL {
  import DateTimeCodecs._
  sealed trait SourceType
  case object PinUrl extends SourceType

  object SourceType {
    def toSourceType(s: String): Option[SourceType] = s match {
      case "PinUrl" => Some(PinUrl)
      case _ => None
    }

    def fromSourceType(x: SourceType): String = x match {
      case PinUrl => "PinUrl"
    }
  }

  implicit val SourceTypeEnumEncoder: EncodeJson[SourceType] =
    EncodeJson[SourceType](is => StringEncodeJson(SourceType.fromSourceType(is)))

  implicit val SourceTypeEnumDecoder: DecodeJson[SourceType] =
    DecodeJson.optionDecoder[SourceType](n => n.string.flatMap(jStr => SourceType.toSourceType(jStr)), "SourceType failed to de-serialize")

  implicit val PinMediaSourcePinURLCodecJson: CodecJson[PinMediaSourcePinURL] = CodecJson.derive[PinMediaSourcePinURL]
  implicit val PinMediaSourcePinURLDecoder: EntityDecoder[PinMediaSourcePinURL] = jsonOf[PinMediaSourcePinURL]
  implicit val PinMediaSourcePinURLEncoder: EntityEncoder[PinMediaSourcePinURL] = jsonEncoderOf[PinMediaSourcePinURL]
}
