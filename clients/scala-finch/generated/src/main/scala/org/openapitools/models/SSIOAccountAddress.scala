package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param display Address display
 * @param purpose Purpose for which the address is used, usually Billing or Businness
 * @param addressUnderscoreid Salesforce id for address
 * @param orderUnderscorelegalUnderscoreentity Legal entity for this insertion order
 */
case class SSIOAccountAddress(display: Option[String],
                purpose: Option[String],
                addressUnderscoreid: Option[String],
                orderUnderscorelegalUnderscoreentity: Option[String]
                )

object SSIOAccountAddress {
    /**
     * Creates the codec for converting SSIOAccountAddress from and to JSON.
     */
    implicit val decoder: Decoder[SSIOAccountAddress] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOAccountAddress] = deriveEncoder
}
