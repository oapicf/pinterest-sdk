package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param catalogUnderscoretype 
 * @param hotelUnderscoreids 
 * @param catalogUnderscoreid Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
 */
case class CatalogsHotelItemsFilter(catalogUnderscoretype: String,
                hotelUnderscoreids: Seq[String],
                catalogUnderscoreid: Option[String]
                )

object CatalogsHotelItemsFilter {
    /**
     * Creates the codec for converting CatalogsHotelItemsFilter from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelItemsFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelItemsFilter] = deriveEncoder
}
