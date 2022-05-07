package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param imageUnderscoredownloadUnderscoreerror 
 * @param imageUnderscoredownloadUnderscoreconnectionUnderscoretimeout 
 * @param imageUnderscoreformatUnderscoreunrecognize 
 * @param lineUnderscorelevelUnderscoreinternalUnderscoreerror 
 * @param largeUnderscoreproductUnderscorecountUnderscoredecrease 
 */
case class CatalogsFeedIngestionErrors(imageUnderscoredownloadUnderscoreerror: Option[Int],
                imageUnderscoredownloadUnderscoreconnectionUnderscoretimeout: Option[Int],
                imageUnderscoreformatUnderscoreunrecognize: Option[Int],
                lineUnderscorelevelUnderscoreinternalUnderscoreerror: Option[Int],
                largeUnderscoreproductUnderscorecountUnderscoredecrease: Option[Int]
                )

object CatalogsFeedIngestionErrors {
    /**
     * Creates the codec for converting CatalogsFeedIngestionErrors from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedIngestionErrors] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedIngestionErrors] = deriveEncoder
}
