package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.NonNullableCatalogsCurrency

/**
 * 
 * @param values 
 * @param negated 
 */
case class CatalogsProductGroupCurrencyCriteria(values: NonNullableCatalogsCurrency,
                negated: Boolean
                )

object CatalogsProductGroupCurrencyCriteria {
    /**
     * Creates the codec for converting CatalogsProductGroupCurrencyCriteria from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupCurrencyCriteria] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupCurrencyCriteria] = deriveEncoder
}
