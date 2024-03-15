package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Country

/**
 * 
 * @param country 
 * @param name Ad Account name.
 * @param ownerUnderscoreuserUnderscoreid Advertiser's owning user ID.
 */
case class AdAccountCreateRequest(country: Option[Country],
                name: Option[String],
                ownerUnderscoreuserUnderscoreid: Option[String]
                )

object AdAccountCreateRequest {
    /**
     * Creates the codec for converting AdAccountCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdAccountCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccountCreateRequest] = deriveEncoder
}
