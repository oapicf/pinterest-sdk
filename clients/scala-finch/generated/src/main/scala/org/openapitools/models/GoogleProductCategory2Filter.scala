package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringListCriteria

/**
 * 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore2 
 */
case class GoogleProductCategory2Filter(GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore2: CatalogsProductGroupMultipleStringListCriteria
                )

object GoogleProductCategory2Filter {
    /**
     * Creates the codec for converting GoogleProductCategory2Filter from and to JSON.
     */
    implicit val decoder: Decoder[GoogleProductCategory2Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoogleProductCategory2Filter] = deriveEncoder
}
