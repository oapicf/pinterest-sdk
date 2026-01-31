package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaMetadata._

case class PinMediaMetadata (
  description: Option[String],
images: Option[ImageSize],
itemType: Option[String],
link: Option[String],
title: Option[String],
coverImageUrl: Option[String],
/* Duration (in miliseconds). Field maybe null after creation due to video processing time. */
  duration: Option[BigDecimal],
/* Height (in pixels). Field maybe null after creation due to video processing time. */
  height: Option[Integer],
/* Video url (720p).  **Note:** This field is limited and not available to all apps. */
  videoUrl: Option[String],
/* Width (in pixels). Field maybe null after creation due to video processing time. */
  width: Option[Integer])

object PinMediaMetadata {
  import DateTimeCodecs._

  implicit val PinMediaMetadataCodecJson: CodecJson[PinMediaMetadata] = CodecJson.derive[PinMediaMetadata]
  implicit val PinMediaMetadataDecoder: EntityDecoder[PinMediaMetadata] = jsonOf[PinMediaMetadata]
  implicit val PinMediaMetadataEncoder: EntityEncoder[PinMediaMetadata] = jsonEncoderOf[PinMediaMetadata]
}
