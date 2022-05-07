package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Currency Codes from ISO 4217
 */
case class Currency()

object Currency {
    /**
     * Creates the codec for converting Currency from and to JSON.
     */
    implicit val decoder: Decoder[Currency] = deriveDecoder
    implicit val encoder: ObjectEncoder[Currency] = deriveEncoder
}
