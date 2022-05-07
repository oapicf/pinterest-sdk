package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ItemProcessingStatus
import org.openapitools.models.ItemValidationEvent
import scala.collection.immutable.Seq

/**
 * Object describing an item processing record
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
 * @param warnings Array with the validation warnings for the item processing record
 * @param status 
 */
case class ItemProcessingRecord(itemUnderscoreid: Option[String],
                errors: Option[Seq[ItemValidationEvent]],
                warnings: Option[Seq[ItemValidationEvent]],
                status: Option[ItemProcessingStatus]
                )

object ItemProcessingRecord {
    /**
     * Creates the codec for converting ItemProcessingRecord from and to JSON.
     */
    implicit val decoder: Decoder[ItemProcessingRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemProcessingRecord] = deriveEncoder
}
