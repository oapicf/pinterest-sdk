package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkJobData._

case class BulkJobData (
  /* Presigned s3 file url for the bulk request result. */
  resultUrl: Option[String],
status: BulkRequestStatus,
/* Bulk Workload Id. */
  workloadId: Option[Integer])

object BulkJobData {
  import DateTimeCodecs._

  implicit val BulkJobDataCodecJson: CodecJson[BulkJobData] = CodecJson.derive[BulkJobData]
  implicit val BulkJobDataDecoder: EntityDecoder[BulkJobData] = jsonOf[BulkJobData]
  implicit val BulkJobDataEncoder: EntityEncoder[BulkJobData] = jsonEncoderOf[BulkJobData]
}
