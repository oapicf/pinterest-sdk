package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.InterestsEnum
import org.openapitools.models.ProductCategoryRegion
import org.openapitools.models.TrendingTopic
import scala.collection.immutable.Seq

/**
 * Featured trending topics for a specific interest and market
 * @param interest The main interest category
 * @param market Market code (e.g., 'US', 'UK', etc.)
 * @param trends List of trending topics within this interest category
 */
case class FeaturedTrend(interest: InterestsEnum,
                market: Option[ProductCategoryRegion],
                trends: Option[Seq[TrendingTopic]]
                )

object FeaturedTrend {
    /**
     * Creates the codec for converting FeaturedTrend from and to JSON.
     */
    implicit val decoder: Decoder[FeaturedTrend] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeaturedTrend] = deriveEncoder
}
