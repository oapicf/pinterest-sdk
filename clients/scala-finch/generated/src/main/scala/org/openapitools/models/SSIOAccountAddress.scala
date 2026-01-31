package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param addressUnderscoreid Salesforce id for address
 * @param display Address display
 * @param orderUnderscorelegalUnderscoreentity Legal entity for this insertion order
 * @param purpose Purpose for which the address is used, usually Billing or Businness
 */
case class SSIOAccountAddress(addressUnderscoreid: Option[String],
                display: Option[String],
                orderUnderscorelegalUnderscoreentity: Option[String],
                purpose: Option[String]
                )

object SSIOAccountAddress {
    /**
     * Creates the codec for converting SSIOAccountAddress from and to JSON.
     */
    implicit val decoder: Decoder[SSIOAccountAddress] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOAccountAddress] = deriveEncoder
}
