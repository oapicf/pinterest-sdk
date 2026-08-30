package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DynamicTitlesDownloadCSV._

case class DynamicTitlesDownloadCSV (
  /* Pre-signed S3 URL to download the CSV file. */
  downloadUrl: Option[String])

object DynamicTitlesDownloadCSV {
  import DateTimeCodecs._

  implicit val DynamicTitlesDownloadCSVCodecJson: CodecJson[DynamicTitlesDownloadCSV] = CodecJson.derive[DynamicTitlesDownloadCSV]
  implicit val DynamicTitlesDownloadCSVDecoder: EntityDecoder[DynamicTitlesDownloadCSV] = jsonOf[DynamicTitlesDownloadCSV]
  implicit val DynamicTitlesDownloadCSVEncoder: EntityEncoder[DynamicTitlesDownloadCSV] = jsonEncoderOf[DynamicTitlesDownloadCSV]
}
