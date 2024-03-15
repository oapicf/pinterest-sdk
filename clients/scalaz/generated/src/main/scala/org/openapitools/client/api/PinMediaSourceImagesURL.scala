package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaSourceImagesURL._

case class PinMediaSourceImagesURL (
  sourceType: Option[SourceType],
/* Array with image objects. */
  items: List[PinMediaSourceImagesURLItemsInner],
index: Option[Integer])

object PinMediaSourceImagesURL {
  import DateTimeCodecs._
  sealed trait SourceType
  case object MultipleImageUrls extends SourceType

  object SourceType {
    def toSourceType(s: String): Option[SourceType] = s match {
      case "MultipleImageUrls" => Some(MultipleImageUrls)
      case _ => None
    }

    def fromSourceType(x: SourceType): String = x match {
      case MultipleImageUrls => "MultipleImageUrls"
    }
  }

  implicit val SourceTypeEnumEncoder: EncodeJson[SourceType] =
    EncodeJson[SourceType](is => StringEncodeJson(SourceType.fromSourceType(is)))

  implicit val SourceTypeEnumDecoder: DecodeJson[SourceType] =
    DecodeJson.optionDecoder[SourceType](n => n.string.flatMap(jStr => SourceType.toSourceType(jStr)), "SourceType failed to de-serialize")

  implicit val PinMediaSourceImagesURLCodecJson: CodecJson[PinMediaSourceImagesURL] = CodecJson.derive[PinMediaSourceImagesURL]
  implicit val PinMediaSourceImagesURLDecoder: EntityDecoder[PinMediaSourceImagesURL] = jsonOf[PinMediaSourceImagesURL]
  implicit val PinMediaSourceImagesURLEncoder: EntityEncoder[PinMediaSourceImagesURL] = jsonEncoderOf[PinMediaSourceImagesURL]
}
