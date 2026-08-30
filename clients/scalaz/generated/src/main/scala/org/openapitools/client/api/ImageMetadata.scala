package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ImageMetadata._

case class ImageMetadata (
  description: Option[String],
images: Option[ImageSize],
/* Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload. */
  itemType: ItemType,
link: Option[String],
title: Option[String])

object ImageMetadata {
  import DateTimeCodecs._
  sealed trait ItemType
  case object Image extends ItemType

  object ItemType {
    def toItemType(s: String): Option[ItemType] = s match {
      case "Image" => Some(Image)
      case _ => None
    }

    def fromItemType(x: ItemType): String = x match {
      case Image => "Image"
    }
  }

  implicit val ItemTypeEnumEncoder: EncodeJson[ItemType] =
    EncodeJson[ItemType](is => StringEncodeJson(ItemType.fromItemType(is)))

  implicit val ItemTypeEnumDecoder: DecodeJson[ItemType] =
    DecodeJson.optionDecoder[ItemType](n => n.string.flatMap(jStr => ItemType.toItemType(jStr)), "ItemType failed to de-serialize")

  implicit val ImageMetadataCodecJson: CodecJson[ImageMetadata] = CodecJson.derive[ImageMetadata]
  implicit val ImageMetadataDecoder: EntityDecoder[ImageMetadata] = jsonOf[ImageMetadata]
  implicit val ImageMetadataEncoder: EntityEncoder[ImageMetadata] = jsonEncoderOf[ImageMetadata]
}
