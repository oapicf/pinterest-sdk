package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 * @param catalogUnderscoretype 
 * @param creativeUnderscoreassetsUnderscoreids 
 */
case class CatalogsCreativeAssetsItemsFilter(catalogUnderscoreid: Option[String],
                catalogUnderscoretype: String,
                creativeUnderscoreassetsUnderscoreids: Seq[String]
                )

object CatalogsCreativeAssetsItemsFilter {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsItemsFilter from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsItemsFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsItemsFilter] = deriveEncoder
}
