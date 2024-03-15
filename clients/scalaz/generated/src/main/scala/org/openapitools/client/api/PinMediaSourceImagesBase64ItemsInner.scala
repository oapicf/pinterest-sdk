package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaSourceImagesBase64ItemsInner._

case class PinMediaSourceImagesBase64ItemsInner (
  title: Option[String],
description: Option[String],
/* Destination link for the image. */
  link: Option[String],
`contentType`: `ContentType`,
/* Image to upload as base64 string. */
  data: String)

object PinMediaSourceImagesBase64ItemsInner {
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

  implicit val PinMediaSourceImagesBase64ItemsInnerCodecJson: CodecJson[PinMediaSourceImagesBase64ItemsInner] = CodecJson.derive[PinMediaSourceImagesBase64ItemsInner]
  implicit val PinMediaSourceImagesBase64ItemsInnerDecoder: EntityDecoder[PinMediaSourceImagesBase64ItemsInner] = jsonOf[PinMediaSourceImagesBase64ItemsInner]
  implicit val PinMediaSourceImagesBase64ItemsInnerEncoder: EntityEncoder[PinMediaSourceImagesBase64ItemsInner] = jsonEncoderOf[PinMediaSourceImagesBase64ItemsInner]
}
