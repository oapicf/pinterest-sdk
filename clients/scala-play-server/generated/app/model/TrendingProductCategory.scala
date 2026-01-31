package model

import play.api.libs.json._

/**
  * Trending shopping product category
  * @param engagementType Engagement type
  * @param pctChangeMom Month-over-month change percentage
  * @param percentRelativeVolume Relative volume percentage
  * @param productCategory Product Category Name
  * @param verticals Vertical name associated with the product category
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TrendingProductCategory(
  engagementType: ProductCategoriesEngagementType,
  pctChangeMom: Int,
  percentRelativeVolume: Int,
  productCategory: String,
  verticals: Option[List[VerticalProductCategory]]
)

object TrendingProductCategory {
  implicit lazy val trendingProductCategoryJsonFormat: Format[TrendingProductCategory] = Json.format[TrendingProductCategory]
}

