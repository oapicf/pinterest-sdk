package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupFilterKeys
import org.openapitools.models.CatalogsProductGroupFiltersRequestAnyOf
import org.openapitools.models.CatalogsProductGroupFiltersRequestAnyOf1
import scala.collection.immutable.Seq

/**
 * Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 * @param anyUnderscoreof 
 * @param allUnderscoreof 
 */
case class CatalogsProductGroupFiltersRequest(anyUnderscoreof: Seq[CatalogsProductGroupFilterKeys],
                allUnderscoreof: Seq[CatalogsProductGroupFilterKeys]
                )

object CatalogsProductGroupFiltersRequest {
    /**
     * Creates the codec for converting CatalogsProductGroupFiltersRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupFiltersRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupFiltersRequest] = deriveEncoder
}
