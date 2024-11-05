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
 * @param creativeUnderscoreassetsUnderscoreids 
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 */
case class CatalogsCreativeAssetsItemsFilter(catalogUnderscoretype: String,
                creativeUnderscoreassetsUnderscoreids: Seq[String],
                catalogUnderscoreid: Option[String]
                )

object CatalogsCreativeAssetsItemsFilter {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsItemsFilter from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsItemsFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsItemsFilter] = deriveEncoder
}
