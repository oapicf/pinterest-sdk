package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Currency Codes from ISO 4217.
 */
case class NullableCurrency()

object NullableCurrency {
    /**
     * Creates the codec for converting NullableCurrency from and to JSON.
     */
    implicit val decoder: Decoder[NullableCurrency] = deriveDecoder
    implicit val encoder: ObjectEncoder[NullableCurrency] = deriveEncoder
}
