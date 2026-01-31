package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.ProductCategoriesDemographic
import org.openapitools.models.ProductCategoriesMetricsHighlights
import org.openapitools.models.ProductCategoryEnum
import scala.collection.immutable.Seq

/**
 * Product category details
 * @param demographics 
 * @param hasUnderscoreprediction      Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
 * @param metricsUnderscorehighlights 
 * @param predictedUnderscoretimeUnderscoreseries      A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
 * @param productUnderscorecategory 
 * @param relatedUnderscoresearches Related search terms for this product category
 * @param timeUnderscoreseries Time series data showing trend values over time, indexed between 0 and 100
 */
case class ProductCategoryDetails(demographics: Option[ProductCategoriesDemographic],
                hasUnderscoreprediction: Boolean,
                metricsUnderscorehighlights: Option[ProductCategoriesMetricsHighlights],
                predictedUnderscoretimeUnderscoreseries: Option[Map[String, BigDecimal]],
                productUnderscorecategory: ProductCategoryEnum,
                relatedUnderscoresearches: Option[Seq[String]],
                timeUnderscoreseries: Option[Map[String, BigDecimal]]
                )

object ProductCategoryDetails {
    /**
     * Creates the codec for converting ProductCategoryDetails from and to JSON.
     */
    implicit val decoder: Decoder[ProductCategoryDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductCategoryDetails] = deriveEncoder
}
