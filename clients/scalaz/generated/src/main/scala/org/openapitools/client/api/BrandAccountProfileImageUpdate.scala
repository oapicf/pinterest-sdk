package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BrandAccountProfileImageUpdate._

case class BrandAccountProfileImageUpdate (
  `contentType`: Option[`ContentType`],
data: Option[String])

object BrandAccountProfileImageUpdate {
  import DateTimeCodecs._
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

  implicit val BrandAccountProfileImageUpdateCodecJson: CodecJson[BrandAccountProfileImageUpdate] = CodecJson.derive[BrandAccountProfileImageUpdate]
  implicit val BrandAccountProfileImageUpdateDecoder: EntityDecoder[BrandAccountProfileImageUpdate] = jsonOf[BrandAccountProfileImageUpdate]
  implicit val BrandAccountProfileImageUpdateEncoder: EntityEncoder[BrandAccountProfileImageUpdate] = jsonEncoderOf[BrandAccountProfileImageUpdate]
}
