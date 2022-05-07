package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringListCriteria

/**
 * 
 * @param PRODUCTUnderscoreTYPEUnderscore0 
 */
case class ProductType0Filter(PRODUCTUnderscoreTYPEUnderscore0: CatalogsProductGroupMultipleStringListCriteria
                )

object ProductType0Filter {
    /**
     * Creates the codec for converting ProductType0Filter from and to JSON.
     */
    implicit val decoder: Decoder[ProductType0Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductType0Filter] = deriveEncoder
}
