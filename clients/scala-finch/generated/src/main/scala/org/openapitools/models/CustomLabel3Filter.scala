package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria

/**
 * 
 * @param CUSTOMUnderscoreLABELUnderscore3 
 */
case class CustomLabel3Filter(CUSTOMUnderscoreLABELUnderscore3: CatalogsProductGroupMultipleStringCriteria
                )

object CustomLabel3Filter {
    /**
     * Creates the codec for converting CustomLabel3Filter from and to JSON.
     */
    implicit val decoder: Decoder[CustomLabel3Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomLabel3Filter] = deriveEncoder
}
