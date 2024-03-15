package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreateHotelItem
import org.openapitools.models.CatalogsDeleteHotelItem
import org.openapitools.models.CatalogsUpdatableHotelAttributes
import org.openapitools.models.CatalogsUpdateHotelItem
import org.openapitools.models.CatalogsUpsertHotelItem

/**
 * Hotel batch item
 * @param hotelUnderscoreid The catalog hotel id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
case class CatalogsHotelBatchItem(hotelUnderscoreid: String,
                operation: String,
                attributes: CatalogsUpdatableHotelAttributes
                )

object CatalogsHotelBatchItem {
    /**
     * Creates the codec for converting CatalogsHotelBatchItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelBatchItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelBatchItem] = deriveEncoder
}
