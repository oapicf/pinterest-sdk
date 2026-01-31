package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * The resource was successfully deleted.
 * @param statusCode 
 */
case class PinterestLibStatus204(statusCode: BigDecimal
                )

object PinterestLibStatus204 {
    /**
     * Creates the codec for converting PinterestLibStatus204 from and to JSON.
     */
    implicit val decoder: Decoder[PinterestLibStatus204] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinterestLibStatus204] = deriveEncoder
}
