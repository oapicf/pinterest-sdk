package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param offerCodeHash Takes in a SHA256 hash of the offerCode.
 * @param validateOnly If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
 */
case class AdsCreditRedeemRequest(offerCodeHash: String,
                validateOnly: Boolean
                )

object AdsCreditRedeemRequest {
    /**
     * Creates the codec for converting AdsCreditRedeemRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdsCreditRedeemRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsCreditRedeemRequest] = deriveEncoder
}
