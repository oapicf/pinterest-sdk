package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PinMedia

/**
 * 
 * @param mediaUnderscoretype 
 */
case class SummaryPinMedia(mediaUnderscoretype: Option[String]
                )

object SummaryPinMedia {
    /**
     * Creates the codec for converting SummaryPinMedia from and to JSON.
     */
    implicit val decoder: Decoder[SummaryPinMedia] = deriveDecoder
    implicit val encoder: ObjectEncoder[SummaryPinMedia] = deriveEncoder
}
