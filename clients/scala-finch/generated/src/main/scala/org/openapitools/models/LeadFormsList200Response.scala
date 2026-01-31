package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LeadFormResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class LeadFormsList200Response(bookmark: Option[String],
                items: Seq[LeadFormResponse]
                )

object LeadFormsList200Response {
    /**
     * Creates the codec for converting LeadFormsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[LeadFormsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadFormsList200Response] = deriveEncoder
}
