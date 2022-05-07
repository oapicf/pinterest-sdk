package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria

/**
 * 
 * @param CUSTOMUnderscoreLABELUnderscore4 
 */
case class CustomLabel4Filter(CUSTOMUnderscoreLABELUnderscore4: CatalogsProductGroupMultipleStringCriteria
                )

object CustomLabel4Filter {
    /**
     * Creates the codec for converting CustomLabel4Filter from and to JSON.
     */
    implicit val decoder: Decoder[CustomLabel4Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomLabel4Filter] = deriveEncoder
}
