package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ImageMetadataImages._

case class ImageMetadataImages (
  `150x150`: Option[ImageDetails],
`400x300`: Option[ImageDetails],
`600x`: Option[ImageDetails],
`1200x`: Option[ImageDetails])

object ImageMetadataImages {
  import DateTimeCodecs._

  implicit val ImageMetadataImagesCodecJson: CodecJson[ImageMetadataImages] = CodecJson.derive[ImageMetadataImages]
  implicit val ImageMetadataImagesDecoder: EntityDecoder[ImageMetadataImages] = jsonOf[ImageMetadataImages]
  implicit val ImageMetadataImagesEncoder: EntityEncoder[ImageMetadataImages] = jsonEncoderOf[ImageMetadataImages]
}
