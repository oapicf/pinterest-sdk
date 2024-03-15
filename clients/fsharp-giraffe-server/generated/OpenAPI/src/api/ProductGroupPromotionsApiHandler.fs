namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ProductGroupPromotionsApiHandlerParams
open ProductGroupPromotionsApiServiceInterface
open ProductGroupPromotionsApiServiceImplementation
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.ProductGroupAnalyticsResponseInner
open OpenAPI.Model.ProductGroupPromotionCreateRequest
open OpenAPI.Model.ProductGroupPromotionResponse
open OpenAPI.Model.ProductGroupPromotionUpdateRequest
open OpenAPI.Model.ProductGroupPromotionsList200Response

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
                      | ProductGroupsAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

