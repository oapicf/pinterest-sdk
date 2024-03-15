package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ImageDetails._

case class ImageDetails (
  width: Integer,
height: Integer,
url: String)

object ImageDetails {
  import DateTimeCodecs._

  implicit val ImageDetailsCodecJson: CodecJson[ImageDetails] = CodecJson.derive[ImageDetails]
  implicit val ImageDetailsDecoder: EntityDecoder[ImageDetails] = jsonOf[ImageDetails]
  implicit val ImageDetailsEncoder: EntityEncoder[ImageDetails] = jsonEncoderOf[ImageDetails]
}
