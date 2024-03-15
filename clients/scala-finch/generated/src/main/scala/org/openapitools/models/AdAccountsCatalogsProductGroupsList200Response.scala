package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogProductGroup
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 * @param bookmark 
 */
case class AdAccountsCatalogsProductGroupsList200Response(items: Seq[CatalogProductGroup],
                bookmark: Option[String]
                )

object AdAccountsCatalogsProductGroupsList200Response {
    /**
     * Creates the codec for converting AdAccountsCatalogsProductGroupsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[AdAccountsCatalogsProductGroupsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccountsCatalogsProductGroupsList200Response] = deriveEncoder
}
