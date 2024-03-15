package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinMediaMetadata._

case class PinMediaMetadata (
  itemType: Option[String],
title: Option[String],
description: Option[String],
link: Option[String],
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

object PinMediaMetadata {
  import DateTimeCodecs._

  implicit val PinMediaMetadataCodecJson: CodecJson[PinMediaMetadata] = CodecJson.derive[PinMediaMetadata]
  implicit val PinMediaMetadataDecoder: EntityDecoder[PinMediaMetadata] = jsonOf[PinMediaMetadata]
  implicit val PinMediaMetadataEncoder: EntityEncoder[PinMediaMetadata] = jsonEncoderOf[PinMediaMetadata]
}
