package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringListCriteria

/**
 * 
 * @param PRODUCTUnderscoreTYPEUnderscore3 
 */
case class ProductType3Filter(PRODUCTUnderscoreTYPEUnderscore3: CatalogsProductGroupMultipleStringListCriteria
                )

object ProductType3Filter {
    /**
     * Creates the codec for converting ProductType3Filter from and to JSON.
     */
    implicit val decoder: Decoder[ProductType3Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductType3Filter] = deriveEncoder
}
