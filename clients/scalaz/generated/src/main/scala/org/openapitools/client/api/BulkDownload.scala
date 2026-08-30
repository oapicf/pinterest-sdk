package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkDownload._

case class BulkDownload (
  /* ID of the bulk request. */
  requestId: Option[String])

object BulkDownload {
  import DateTimeCodecs._

  implicit val BulkDownloadCodecJson: CodecJson[BulkDownload] = CodecJson.derive[BulkDownload]
  implicit val BulkDownloadDecoder: EntityDecoder[BulkDownload] = jsonOf[BulkDownload]
  implicit val BulkDownloadEncoder: EntityEncoder[BulkDownload] = jsonEncoderOf[BulkDownload]
}
