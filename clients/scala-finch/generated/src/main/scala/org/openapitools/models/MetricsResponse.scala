package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param data 
 */
case class MetricsResponse(data: Option[Seq[Object]]
                )

object MetricsResponse {
    /**
     * Creates the codec for converting MetricsResponse from and to JSON.
     */
    implicit val decoder: Decoder[MetricsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[MetricsResponse] = deriveEncoder
}
