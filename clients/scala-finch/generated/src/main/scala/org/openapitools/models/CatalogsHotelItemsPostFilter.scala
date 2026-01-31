package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param catalogUnderscoreid Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
 * @param catalogUnderscoretype 
 * @param hotelUnderscoreids 
 */
case class CatalogsHotelItemsPostFilter(catalogUnderscoreid: Option[String],
                catalogUnderscoretype: String,
                hotelUnderscoreids: Seq[String]
                )

object CatalogsHotelItemsPostFilter {
    /**
     * Creates the codec for converting CatalogsHotelItemsPostFilter from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelItemsPostFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelItemsPostFilter] = deriveEncoder
}
