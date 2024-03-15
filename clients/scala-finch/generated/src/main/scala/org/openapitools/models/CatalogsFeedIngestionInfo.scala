package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param INUnderscoreSTOCK The number of ingested products that are in stock.
 * @param OUTUnderscoreOFUnderscoreSTOCK The number of ingested products that are in out of stock.
 * @param PREORDER The number of ingested products that are in preorder.
 */
case class CatalogsFeedIngestionInfo(INUnderscoreSTOCK: Option[Int],
                OUTUnderscoreOFUnderscoreSTOCK: Option[Int],
                PREORDER: Option[Int]
                )

object CatalogsFeedIngestionInfo {
    /**
     * Creates the codec for converting CatalogsFeedIngestionInfo from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedIngestionInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedIngestionInfo] = deriveEncoder
}
