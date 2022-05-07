package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringListCriteria

/**
 * 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore1 
 */
case class GoogleProductCategory1Filter(GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore1: CatalogsProductGroupMultipleStringListCriteria
                )

object GoogleProductCategory1Filter {
    /**
     * Creates the codec for converting GoogleProductCategory1Filter from and to JSON.
     */
    implicit val decoder: Decoder[GoogleProductCategory1Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoogleProductCategory1Filter] = deriveEncoder
}
