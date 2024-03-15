package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Status of the lead form
 */
case class LeadFormStatus()

object LeadFormStatus {
    /**
     * Creates the codec for converting LeadFormStatus from and to JSON.
     */
    implicit val decoder: Decoder[LeadFormStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadFormStatus] = deriveEncoder
}
