package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param inUnderscorestock 
 * @param outUnderscoreofUnderscorestock 
 * @param preorder 
 */
case class CatalogsFeedIngestionInfo(inUnderscorestock: Option[Int],
                outUnderscoreofUnderscorestock: Option[Int],
                preorder: Option[Int]
                )

object CatalogsFeedIngestionInfo {
    /**
     * Creates the codec for converting CatalogsFeedIngestionInfo from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedIngestionInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedIngestionInfo] = deriveEncoder
}
