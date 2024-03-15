package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringListCriteria

/**
 * 
 * @param GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore5 
 */
case class GoogleProductCategory5Filter(GOOGLEUnderscorePRODUCTUnderscoreCATEGORYUnderscore5: CatalogsProductGroupMultipleStringListCriteria
                )

object GoogleProductCategory5Filter {
    /**
     * Creates the codec for converting GoogleProductCategory5Filter from and to JSON.
     */
    implicit val decoder: Decoder[GoogleProductCategory5Filter] = deriveDecoder
    implicit val encoder: ObjectEncoder[GoogleProductCategory5Filter] = deriveEncoder
}
