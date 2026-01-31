package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param pctUnderscorechangeUnderscoremom Month-over-month percentage change
 */
case class InnerProductCategoriesMetricsHighlights(pctUnderscorechangeUnderscoremom: BigDecimal
                )

object InnerProductCategoriesMetricsHighlights {
    /**
     * Creates the codec for converting InnerProductCategoriesMetricsHighlights from and to JSON.
     */
    implicit val decoder: Decoder[InnerProductCategoriesMetricsHighlights] = deriveDecoder
    implicit val encoder: ObjectEncoder[InnerProductCategoriesMetricsHighlights] = deriveEncoder
}
