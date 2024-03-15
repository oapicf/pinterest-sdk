package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdCountry
import org.openapitools.models.BigDecimal

/**
 * 
 * @param code 
 * @param currency Country currency.
 * @param index Country index
 * @param name Country name
 */
case class AdAccountsCountryResponseData(code: Option[AdCountry],
                currency: Option[String],
                index: Option[BigDecimal],
                name: Option[String]
                )

object AdAccountsCountryResponseData {
    /**
     * Creates the codec for converting AdAccountsCountryResponseData from and to JSON.
     */
    implicit val decoder: Decoder[AdAccountsCountryResponseData] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccountsCountryResponseData] = deriveEncoder
}
