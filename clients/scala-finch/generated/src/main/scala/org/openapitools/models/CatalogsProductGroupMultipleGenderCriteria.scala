package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Gender
import scala.collection.immutable.Seq

/**
 * 
 * @param values 
 * @param negated 
 */
case class CatalogsProductGroupMultipleGenderCriteria(values: Seq[Gender],
                negated: Option[Boolean]
                )

object CatalogsProductGroupMultipleGenderCriteria {
    /**
     * Creates the codec for converting CatalogsProductGroupMultipleGenderCriteria from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupMultipleGenderCriteria] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupMultipleGenderCriteria] = deriveEncoder
}
