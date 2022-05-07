package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdAccountOwner
import org.openapitools.models.Country
import org.openapitools.models.Currency

/**
 * 
 * @param id 
 * @param name 
 * @param owner 
 * @param country 
 * @param currency 
 */
case class AdAccount(id: Option[String],
                name: Option[String],
                owner: Option[AdAccountOwner],
                country: Option[Country],
                currency: Option[Currency]
                )

object AdAccount {
    /**
     * Creates the codec for converting AdAccount from and to JSON.
     */
    implicit val decoder: Decoder[AdAccount] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccount] = deriveEncoder
}
