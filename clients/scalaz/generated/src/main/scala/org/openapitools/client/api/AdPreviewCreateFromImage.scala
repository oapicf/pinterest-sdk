package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdPreviewCreateFromImage._

case class AdPreviewCreateFromImage (
  /* Image URL. */
  imageUrl: String,
/* Title displayed below ad. */
  title: String)

object AdPreviewCreateFromImage {
  import DateTimeCodecs._

  implicit val AdPreviewCreateFromImageCodecJson: CodecJson[AdPreviewCreateFromImage] = CodecJson.derive[AdPreviewCreateFromImage]
  implicit val AdPreviewCreateFromImageDecoder: EntityDecoder[AdPreviewCreateFromImage] = jsonOf[AdPreviewCreateFromImage]
  implicit val AdPreviewCreateFromImageEncoder: EntityEncoder[AdPreviewCreateFromImage] = jsonEncoderOf[AdPreviewCreateFromImage]
}
