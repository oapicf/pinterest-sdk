package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria

/**
 * 
 * @param ITEMUnderscoreGROUPUnderscoreID 
 */
case class ItemGroupIdFilter(ITEMUnderscoreGROUPUnderscoreID: CatalogsProductGroupMultipleStringCriteria
                )

object ItemGroupIdFilter {
    /**
     * Creates the codec for converting ItemGroupIdFilter from and to JSON.
     */
    implicit val decoder: Decoder[ItemGroupIdFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemGroupIdFilter] = deriveEncoder
}
