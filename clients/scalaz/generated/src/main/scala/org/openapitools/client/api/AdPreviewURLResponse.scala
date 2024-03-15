package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdPreviewURLResponse._

case class AdPreviewURLResponse (
  /* 'Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19' */
  url: Option[String])

object AdPreviewURLResponse {
  import DateTimeCodecs._

  implicit val AdPreviewURLResponseCodecJson: CodecJson[AdPreviewURLResponse] = CodecJson.derive[AdPreviewURLResponse]
  implicit val AdPreviewURLResponseDecoder: EntityDecoder[AdPreviewURLResponse] = jsonOf[AdPreviewURLResponse]
  implicit val AdPreviewURLResponseEncoder: EntityEncoder[AdPreviewURLResponse] = jsonEncoderOf[AdPreviewURLResponse]
}
