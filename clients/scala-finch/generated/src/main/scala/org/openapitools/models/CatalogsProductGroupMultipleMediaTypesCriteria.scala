package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MediaType
import scala.collection.immutable.Seq

/**
 * 
 * @param values 
 * @param negated 
 */
case class CatalogsProductGroupMultipleMediaTypesCriteria(values: Seq[MediaType],
                negated: Option[Boolean]
                )

object CatalogsProductGroupMultipleMediaTypesCriteria {
    /**
     * Creates the codec for converting CatalogsProductGroupMultipleMediaTypesCriteria from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupMultipleMediaTypesCriteria] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupMultipleMediaTypesCriteria] = deriveEncoder
}
