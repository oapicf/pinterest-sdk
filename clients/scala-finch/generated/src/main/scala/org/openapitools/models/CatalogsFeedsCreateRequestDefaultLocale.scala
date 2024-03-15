package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsLocale

/**
 * The locale used within a feed for product descriptions.
 */
case class CatalogsFeedsCreateRequestDefaultLocale()

object CatalogsFeedsCreateRequestDefaultLocale {
    /**
     * Creates the codec for converting CatalogsFeedsCreateRequestDefaultLocale from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedsCreateRequestDefaultLocale] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedsCreateRequestDefaultLocale] = deriveEncoder
}
