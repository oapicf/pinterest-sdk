package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleMediaTypesCriteria

/**
 * 
 * @param MEDIAUnderscoreTYPE 
 */
case class MediaTypeFilter(MEDIAUnderscoreTYPE: CatalogsProductGroupMultipleMediaTypesCriteria
                )

object MediaTypeFilter {
    /**
     * Creates the codec for converting MediaTypeFilter from and to JSON.
     */
    implicit val decoder: Decoder[MediaTypeFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[MediaTypeFilter] = deriveEncoder
}
