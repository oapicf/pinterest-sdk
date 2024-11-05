package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsLocale
import org.openapitools.models.Language

/**
 * We recommend using the CatalogsLocale values.
 */
case class CatalogsItemsRequestLanguage()

object CatalogsItemsRequestLanguage {
    /**
     * Creates the codec for converting CatalogsItemsRequestLanguage from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemsRequestLanguage] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemsRequestLanguage] = deriveEncoder
}
