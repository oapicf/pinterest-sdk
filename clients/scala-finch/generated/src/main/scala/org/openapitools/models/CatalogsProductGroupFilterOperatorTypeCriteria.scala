package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param filterUnderscoreoperatorUnderscoretype 
 * @param negated 
 * @param values 
 */
case class CatalogsProductGroupFilterOperatorTypeCriteria(filterUnderscoreoperatorUnderscoretype: Option[String],
                negated: Option[Boolean],
                values: Seq[String]
                )

object CatalogsProductGroupFilterOperatorTypeCriteria {
    /**
     * Creates the codec for converting CatalogsProductGroupFilterOperatorTypeCriteria from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupFilterOperatorTypeCriteria] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupFilterOperatorTypeCriteria] = deriveEncoder
}
