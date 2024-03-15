package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringListCriteria

/**
 * 
 * @param PRODUCTUnderscoreTYPEUnderscore1 
 */
case class ProductType1Filter(PRODUCTUnderscoreTYPEUnderscore1: CatalogsProductGroupMultipleStringListCriteria
                )

object ProductType1Filter {
    /**
     * Creates the codec for converting ProductType1Filter from and to JSON.
     */
    implicit val decoder: Decoder[ProductType1Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductType1Filter] = deriveEncoder
}
