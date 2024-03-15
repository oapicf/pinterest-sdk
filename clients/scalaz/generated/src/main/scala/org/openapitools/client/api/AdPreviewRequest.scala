package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdPreviewRequest._

case class AdPreviewRequest (
  /* Image URL. */
  imageUrl: String,
/* Title displayed below ad. */
  title: String,
/* Pin ID. */
  pinId: String)

object AdPreviewRequest {
  import DateTimeCodecs._

  implicit val AdPreviewRequestCodecJson: CodecJson[AdPreviewRequest] = CodecJson.derive[AdPreviewRequest]
  implicit val AdPreviewRequestDecoder: EntityDecoder[AdPreviewRequest] = jsonOf[AdPreviewRequest]
  implicit val AdPreviewRequestEncoder: EntityEncoder[AdPreviewRequest] = jsonEncoderOf[AdPreviewRequest]
}
