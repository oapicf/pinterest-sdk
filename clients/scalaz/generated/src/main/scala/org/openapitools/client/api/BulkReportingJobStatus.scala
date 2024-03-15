package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkReportingJobStatus._

case class BulkReportingJobStatus (
  
object BulkReportingJobStatus {
  import DateTimeCodecs._

  implicit val BulkReportingJobStatusCodecJson: CodecJson[BulkReportingJobStatus] = CodecJson.derive[BulkReportingJobStatus]
  implicit val BulkReportingJobStatusDecoder: EntityDecoder[BulkReportingJobStatus] = jsonOf[BulkReportingJobStatus]
  implicit val BulkReportingJobStatusEncoder: EntityEncoder[BulkReportingJobStatus] = jsonEncoderOf[BulkReportingJobStatus]
}
