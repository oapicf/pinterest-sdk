package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Pin media objects.
 * @param mediaUnderscoretype 
 */
case class PinMedia(mediaUnderscoretype: Option[String]
                )

object PinMedia {
    /**
     * Creates the codec for converting PinMedia from and to JSON.
     */
    implicit val decoder: Decoder[PinMedia] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinMedia] = deriveEncoder
}
