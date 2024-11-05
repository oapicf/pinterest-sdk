package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsProductGroupFilterKeys
import scala.collection.immutable.Seq

/**
 * 
 * @param allUnderscoreof 
 */
case class CatalogsCreativeAssetsProductGroupFiltersAllOf(allUnderscoreof: Seq[CatalogsCreativeAssetsProductGroupFilterKeys]
                )

object CatalogsCreativeAssetsProductGroupFiltersAllOf {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsProductGroupFiltersAllOf from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsProductGroupFiltersAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsProductGroupFiltersAllOf] = deriveEncoder
}
