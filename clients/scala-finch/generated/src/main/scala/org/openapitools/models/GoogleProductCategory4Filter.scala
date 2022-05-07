package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringListCriteria

/**
 * 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore4 
 */
case class GoogleProductCategory4Filter(GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore4: CatalogsProductGroupMultipleStringListCriteria
                )

object GoogleProductCategory4Filter {
    /**
     * Creates the codec for converting GoogleProductCategory4Filter from and to JSON.
     */
    implicit val decoder: Decoder[GoogleProductCategory4Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoogleProductCategory4Filter] = deriveEncoder
}
