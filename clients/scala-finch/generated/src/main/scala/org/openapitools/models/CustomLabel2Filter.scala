package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria

/**
 * 
 * @param CUSTOMUnderscoreLABELUnderscore2 
 */
case class CustomLabel2Filter(CUSTOMUnderscoreLABELUnderscore2: CatalogsProductGroupMultipleStringCriteria
                )

object CustomLabel2Filter {
    /**
     * Creates the codec for converting CustomLabel2Filter from and to JSON.
     */
    implicit val decoder: Decoder[CustomLabel2Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomLabel2Filter] = deriveEncoder
}
