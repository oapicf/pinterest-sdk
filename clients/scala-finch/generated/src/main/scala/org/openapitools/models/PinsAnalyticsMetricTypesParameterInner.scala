package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 */
case class PinsAnalyticsMetricTypesParameterInner()

object PinsAnalyticsMetricTypesParameterInner {
    /**
     * Creates the codec for converting PinsAnalyticsMetricTypesParameterInner from and to JSON.
     */
    implicit val decoder: Decoder[PinsAnalyticsMetricTypesParameterInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PinsAnalyticsMetricTypesParameterInner] = deriveEncoder
}
