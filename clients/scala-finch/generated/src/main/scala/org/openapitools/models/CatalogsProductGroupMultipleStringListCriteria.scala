package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param negated 
 * @param values 
 */
case class CatalogsProductGroupMultipleStringListCriteria(negated: Option[Boolean],
                values: Seq[Seq[String]]
                )

object CatalogsProductGroupMultipleStringListCriteria {
    /**
     * Creates the codec for converting CatalogsProductGroupMultipleStringListCriteria from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupMultipleStringListCriteria] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupMultipleStringListCriteria] = deriveEncoder
}
