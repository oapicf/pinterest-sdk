package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ItemResponse
import scala.collection.immutable.Seq

/**
 * Response object of catalogs items
 * @param items Array with catalogs items
 */
case class CatalogsItems(items: Option[Seq[ItemResponse]]
                )

object CatalogsItems {
    /**
     * Creates the codec for converting CatalogsItems from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItems] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItems] = deriveEncoder
}
