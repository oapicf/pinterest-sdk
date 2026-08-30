package model

import play.api.libs.json._

/**
  * Trending shopping product category
  * @param engagementType Engagement type
  * @param pctChangeMom Month-over-month change percentage
  * @param percentRelativeVolume Relative volume percentage
  * @param pinterestProductCategoryId Pinterest Product Category Id
  * @param productCategory Product Category Name
  * @param verticals Vertical name associated with the product category
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TrendingProductCategory(
  engagementType: ProductCategoriesEngagementType,
  pctChangeMom: Int,
  percentRelativeVolume: Int,
  pinterestProductCategoryId: Int,
  productCategory: String,
  verticals: Option[List[String]]
)

object TrendingProductCategory {
  implicit lazy val trendingProductCategoryJsonFormat: Format[TrendingProductCategory] = Json.format[TrendingProductCategory]
}

