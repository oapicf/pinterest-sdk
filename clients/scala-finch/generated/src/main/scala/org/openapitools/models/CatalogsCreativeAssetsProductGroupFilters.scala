package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsProductGroupFilterKeys
import org.openapitools.models.CatalogsCreativeAssetsProductGroupFiltersAllOf
import org.openapitools.models.CatalogsCreativeAssetsProductGroupFiltersAnyOf
import scala.collection.immutable.Seq

/**
 * Object holding a group of filters for a creative assets product group
 * @param anyUnderscoreof 
 * @param allUnderscoreof 
 */
case class CatalogsCreativeAssetsProductGroupFilters(anyUnderscoreof: Seq[CatalogsCreativeAssetsProductGroupFilterKeys],
                allUnderscoreof: Seq[CatalogsCreativeAssetsProductGroupFilterKeys]
                )

object CatalogsCreativeAssetsProductGroupFilters {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsProductGroupFilters from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsProductGroupFilters] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsProductGroupFilters] = deriveEncoder
}
