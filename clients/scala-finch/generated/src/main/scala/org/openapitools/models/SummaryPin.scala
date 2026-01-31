package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PinMedia

/**
 * Summarized pin information
 * @param altUnderscoretext 
 * @param description 
 * @param id 
 * @param link 
 * @param media 
 * @param title 
 */
case class SummaryPin(altUnderscoretext: Option[String],
                description: Option[String],
                id: Option[String],
                link: Option[String],
                media: Option[PinMedia],
                title: Option[String]
                )

object SummaryPin {
    /**
     * Creates the codec for converting SummaryPin from and to JSON.
     */
    implicit val decoder: Decoder[SummaryPin] = deriveDecoder
    implicit val encoder: ObjectEncoder[SummaryPin] = deriveEncoder
}
