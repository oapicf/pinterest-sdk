package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Country
import scala.collection.immutable.Seq

/**
 * 
 * @param values 
 * @param negated 
 */
case class CatalogsProductGroupMultipleCountriesCriteria(values: Seq[Country],
                negated: Option[Boolean]
                )

object CatalogsProductGroupMultipleCountriesCriteria {
    /**
     * Creates the codec for converting CatalogsProductGroupMultipleCountriesCriteria from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupMultipleCountriesCriteria] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupMultipleCountriesCriteria] = deriveEncoder
}
