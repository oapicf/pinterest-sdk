namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ProductGroupPromotionsApiHandlerParams
open ProductGroupPromotionsApiServiceInterface
open ProductGroupPromotionsApiServiceImplementation
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.Granularity
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.ProductGroupAnalyticsItems
open OpenAPI.Model.ProductGroupPromotion
open OpenAPI.Model.ProductGroupPromotions
open OpenAPI.Model.ProductGroupPromotionsCreate
open OpenAPI.Model.ProductGroupPromotionsList200Response
open OpenAPI.Model.ProductGroupPromotionsUpdateWithRequiredBody
open OpenAPI.Model.ReportingColumnSync
open OpenAPI.Model.ReportingTimeZone

module ProductGroupPromotionsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ProductGroupPromotionsCreate
    /// <summary>
    /// Create product group promotions
    /// </summary>

    let ProductGroupPromotionsCreate (pathParams:ProductGroupPromotionsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ProductGroupPromotionsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ProductGroupPromotionsCreateArgs
          let result = ProductGroupPromotionsApiService.ProductGroupPromotionsCreate ctx serviceArgs
          return! (match result with
                      | ProductGroupPromotionsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ProductGroupPromotionsCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | ProductGroupPromotionsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ProductGroupPromotionsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ProductGroupPromotionsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ProductGroupPromotionsCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ProductGroupPromotionsCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | ProductGroupPromotionsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ProductGroupPromotionsGet
    /// <summary>
    /// Get a product group promotion by id
    /// </summary>

    let ProductGroupPromotionsGet (pathParams:ProductGroupPromotionsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ProductGroupPromotionsGetArgs
          let result = ProductGroupPromotionsApiService.ProductGroupPromotionsGet ctx serviceArgs
          return! (match result with
                      | ProductGroupPromotionsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ProductGroupPromotionsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ProductGroupPromotionsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ProductGroupPromotionsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ProductGroupPromotionsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ProductGroupPromotionsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | ProductGroupPromotionsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ProductGroupPromotionsList
    /// <summary>
    /// Get product group promotions
    /// </summary>

    let ProductGroupPromotionsList (pathParams:ProductGroupPromotionsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ProductGroupPromotionsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ProductGroupPromotionsListArgs
          let result = ProductGroupPromotionsApiService.ProductGroupPromotionsList ctx serviceArgs
          return! (match result with
                      | ProductGroupPromotionsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ProductGroupPromotionsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ProductGroupPromotionsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ProductGroupPromotionsListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ProductGroupPromotionsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ProductGroupPromotionsListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | ProductGroupPromotionsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ProductGroupPromotionsUpdate
    /// <summary>
    /// Update product group promotions
    /// </summary>

    let ProductGroupPromotionsUpdate (pathParams:ProductGroupPromotionsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ProductGroupPromotionsUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ProductGroupPromotionsUpdateArgs
          let result = ProductGroupPromotionsApiService.ProductGroupPromotionsUpdate ctx serviceArgs
          return! (match result with
                      | ProductGroupPromotionsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ProductGroupPromotionsUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ProductGroupPromotionsUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ProductGroupPromotionsUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ProductGroupPromotionsUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ProductGroupPromotionsUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | ProductGroupPromotionsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ProductGroupsAnalytics
    /// <summary>
    /// Get product group analytics
    /// </summary>

    let ProductGroupsAnalytics (pathParams:ProductGroupsAnalyticsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ProductGroupsAnalyticsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ProductGroupsAnalyticsArgs
          let result = ProductGroupPromotionsApiService.ProductGroupsAnalytics ctx serviceArgs
          return! (match result with
                      | ProductGroupsAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ProductGroupsAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ProductGroupsAnalyticsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ProductGroupsAnalyticsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ProductGroupsAnalyticsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ProductGroupsAnalyticsStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | ProductGroupsAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

