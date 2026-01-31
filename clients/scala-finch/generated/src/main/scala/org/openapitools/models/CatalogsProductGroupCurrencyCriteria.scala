package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.NonNullableCatalogsCurrency

/**
 * A currency filter. This filter cannot be negated
 * @param negated 
 * @param values 
 */
case class CatalogsProductGroupCurrencyCriteria(negated: Option[Boolean],
                values: NonNullableCatalogsCurrency
                )

object CatalogsProductGroupCurrencyCriteria {
    /**
     * Creates the codec for converting CatalogsProductGroupCurrencyCriteria from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupCurrencyCriteria] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupCurrencyCriteria] = deriveEncoder
}
