package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * Request to create test data for lead data test API.
 * @param answers Test lead answers. Should follow the creation order.
 */
case class LeadFormTestRequest(answers: Seq[String]
                )

object LeadFormTestRequest {
    /**
     * Creates the codec for converting LeadFormTestRequest from and to JSON.
     */
    implicit val decoder: Decoder[LeadFormTestRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadFormTestRequest] = deriveEncoder
}
