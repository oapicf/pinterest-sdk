package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param adUnderscoreaccountUnderscoreid The ID of the ad account.
 * @param hasUnderscoreaccepted Whether the ad account has accepted terms of service.
 * @param html The terms of service content
 * @param id The ID of the terms of service
 */
case class TermsOfService(adUnderscoreaccountUnderscoreid: Option[String],
                hasUnderscoreaccepted: Option[Boolean],
                html: Option[String],
                id: Option[String]
                )

object TermsOfService {
    /**
     * Creates the codec for converting TermsOfService from and to JSON.
     */
    implicit val decoder: Decoder[TermsOfService] = deriveDecoder
    implicit val encoder: ObjectEncoder[TermsOfService] = deriveEncoder
}
