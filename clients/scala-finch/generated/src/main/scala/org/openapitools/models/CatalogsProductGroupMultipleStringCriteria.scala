package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param values 
 * @param negated 
 */
case class CatalogsProductGroupMultipleStringCriteria(values: Seq[String],
                negated: Option[Boolean]
                )

object CatalogsProductGroupMultipleStringCriteria {
    /**
     * Creates the codec for converting CatalogsProductGroupMultipleStringCriteria from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupMultipleStringCriteria] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupMultipleStringCriteria] = deriveEncoder
}
