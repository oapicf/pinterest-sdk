package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria

/**
 * 
 * @param PRODUCTUnderscoreGROUP 
 */
case class ProductGroupReferenceFilter(PRODUCTUnderscoreGROUP: CatalogsProductGroupMultipleStringCriteria
                )

object ProductGroupReferenceFilter {
    /**
     * Creates the codec for converting ProductGroupReferenceFilter from and to JSON.
     */
    implicit val decoder: Decoder[ProductGroupReferenceFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductGroupReferenceFilter] = deriveEncoder
}
