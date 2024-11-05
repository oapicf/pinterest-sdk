package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LeadFormArrayResponseItemsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 */
case class LeadFormArrayResponse(items: Option[Seq[LeadFormArrayResponseItemsInner]]
                )

object LeadFormArrayResponse {
    /**
     * Creates the codec for converting LeadFormArrayResponse from and to JSON.
     */
    implicit val decoder: Decoder[LeadFormArrayResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadFormArrayResponse] = deriveEncoder
}
