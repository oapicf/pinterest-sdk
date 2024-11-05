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
 * @param anyUnderscoreof 
 */
case class CatalogsCreativeAssetsProductGroupFiltersAnyOf(anyUnderscoreof: Seq[CatalogsCreativeAssetsProductGroupFilterKeys]
                )

object CatalogsCreativeAssetsProductGroupFiltersAnyOf {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsProductGroupFiltersAnyOf from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsProductGroupFiltersAnyOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsProductGroupFiltersAnyOf] = deriveEncoder
}
