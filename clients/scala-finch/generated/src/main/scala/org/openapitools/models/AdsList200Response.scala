package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 * @param bookmark 
 */
case class AdsList200Response(items: Seq[AdResponse],
                bookmark: Option[String]
                )

object AdsList200Response {
    /**
     * Creates the codec for converting AdsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[AdsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsList200Response] = deriveEncoder
}
