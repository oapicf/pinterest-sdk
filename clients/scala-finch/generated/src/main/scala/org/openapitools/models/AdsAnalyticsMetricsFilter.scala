package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdsAnalyticsFilterColumn
import org.openapitools.models.AdsAnalyticsFilterOperator
import org.openapitools.models.BigDecimal
import scala.collection.immutable.Seq

/**
 * 
 * @param field 
 * @param operator 
 * @param values List of values for filtering
 */
case class AdsAnalyticsMetricsFilter(field: AdsAnalyticsFilterColumn,
                operator: AdsAnalyticsFilterOperator,
                values: Seq[BigDecimal]
                )

object AdsAnalyticsMetricsFilter {
    /**
     * Creates the codec for converting AdsAnalyticsMetricsFilter from and to JSON.
     */
    implicit val decoder: Decoder[AdsAnalyticsMetricsFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsAnalyticsMetricsFilter] = deriveEncoder
}
