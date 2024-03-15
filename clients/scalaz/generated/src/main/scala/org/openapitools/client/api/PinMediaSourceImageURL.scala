package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaSourceImageURL._

case class PinMediaSourceImageURL (
  sourceType: SourceType,
url: String,
/* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
  isStandard: Option[Boolean])

object PinMediaSourceImageURL {
  import DateTimeCodecs._
  sealed trait SourceType
  case object ImageUrl extends SourceType

  object SourceType {
    def toSourceType(s: String): Option[SourceType] = s match {
      case "ImageUrl" => Some(ImageUrl)
      case _ => None
    }

    def fromSourceType(x: SourceType): String = x match {
      case ImageUrl => "ImageUrl"
    }
  }

  implicit val SourceTypeEnumEncoder: EncodeJson[SourceType] =
    EncodeJson[SourceType](is => StringEncodeJson(SourceType.fromSourceType(is)))

  implicit val SourceTypeEnumDecoder: DecodeJson[SourceType] =
    DecodeJson.optionDecoder[SourceType](n => n.string.flatMap(jStr => SourceType.toSourceType(jStr)), "SourceType failed to de-serialize")

  implicit val PinMediaSourceImageURLCodecJson: CodecJson[PinMediaSourceImageURL] = CodecJson.derive[PinMediaSourceImageURL]
  implicit val PinMediaSourceImageURLDecoder: EntityDecoder[PinMediaSourceImageURL] = jsonOf[PinMediaSourceImageURL]
  implicit val PinMediaSourceImageURLEncoder: EntityEncoder[PinMediaSourceImageURL] = jsonEncoderOf[PinMediaSourceImageURL]
}
