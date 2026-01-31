package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Catalog
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class CatalogsList200Response(bookmark: Option[String],
                items: Seq[Catalog]
                )

object CatalogsList200Response {
    /**
     * Creates the codec for converting CatalogsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsList200Response] = deriveEncoder
}
