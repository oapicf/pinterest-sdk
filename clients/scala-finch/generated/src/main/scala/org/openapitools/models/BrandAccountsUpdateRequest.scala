package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Country
import org.openapitools.models.ImageBase64

/**
 * 
 * @param name Brand Account name
 * @param username Brand Account username
 * @param country 
 * @param about Brand Account about information
 * @param website Brand Account website
 * @param profileUnderscoreimage 
 */
case class BrandAccountsUpdateRequest(name: Option[String],
                username: Option[String],
                country: Option[Country],
                about: Option[String],
                website: Option[String],
                profileUnderscoreimage: Option[ImageBase64]
                )

object BrandAccountsUpdateRequest {
    /**
     * Creates the codec for converting BrandAccountsUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[BrandAccountsUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[BrandAccountsUpdateRequest] = deriveEncoder
}
