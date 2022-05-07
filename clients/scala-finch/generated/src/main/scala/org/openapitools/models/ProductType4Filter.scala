package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringListCriteria

/**
 * 
 * @param PRODUCTUnderscoreTYPEUnderscore4 
 */
case class ProductType4Filter(PRODUCTUnderscoreTYPEUnderscore4: CatalogsProductGroupMultipleStringListCriteria
                )

object ProductType4Filter {
    /**
     * Creates the codec for converting ProductType4Filter from and to JSON.
     */
    implicit val decoder: Decoder[ProductType4Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductType4Filter] = deriveEncoder
}
