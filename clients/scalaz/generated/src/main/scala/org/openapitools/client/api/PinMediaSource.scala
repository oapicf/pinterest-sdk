package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaSource._

case class PinMediaSource (
  sourceType: SourceType,
`contentType`: `ContentType`,
data: String,
/* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
  isStandard: Option[Boolean],
url: String,
/* Cover image url. */
  coverImageUrl: Option[String],
/* Content type for cover image Base64. */
  coverImageContentType: Option[CoverImageContentType],
/* Cover image Base64. */
  coverImageData: Option[String],
mediaId: String,
/* Array with image objects. */
  items: List[PinMediaSourceImagesURLItemsInner],
index: Option[Integer],
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
  sealed trait `ContentType`
  case object ImageJpeg extends `ContentType`
  case object ImagePng extends `ContentType`

  object `ContentType` {
    def to`ContentType`(s: String): Option[`ContentType`] = s match {
      case "ImageJpeg" => Some(ImageJpeg)
      case "ImagePng" => Some(ImagePng)
      case _ => None
    }

    def from`ContentType`(x: `ContentType`): String = x match {
      case ImageJpeg => "ImageJpeg"
      case ImagePng => "ImagePng"
    }
  }

  implicit val `ContentType`EnumEncoder: EncodeJson[`ContentType`] =
    EncodeJson[`ContentType`](is => StringEncodeJson(`ContentType`.from`ContentType`(is)))

  implicit val `ContentType`EnumDecoder: DecodeJson[`ContentType`] =
    DecodeJson.optionDecoder[`ContentType`](n => n.string.flatMap(jStr => `ContentType`.to`ContentType`(jStr)), "`ContentType` failed to de-serialize")
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

  implicit val PinMediaSourceCodecJson: CodecJson[PinMediaSource] = CodecJson.derive[PinMediaSource]
  implicit val PinMediaSourceDecoder: EntityDecoder[PinMediaSource] = jsonOf[PinMediaSource]
  implicit val PinMediaSourceEncoder: EntityEncoder[PinMediaSource] = jsonEncoderOf[PinMediaSource]
}
