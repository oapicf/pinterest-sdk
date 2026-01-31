package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param errorCode Error code type if error occurs
 * @param errorMessage Reason for failure
 * @param success Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
 */
case class AdsCreditRedeemResponse(errorCode: Option[Int],
                errorMessage: Option[String],
                success: Option[Boolean]
                )

object AdsCreditRedeemResponse {
    /**
     * Creates the codec for converting AdsCreditRedeemResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdsCreditRedeemResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsCreditRedeemResponse] = deriveEncoder
}
