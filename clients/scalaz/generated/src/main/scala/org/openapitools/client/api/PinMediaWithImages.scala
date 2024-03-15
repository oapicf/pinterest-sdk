package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaWithImages._

case class PinMediaWithImages (
  mediaType: Option[String],
items: Option[List[ImageMetadata]])

object PinMediaWithImages {
  import DateTimeCodecs._

  implicit val PinMediaWithImagesCodecJson: CodecJson[PinMediaWithImages] = CodecJson.derive[PinMediaWithImages]
  implicit val PinMediaWithImagesDecoder: EntityDecoder[PinMediaWithImages] = jsonOf[PinMediaWithImages]
  implicit val PinMediaWithImagesEncoder: EntityEncoder[PinMediaWithImages] = jsonEncoderOf[PinMediaWithImages]
}
