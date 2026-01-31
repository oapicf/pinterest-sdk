package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.InnerProductCategoriesMetricsHighlights

/**
 * Key performance metrics highlights for this product category
 * @param engagement Engagement metric value
 * @param outboundUnderscoreclicks Number of outbound clicks
 * @param pinUnderscoresaves Number of pin saves
 */
case class ProductCategoriesMetricsHighlights(engagement: Option[InnerProductCategoriesMetricsHighlights],
                outboundUnderscoreclicks: Option[InnerProductCategoriesMetricsHighlights],
                pinUnderscoresaves: Option[InnerProductCategoriesMetricsHighlights]
                )

object ProductCategoriesMetricsHighlights {
    /**
     * Creates the codec for converting ProductCategoriesMetricsHighlights from and to JSON.
     */
    implicit val decoder: Decoder[ProductCategoriesMetricsHighlights] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductCategoriesMetricsHighlights] = deriveEncoder
}
