package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaSource._

case class PinMediaSource (
  `contentType`: ModelContentType,
data: String,
/* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
  isStandard: Option[Boolean],
sourceType: SourceType,
url: String,
/* Content type for cover image Base64. */
  coverImageContentType: Option[ModelContentType],
/* Cover image Base64. */
  coverImageData: Option[String],
/* Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. */
  coverImageKeyFrameTime: Option[Integer],
/* Cover image URL. */
  coverImageUrl: Option[String],
mediaId: String,
index: Option[Integer],
/* Array with image objects. */
  items: List[PinMediaSourceImagesURLItem],
/* This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. */
  isAffiliateLink: Option[Boolean])

object PinMediaSource {
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

  implicit val PinMediaSourceCodecJson: CodecJson[PinMediaSource] = CodecJson.derive[PinMediaSource]
  implicit val PinMediaSourceDecoder: EntityDecoder[PinMediaSource] = jsonOf[PinMediaSource]
  implicit val PinMediaSourceEncoder: EntityEncoder[PinMediaSource] = jsonEncoderOf[PinMediaSource]
}
