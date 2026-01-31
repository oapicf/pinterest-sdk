package api

import model.AgeTrendsBucket
import model.Error
import model.FeaturedTrend
import model.GenderBucket
import model.InterestsEnum
import model.ProductCategoriesEngagementType
import model.ProductCategoryDetailLookbackWindow
import model.ProductCategoryDetails
import model.ProductCategoryEnum
import model.ProductCategoryRegion
import model.TrendingProductCategory
import model.VerticalProductCategory

/**
  * Provides a default implementation for [[ProductCategoriesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class ProductCategoriesApiImpl extends ProductCategoriesApi {
  /**
    * @inheritdoc
    */
  override def trendsFeaturedTopicsList(region: ProductCategoryRegion, interest: Option[InterestsEnum]): List[FeaturedTrend] = {
    // TODO: Implement better logic

    List.empty[FeaturedTrend]
  }

  /**
    * @inheritdoc
    */
  override def trendsProductCategoriesDetailsList(productCategories: List[ProductCategoryEnum], region: ProductCategoryRegion, lookbackWindow: Option[ProductCategoryDetailLookbackWindow], engagementType: Option[ProductCategoriesEngagementType]): List[ProductCategoryDetails] = {
    // TODO: Implement better logic

    List.empty[ProductCategoryDetails]
  }

  /**
    * @inheritdoc
    */
  override def trendsProductCategoriesTrendingList(region: ProductCategoryRegion, verticals: Option[List[VerticalProductCategory]], ages: Option[List[AgeTrendsBucket]], genders: Option[List[GenderBucket]], engagementType: Option[ProductCategoriesEngagementType]): List[TrendingProductCategory] = {
    // TODO: Implement better logic

    List.empty[TrendingProductCategory]
  }
}
