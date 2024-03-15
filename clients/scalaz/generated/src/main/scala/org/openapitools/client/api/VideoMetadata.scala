package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VideoMetadata._

case class VideoMetadata (
  itemType: Option[String],
coverImageUrl: Option[String],
/* Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps. */
  videoUrl: Option[String],
/* Duration (in milliseconds) */
  duration: Option[BigDecimal],
/* Height (in pixels) */
  height: Option[Integer],
/* Width (in pixels) */
  width: Option[Integer])

object VideoMetadata {
  import DateTimeCodecs._

  implicit val VideoMetadataCodecJson: CodecJson[VideoMetadata] = CodecJson.derive[VideoMetadata]
  implicit val VideoMetadataDecoder: EntityDecoder[VideoMetadata] = jsonOf[VideoMetadata]
  implicit val VideoMetadataEncoder: EntityEncoder[VideoMetadata] = jsonEncoderOf[VideoMetadata]
}
