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
itemType: Option[String],
link: Option[String],
title: Option[String])

object ImageMetadata {
  import DateTimeCodecs._

  implicit val ImageMetadataCodecJson: CodecJson[ImageMetadata] = CodecJson.derive[ImageMetadata]
  implicit val ImageMetadataDecoder: EntityDecoder[ImageMetadata] = jsonOf[ImageMetadata]
  implicit val ImageMetadataEncoder: EntityEncoder[ImageMetadata] = jsonEncoderOf[ImageMetadata]
}
