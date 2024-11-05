package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsItemsPostFilter
import org.openapitools.models.CatalogsHotelItemsPostFilter
import org.openapitools.models.CatalogsRetailItemsPostFilter
import org.openapitools.models.CatalogsType
import scala.collection.immutable.Seq

/**
 * 
 * @param catalogUnderscoretype 
 * @param itemUnderscoreids 
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 * @param hotelUnderscoreids 
 * @param creativeUnderscoreassetsUnderscoreids 
 */
case class CatalogsItemsPostFilters(catalogUnderscoretype: CatalogsType,
                itemUnderscoreids: Seq[String],
                catalogUnderscoreid: Option[String],
                hotelUnderscoreids: Seq[String],
                creativeUnderscoreassetsUnderscoreids: Seq[String]
                )

object CatalogsItemsPostFilters {
    /**
     * Creates the codec for converting CatalogsItemsPostFilters from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemsPostFilters] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemsPostFilters] = deriveEncoder
}
