package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdArrayResponseElement
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 */
case class AdArrayResponse(items: Option[Seq[AdArrayResponseElement]]
                )

object AdArrayResponse {
    /**
     * Creates the codec for converting AdArrayResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdArrayResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdArrayResponse] = deriveEncoder
}
