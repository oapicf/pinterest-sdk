package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Record processing counts
 * @param invalid Number of invalid records processed
 * @param processed Number of records processed
 * @param valid Number of valid records processed
 */
case class RecordCounts(invalid: Int,
                processed: Int,
                valid: Int
                )

object RecordCounts {
    /**
     * Creates the codec for converting RecordCounts from and to JSON.
     */
    implicit val decoder: Decoder[RecordCounts] = deriveDecoder
    implicit val encoder: ObjectEncoder[RecordCounts] = deriveEncoder
}
