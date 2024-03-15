package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdsCreditDiscountsResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 * @param bookmark 
 */
case class AdsCreditsDiscountsGet200Response(items: Seq[AdsCreditDiscountsResponse],
                bookmark: Option[String]
                )

object AdsCreditsDiscountsGet200Response {
    /**
     * Creates the codec for converting AdsCreditsDiscountsGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[AdsCreditsDiscountsGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsCreditsDiscountsGet200Response] = deriveEncoder
}
