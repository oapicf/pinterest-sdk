package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.GenderDemographics

/**
 * Age and gender distribution who engaged with this product category in the past 3 months
 * @param age Age demographic distribution
 * @param gender 
 */
case class ProductCategoriesDemographic(age: Map[String, BigDecimal],
                gender: GenderDemographics
                )

object ProductCategoriesDemographic {
    /**
     * Creates the codec for converting ProductCategoriesDemographic from and to JSON.
     */
    implicit val decoder: Decoder[ProductCategoriesDemographic] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductCategoriesDemographic] = deriveEncoder
}
