package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdAccountsCountryResponseData
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 */
case class AdAccountsCountryResponse(items: Option[Seq[AdAccountsCountryResponseData]]
                )

object AdAccountsCountryResponse {
    /**
     * Creates the codec for converting AdAccountsCountryResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdAccountsCountryResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccountsCountryResponse] = deriveEncoder
}
