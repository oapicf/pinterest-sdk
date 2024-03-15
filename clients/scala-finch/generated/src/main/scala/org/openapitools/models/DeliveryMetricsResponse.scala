package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DeliveryMetricsResponseItemsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 */
case class DeliveryMetricsResponse(items: Option[Seq[DeliveryMetricsResponseItemsInner]]
                )

object DeliveryMetricsResponse {
    /**
     * Creates the codec for converting DeliveryMetricsResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeliveryMetricsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeliveryMetricsResponse] = deriveEncoder
}
