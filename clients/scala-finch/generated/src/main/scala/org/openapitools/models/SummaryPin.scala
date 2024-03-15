package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SummaryPinMedia

/**
 * Summarized pin information
 * @param media 
 * @param altUnderscoretext 
 * @param link 
 * @param title 
 * @param description 
 */
case class SummaryPin(media: Option[SummaryPinMedia],
                altUnderscoretext: Option[String],
                link: Option[String],
                title: Option[String],
                description: Option[String]
                )

object SummaryPin {
    /**
     * Creates the codec for converting SummaryPin from and to JSON.
     */
    implicit val decoder: Decoder[SummaryPin] = deriveDecoder
    implicit val encoder: ObjectEncoder[SummaryPin] = deriveEncoder
}
