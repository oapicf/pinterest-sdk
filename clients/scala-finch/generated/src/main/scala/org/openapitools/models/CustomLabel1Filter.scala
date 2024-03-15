package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria

/**
 * 
 * @param CUSTOMUnderscoreLABELUnderscore1 
 */
case class CustomLabel1Filter(CUSTOMUnderscoreLABELUnderscore1: CatalogsProductGroupMultipleStringCriteria
                )

object CustomLabel1Filter {
    /**
     * Creates the codec for converting CustomLabel1Filter from and to JSON.
     */
    implicit val decoder: Decoder[CustomLabel1Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomLabel1Filter] = deriveEncoder
}
