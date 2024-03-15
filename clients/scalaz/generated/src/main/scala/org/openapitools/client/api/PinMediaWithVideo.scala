package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaWithVideo._

case class PinMediaWithVideo (
  mediaType: Option[String],
images: Option[ImageMetadataImages],
coverImageUrl: Option[String],
/* Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps. */
  videoUrl: Option[String],
/* Duration (in milliseconds) */
  duration: Option[BigDecimal],
/* Height (in pixels) */
  height: Option[Integer],
/* Width (in pixels) */
  width: Option[Integer])

object PinMediaWithVideo {
  import DateTimeCodecs._

  implicit val PinMediaWithVideoCodecJson: CodecJson[PinMediaWithVideo] = CodecJson.derive[PinMediaWithVideo]
  implicit val PinMediaWithVideoDecoder: EntityDecoder[PinMediaWithVideo] = jsonOf[PinMediaWithVideo]
  implicit val PinMediaWithVideoEncoder: EntityEncoder[PinMediaWithVideo] = jsonEncoderOf[PinMediaWithVideo]
}
