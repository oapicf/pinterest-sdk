package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Metadata of the member/partner that has access to the asset.
 * @param email Email of the business member/partner.
 * @param id Unique identifier of the business member/partner.
 * @param username Username of the business member/partner.
 */
case class BusinessAccessUserSummary(email: Option[String],
                id: Option[String],
                username: Option[String]
                )

object BusinessAccessUserSummary {
    /**
     * Creates the codec for converting BusinessAccessUserSummary from and to JSON.
     */
    implicit val decoder: Decoder[BusinessAccessUserSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessAccessUserSummary] = deriveEncoder
}
