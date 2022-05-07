package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringListCriteria

/**
 * 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore3 
 */
case class GoogleProductCategory3Filter(GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore3: CatalogsProductGroupMultipleStringListCriteria
                )

object GoogleProductCategory3Filter {
    /**
     * Creates the codec for converting GoogleProductCategory3Filter from and to JSON.
     */
    implicit val decoder: Decoder[GoogleProductCategory3Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoogleProductCategory3Filter] = deriveEncoder
}
