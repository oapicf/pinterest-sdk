package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsVerticalProductGroup
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class CatalogsProductGroupsList200Response(bookmark: Option[String],
                items: Seq[CatalogsVerticalProductGroup]
                )

object CatalogsProductGroupsList200Response {
    /**
     * Creates the codec for converting CatalogsProductGroupsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupsList200Response] = deriveEncoder
}
