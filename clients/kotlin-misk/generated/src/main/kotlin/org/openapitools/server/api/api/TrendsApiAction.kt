package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.AgeTrendsBucket
import org.openapitools.server.api.model.FeaturedTrend
import org.openapitools.server.api.model.GenderBucket
import org.openapitools.server.api.model.InterestsEnum
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.ProductCategoriesEngagementType
import org.openapitools.server.api.model.ProductCategoryDetailLookbackWindow
import org.openapitools.server.api.model.ProductCategoryDetails
import org.openapitools.server.api.model.ProductCategoryEnum
import org.openapitools.server.api.model.ProductCategoryRegion
import org.openapitools.server.api.model.TrendingProductCategory
import org.openapitools.server.api.model.TrendsEditorial
import org.openapitools.server.api.model.VerticalProductCategory

/**
* @TODO("Fill out implementation")
*/
@Singleton
class TrendsApiAction @Inject constructor(
) : WebAction {

    @Get("/trends/editorial_articles")
    @Description("Returns editorial articles for a given region")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun trendsEditorialArticlesList(
         @QueryParam(value = "region") region: ProductCategoryRegion
    ): kotlin.collections.List<TrendsEditorial> {
        TODO()
    }

    @Get("/trends/topics/featured")
    @Description("Get featured topics")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun trendsFeaturedTopicsList(
         @QueryParam(value = "region") region: ProductCategoryRegion, 
         @QueryParam(value = "interest") interest: InterestsEnum?
    ): kotlin.collections.List<FeaturedTrend> {
        TODO()
    }

    @Get("/trends/product_categories/details")
    @Description("Get product category details")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun trendsProductCategoriesDetailsList(
         @QueryParam(value = "product_categories") productCategories: kotlin.collections.List<ProductCategoryEnum>, 
         @QueryParam(value = "region") region: ProductCategoryRegion, 
         @QueryParam(value = "lookback_window") lookbackWindow: ProductCategoryDetailLookbackWindow?, 
         @QueryParam(value = "engagement_type") engagementType: ProductCategoriesEngagementType?
    ): kotlin.collections.List<ProductCategoryDetails> {
        TODO()
    }

    @Get("/trends/product_categories/trending")
    @Description("Get a list of growing Shopping Product Categories")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun trendsProductCategoriesTrendingList(
         @QueryParam(value = "region") region: ProductCategoryRegion, 
         @QueryParam(value = "verticals") verticals: kotlin.collections.List<VerticalProductCategory>?, 
         @QueryParam(value = "ages") ages: kotlin.collections.List<AgeTrendsBucket>?, 
         @QueryParam(value = "genders") genders: kotlin.collections.List<GenderBucket>?, 
         @QueryParam(value = "engagement_type") engagementType: ProductCategoriesEngagementType?
    ): kotlin.collections.List<TrendingProductCategory> {
        TODO()
    }
}
