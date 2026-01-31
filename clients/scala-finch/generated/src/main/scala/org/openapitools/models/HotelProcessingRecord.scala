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
 * @param hotelUnderscoreid The catalog hotel id in the merchant namespace
 * @param status 
 * @param warnings Array with the validation warnings for the item processing record
 */
case class HotelProcessingRecord(errors: Option[Seq[ItemValidationEvent]],
                hotelUnderscoreid: Option[String],
                status: Option[ItemProcessingStatus],
                warnings: Option[Seq[ItemValidationEvent]]
                )

object HotelProcessingRecord {
    /**
     * Creates the codec for converting HotelProcessingRecord from and to JSON.
     */
    implicit val decoder: Decoder[HotelProcessingRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[HotelProcessingRecord] = deriveEncoder
}
