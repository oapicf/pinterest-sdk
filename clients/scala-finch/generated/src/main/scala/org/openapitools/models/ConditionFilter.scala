package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria

/**
 * 
 * @param CONDITION 
 */
case class ConditionFilter(CONDITION: CatalogsProductGroupMultipleStringCriteria
                )

object ConditionFilter {
    /**
     * Creates the codec for converting ConditionFilter from and to JSON.
     */
    implicit val decoder: Decoder[ConditionFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConditionFilter] = deriveEncoder
}
