package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringListCriteria

/**
 * 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore0 
 */
case class GoogleProductCategory0Filter(GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore0: CatalogsProductGroupMultipleStringListCriteria
                )

object GoogleProductCategory0Filter {
    /**
     * Creates the codec for converting GoogleProductCategory0Filter from and to JSON.
     */
    implicit val decoder: Decoder[GoogleProductCategory0Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoogleProductCategory0Filter] = deriveEncoder
}
