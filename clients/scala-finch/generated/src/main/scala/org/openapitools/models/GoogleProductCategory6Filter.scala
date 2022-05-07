package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringListCriteria

/**
 * 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore6 
 */
case class GoogleProductCategory6Filter(GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore6: CatalogsProductGroupMultipleStringListCriteria
                )

object GoogleProductCategory6Filter {
    /**
     * Creates the codec for converting GoogleProductCategory6Filter from and to JSON.
     */
    implicit val decoder: Decoder[GoogleProductCategory6Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoogleProductCategory6Filter] = deriveEncoder
}
