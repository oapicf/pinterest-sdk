package org.openapitools.server.model


/**
 * Trending shopping product category
 *
 * @param engagementType Engagement type for example: ''null''
 * @param pctChangeMom Month-over-month change percentage for example: ''null''
 * @param percentRelativeVolume Relative volume percentage for example: ''null''
 * @param pinterestProductCategoryId Pinterest Product Category Id for example: ''null''
 * @param productCategory Product Category Name for example: ''null''
 * @param verticals Vertical name associated with the product category for example: ''null''
*/
final case class TrendingProductCategory (
  engagementType: ProductCategoriesEngagementType,
  pctChangeMom: Int,
  percentRelativeVolume: Int,
  pinterestProductCategoryId: Int,
  productCategory: String,
  verticals: Option[Seq[String]] = None
)

