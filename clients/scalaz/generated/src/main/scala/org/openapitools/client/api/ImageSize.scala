package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ImageSize._

case class ImageSize (
  `1200x`: Option[ImageDetails],
`150x150`: Option[ImageDetails],
`400x300`: Option[ImageDetails],
`600x`: Option[ImageDetails])

object ImageSize {
  import DateTimeCodecs._

  implicit val ImageSizeCodecJson: CodecJson[ImageSize] = CodecJson.derive[ImageSize]
  implicit val ImageSizeDecoder: EntityDecoder[ImageSize] = jsonOf[ImageSize]
  implicit val ImageSizeEncoder: EntityEncoder[ImageSize] = jsonEncoderOf[ImageSize]
}
