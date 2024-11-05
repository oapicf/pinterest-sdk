package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaWithImage._

case class PinMediaWithImage (
  mediaType: Option[String],
images: Option[PinMediaWithImageAllOfImages])

object PinMediaWithImage {
  import DateTimeCodecs._

  implicit val PinMediaWithImageCodecJson: CodecJson[PinMediaWithImage] = CodecJson.derive[PinMediaWithImage]
  implicit val PinMediaWithImageDecoder: EntityDecoder[PinMediaWithImage] = jsonOf[PinMediaWithImage]
  implicit val PinMediaWithImageEncoder: EntityEncoder[PinMediaWithImage] = jsonEncoderOf[PinMediaWithImage]
}
