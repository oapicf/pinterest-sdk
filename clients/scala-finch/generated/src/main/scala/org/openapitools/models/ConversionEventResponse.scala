package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConversionTagType

/**
 * 
 * @param conversionUnderscoreevent 
 * @param conversionUnderscoretagUnderscoreid Id of the tag.
 * @param adUnderscoreaccountUnderscoreid Id of the ad account.
 * @param createdUnderscoretime Creation date in epoch format.
 */
case class ConversionEventResponse(conversionUnderscoreevent: Option[ConversionTagType],
                conversionUnderscoretagUnderscoreid: Option[String],
                adUnderscoreaccountUnderscoreid: Option[String],
                createdUnderscoretime: Option[Int]
                )

object ConversionEventResponse {
    /**
     * Creates the codec for converting ConversionEventResponse from and to JSON.
     */
    implicit val decoder: Decoder[ConversionEventResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionEventResponse] = deriveEncoder
}
