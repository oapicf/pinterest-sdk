package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param name Metric's name.
 * @param category Category name
 * @param definition How the metric is defined.
 * @param displayUnderscorename Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
 */
case class DeliveryMetricsResponseItemsInner(name: Option[String],
                category: Option[String],
                definition: Option[String],
                displayUnderscorename: Option[String]
                )

object DeliveryMetricsResponseItemsInner {
    /**
     * Creates the codec for converting DeliveryMetricsResponseItemsInner from and to JSON.
     */
    implicit val decoder: Decoder[DeliveryMetricsResponseItemsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeliveryMetricsResponseItemsInner] = deriveEncoder
}
