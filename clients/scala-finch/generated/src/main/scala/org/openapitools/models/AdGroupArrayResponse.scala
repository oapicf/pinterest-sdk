package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdGroupArrayResponseElement
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 */
case class AdGroupArrayResponse(items: Option[Seq[AdGroupArrayResponseElement]]
                )

object AdGroupArrayResponse {
    /**
     * Creates the codec for converting AdGroupArrayResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupArrayResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupArrayResponse] = deriveEncoder
}
