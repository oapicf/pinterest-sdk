package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ProductCategoriesEngagementType
import org.openapitools.models.VerticalProductCategory
import scala.collection.immutable.Seq

/**
 * Trending shopping product category
 * @param engagementUnderscoretype Engagement type
 * @param pctUnderscorechangeUnderscoremom Month-over-month change percentage
 * @param percentUnderscorerelativeUnderscorevolume Relative volume percentage
 * @param productUnderscorecategory Product Category Name
 * @param verticals Vertical name associated with the product category
 */
case class TrendingProductCategory(engagementUnderscoretype: ProductCategoriesEngagementType,
                pctUnderscorechangeUnderscoremom: Int,
                percentUnderscorerelativeUnderscorevolume: Int,
                productUnderscorecategory: String,
                verticals: Option[Seq[VerticalProductCategory]]
                )

object TrendingProductCategory {
    /**
     * Creates the codec for converting TrendingProductCategory from and to JSON.
     */
    implicit val decoder: Decoder[TrendingProductCategory] = deriveDecoder
    implicit val encoder: ObjectEncoder[TrendingProductCategory] = deriveEncoder
}
