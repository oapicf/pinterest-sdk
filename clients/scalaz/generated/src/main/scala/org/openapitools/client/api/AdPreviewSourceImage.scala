package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdPreviewSourceImage._

case class AdPreviewSourceImage (
  /* Image URL. */
  imageUrl: String,
/* Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. */
  promotionId: Option[String],
/* Title displayed below ad. */
  title: String)

object AdPreviewSourceImage {
  import DateTimeCodecs._

  implicit val AdPreviewSourceImageCodecJson: CodecJson[AdPreviewSourceImage] = CodecJson.derive[AdPreviewSourceImage]
  implicit val AdPreviewSourceImageDecoder: EntityDecoder[AdPreviewSourceImage] = jsonOf[AdPreviewSourceImage]
  implicit val AdPreviewSourceImageEncoder: EntityEncoder[AdPreviewSourceImage] = jsonEncoderOf[AdPreviewSourceImage]
}
