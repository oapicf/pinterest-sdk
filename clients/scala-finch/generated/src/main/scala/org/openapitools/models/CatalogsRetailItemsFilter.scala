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
 * @param itemUnderscoreids 
 * @param catalogUnderscoreid Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
 */
case class CatalogsRetailItemsFilter(catalogUnderscoretype: String,
                itemUnderscoreids: Seq[String],
                catalogUnderscoreid: Option[String]
                )

object CatalogsRetailItemsFilter {
    /**
     * Creates the codec for converting CatalogsRetailItemsFilter from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailItemsFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailItemsFilter] = deriveEncoder
}
