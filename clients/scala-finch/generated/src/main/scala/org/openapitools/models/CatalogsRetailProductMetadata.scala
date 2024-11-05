package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.NonNullableCatalogsCurrency
import org.openapitools.models.NonNullableProductAvailabilityType

/**
 * Retail product metadata entity
 * @param itemUnderscoreid The user-created unique ID that represents the product.
 * @param itemUnderscoregroupUnderscoreid The parent ID of the product.
 * @param availability 
 * @param price The price of the product.
 * @param saleUnderscoreprice The discounted price of the product.
 * @param currency 
 */
case class CatalogsRetailProductMetadata(itemUnderscoreid: String,
                itemUnderscoregroupUnderscoreid: String,
                availability: NonNullableProductAvailabilityType,
                price: BigDecimal,
                saleUnderscoreprice: BigDecimal,
                currency: NonNullableCatalogsCurrency
                )

object CatalogsRetailProductMetadata {
    /**
     * Creates the codec for converting CatalogsRetailProductMetadata from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailProductMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailProductMetadata] = deriveEncoder
}
