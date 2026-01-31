package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Country
import org.openapitools.models.Currency

/**
 * Resource create operation model.
 * @param country 
 * @param currency 
 * @param name Ad account name.
 * @param ownerUnderscoreuserUnderscoreid Advertiser's owning user ID.
 */
case class AdAccountCreate(country: Option[Country],
                currency: Option[Currency],
                name: Option[String],
                ownerUnderscoreuserUnderscoreid: Option[String]
                )

object AdAccountCreate {
    /**
     * Creates the codec for converting AdAccountCreate from and to JSON.
     */
    implicit val decoder: Decoder[AdAccountCreate] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccountCreate] = deriveEncoder
}
