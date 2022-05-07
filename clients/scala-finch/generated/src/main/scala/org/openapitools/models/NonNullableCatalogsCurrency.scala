package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Currency Codes from ISO 4217.
 */
case class NonNullableCatalogsCurrency()

object NonNullableCatalogsCurrency {
    /**
     * Creates the codec for converting NonNullableCatalogsCurrency from and to JSON.
     */
    implicit val decoder: Decoder[NonNullableCatalogsCurrency] = deriveDecoder
    implicit val encoder: ObjectEncoder[NonNullableCatalogsCurrency] = deriveEncoder
}
