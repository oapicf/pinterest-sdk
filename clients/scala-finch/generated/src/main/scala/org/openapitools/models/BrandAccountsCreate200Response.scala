package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param brandUnderscoreaccountUnderscoreid id of the newly created brand account
 */
case class BrandAccountsCreate200Response(brandUnderscoreaccountUnderscoreid: Option[String]
                )

object BrandAccountsCreate200Response {
    /**
     * Creates the codec for converting BrandAccountsCreate200Response from and to JSON.
     */
    implicit val decoder: Decoder[BrandAccountsCreate200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[BrandAccountsCreate200Response] = deriveEncoder
}
