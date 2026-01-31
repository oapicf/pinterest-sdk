package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupMultipleStringCriteria

/**
 * 
 * @param TITLEUnderscoreKEYWORDS 
 */
case class TitleKeywordsFilter(TITLEUnderscoreKEYWORDS: CatalogsProductGroupMultipleStringCriteria
                )

object TitleKeywordsFilter {
    /**
     * Creates the codec for converting TitleKeywordsFilter from and to JSON.
     */
    implicit val decoder: Decoder[TitleKeywordsFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[TitleKeywordsFilter] = deriveEncoder
}
