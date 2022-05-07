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
url: String,
coverImageUrl: String,
mediaId: String)

object PinMediaSource {
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

  implicit val PinMediaSourceCodecJson: CodecJson[PinMediaSource] = CodecJson.derive[PinMediaSource]
  implicit val PinMediaSourceDecoder: EntityDecoder[PinMediaSource] = jsonOf[PinMediaSource]
  implicit val PinMediaSourceEncoder: EntityEncoder[PinMediaSource] = jsonEncoderOf[PinMediaSource]
}
