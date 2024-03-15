package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkDownloadResponse._

case class BulkDownloadResponse (
  /* ID of the bulk request. */
  requestId: Option[String])

object BulkDownloadResponse {
  import DateTimeCodecs._

  implicit val BulkDownloadResponseCodecJson: CodecJson[BulkDownloadResponse] = CodecJson.derive[BulkDownloadResponse]
  implicit val BulkDownloadResponseDecoder: EntityDecoder[BulkDownloadResponse] = jsonOf[BulkDownloadResponse]
  implicit val BulkDownloadResponseEncoder: EntityEncoder[BulkDownloadResponse] = jsonEncoderOf[BulkDownloadResponse]
}
