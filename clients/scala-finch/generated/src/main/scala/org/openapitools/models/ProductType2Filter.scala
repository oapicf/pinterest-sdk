package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringListCriteria

/**
 * 
 * @param PRODUCTUnderscoreTYPEUnderscore2 
 */
case class ProductType2Filter(PRODUCTUnderscoreTYPEUnderscore2: CatalogsProductGroupMultipleStringListCriteria
                )

object ProductType2Filter {
    /**
     * Creates the codec for converting ProductType2Filter from and to JSON.
     */
    implicit val decoder: Decoder[ProductType2Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductType2Filter] = deriveEncoder
}
