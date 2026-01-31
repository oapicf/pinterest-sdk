package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdGroupResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class AdGroupsList200Response(bookmark: Option[String],
                items: Seq[AdGroupResponse]
                )

object AdGroupsList200Response {
    /**
     * Creates the codec for converting AdGroupsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupsList200Response] = deriveEncoder
}
