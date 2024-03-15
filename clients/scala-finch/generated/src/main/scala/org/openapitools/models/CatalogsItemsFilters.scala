package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelItemsFilter
import org.openapitools.models.CatalogsRetailItemsFilter
import org.openapitools.models.CatalogsType
import scala.collection.immutable.Seq

/**
 * 
 * @param catalogUnderscoretype 
 * @param itemUnderscoreids 
 * @param catalogUnderscoreid Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
 * @param hotelUnderscoreids 
 */
case class CatalogsItemsFilters(catalogUnderscoretype: CatalogsType,
                itemUnderscoreids: Seq[String],
                catalogUnderscoreid: Option[String],
                hotelUnderscoreids: Seq[String]
                )

object CatalogsItemsFilters {
    /**
     * Creates the codec for converting CatalogsItemsFilters from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemsFilters] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemsFilters] = deriveEncoder
}
