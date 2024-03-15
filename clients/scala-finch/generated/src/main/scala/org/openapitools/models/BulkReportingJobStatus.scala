package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Possible status for a bulk reporting job
 */
case class BulkReportingJobStatus()

object BulkReportingJobStatus {
    /**
     * Creates the codec for converting BulkReportingJobStatus from and to JSON.
     */
    implicit val decoder: Decoder[BulkReportingJobStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[BulkReportingJobStatus] = deriveEncoder
}
