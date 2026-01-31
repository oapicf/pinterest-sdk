namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ProductCategoriesApiHandlerParams
open ProductCategoriesApiServiceInterface
open ProductCategoriesApiServiceImplementation
open OpenAPI.Model.AgeTrendsBucket
open OpenAPI.Model.FeaturedTrend
open OpenAPI.Model.GenderBucket
open OpenAPI.Model.InterestsEnum
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.ProductCategoriesEngagementType
open OpenAPI.Model.ProductCategoryDetailLookbackWindow
open OpenAPI.Model.ProductCategoryDetails
open OpenAPI.Model.ProductCategoryEnum
open OpenAPI.Model.ProductCategoryRegion
open OpenAPI.Model.TrendingProductCategory
open OpenAPI.Model.VerticalProductCategory

module ProductCategoriesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region TrendsFeaturedTopicsList
    /// <summary>
    /// Get featured topics
    /// </summary>

    let TrendsFeaturedTopicsList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<TrendsFeaturedTopicsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : TrendsFeaturedTopicsListArgs
          let result = ProductCategoriesApiService.TrendsFeaturedTopicsList ctx serviceArgs
          return! (match result with
                      | TrendsFeaturedTopicsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | TrendsFeaturedTopicsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | TrendsFeaturedTopicsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | TrendsFeaturedTopicsListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | TrendsFeaturedTopicsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | TrendsFeaturedTopicsListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | TrendsFeaturedTopicsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region TrendsProductCategoriesDetailsList
    /// <summary>
    /// Get product category details
    /// </summary>

    let TrendsProductCategoriesDetailsList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<TrendsProductCategoriesDetailsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : TrendsProductCategoriesDetailsListArgs
          let result = ProductCategoriesApiService.TrendsProductCategoriesDetailsList ctx serviceArgs
          return! (match result with
                      | TrendsProductCategoriesDetailsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | TrendsProductCategoriesDetailsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | TrendsProductCategoriesDetailsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | TrendsProductCategoriesDetailsListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | TrendsProductCategoriesDetailsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | TrendsProductCategoriesDetailsListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | TrendsProductCategoriesDetailsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region TrendsProductCategoriesTrendingList
    /// <summary>
    /// Get a list of growing Shopping Product Categories
    /// </summary>

    let TrendsProductCategoriesTrendingList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<TrendsProductCategoriesTrendingListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : TrendsProductCategoriesTrendingListArgs
          let result = ProductCategoriesApiService.TrendsProductCategoriesTrendingList ctx serviceArgs
          return! (match result with
                      | TrendsProductCategoriesTrendingListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | TrendsProductCategoriesTrendingListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | TrendsProductCategoriesTrendingListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | TrendsProductCategoriesTrendingListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | TrendsProductCategoriesTrendingListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | TrendsProductCategoriesTrendingListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | TrendsProductCategoriesTrendingListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

