package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaWithImageAllOfImages._

case class PinMediaWithImageAllOfImages (
  `150x150`: Option[Any],
`400x300`: Option[Any],
`600x`: Option[Any],
`1200x`: Option[Any])

object PinMediaWithImageAllOfImages {
  import DateTimeCodecs._

  implicit val PinMediaWithImageAllOfImagesCodecJson: CodecJson[PinMediaWithImageAllOfImages] = CodecJson.derive[PinMediaWithImageAllOfImages]
  implicit val PinMediaWithImageAllOfImagesDecoder: EntityDecoder[PinMediaWithImageAllOfImages] = jsonOf[PinMediaWithImageAllOfImages]
  implicit val PinMediaWithImageAllOfImagesEncoder: EntityEncoder[PinMediaWithImageAllOfImages] = jsonEncoderOf[PinMediaWithImageAllOfImages]
}
