package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria

/**
 * 
 * @param CUSTOMUnderscoreLABELUnderscore0 
 */
case class CustomLabel0Filter(CUSTOMUnderscoreLABELUnderscore0: CatalogsProductGroupMultipleStringCriteria
                )

object CustomLabel0Filter {
    /**
     * Creates the codec for converting CustomLabel0Filter from and to JSON.
     */
    implicit val decoder: Decoder[CustomLabel0Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomLabel0Filter] = deriveEncoder
}
