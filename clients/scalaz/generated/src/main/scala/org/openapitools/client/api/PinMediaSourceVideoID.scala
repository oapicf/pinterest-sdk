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
/* Cover image url. */
  coverImageUrl: Option[String],
/* Content type for cover image Base64. */
  coverImageContentType: Option[CoverImageContentType],
/* Cover image Base64. */
  coverImageData: Option[String],
mediaId: String,
/* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
  isStandard: Option[Boolean])

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
  sealed trait CoverImageContentType
  case object ImageJpeg extends CoverImageContentType
  case object ImagePng extends CoverImageContentType

  object CoverImageContentType {
    def toCoverImageContentType(s: String): Option[CoverImageContentType] = s match {
      case "ImageJpeg" => Some(ImageJpeg)
      case "ImagePng" => Some(ImagePng)
      case _ => None
    }

    def fromCoverImageContentType(x: CoverImageContentType): String = x match {
      case ImageJpeg => "ImageJpeg"
      case ImagePng => "ImagePng"
    }
  }

  implicit val CoverImageContentTypeEnumEncoder: EncodeJson[CoverImageContentType] =
    EncodeJson[CoverImageContentType](is => StringEncodeJson(CoverImageContentType.fromCoverImageContentType(is)))

  implicit val CoverImageContentTypeEnumDecoder: DecodeJson[CoverImageContentType] =
    DecodeJson.optionDecoder[CoverImageContentType](n => n.string.flatMap(jStr => CoverImageContentType.toCoverImageContentType(jStr)), "CoverImageContentType failed to de-serialize")

  implicit val PinMediaSourceVideoIDCodecJson: CodecJson[PinMediaSourceVideoID] = CodecJson.derive[PinMediaSourceVideoID]
  implicit val PinMediaSourceVideoIDDecoder: EntityDecoder[PinMediaSourceVideoID] = jsonOf[PinMediaSourceVideoID]
  implicit val PinMediaSourceVideoIDEncoder: EntityEncoder[PinMediaSourceVideoID] = jsonEncoderOf[PinMediaSourceVideoID]
}
