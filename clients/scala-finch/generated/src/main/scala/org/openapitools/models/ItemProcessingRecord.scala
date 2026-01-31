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
 * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param status 
 * @param warnings Array with the validation warnings for the item processing record
 */
case class ItemProcessingRecord(errors: Option[Seq[ItemValidationEvent]],
                itemUnderscoreid: Option[String],
                status: Option[ItemProcessingStatus],
                warnings: Option[Seq[ItemValidationEvent]]
                )

object ItemProcessingRecord {
    /**
     * Creates the codec for converting ItemProcessingRecord from and to JSON.
     */
    implicit val decoder: Decoder[ItemProcessingRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemProcessingRecord] = deriveEncoder
}
