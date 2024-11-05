namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open AdsApiHandlerParams
open AdsApiServiceInterface
open AdsApiServiceImplementation
open OpenAPI.Model.AdArrayResponse
open OpenAPI.Model.AdCreateRequest
open OpenAPI.Model.AdPreviewRequest
open OpenAPI.Model.AdPreviewURLResponse
open OpenAPI.Model.AdResponse
open OpenAPI.Model.AdUpdateRequest
open OpenAPI.Model.AdsAnalyticsAdTargetingType
open OpenAPI.Model.AdsAnalyticsResponseInner
open OpenAPI.Model.AdsList200Response
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse

module AdsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AdPreviewsCreate
    /// <summary>
    /// Create ad preview with pin or image
    /// </summary>

    let AdPreviewsCreate (pathParams:AdPreviewsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdPreviewsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdPreviewsCreateArgs
          let result = AdsApiService.AdPreviewsCreate ctx serviceArgs
          return! (match result with
                      | AdPreviewsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdPreviewsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdPreviewsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdTargetingAnalyticsGet
    /// <summary>
    /// Get targeting analytics for ads
    /// </summary>

    let AdTargetingAnalyticsGet (pathParams:AdTargetingAnalyticsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdTargetingAnalyticsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdTargetingAnalyticsGetArgs
          let result = AdsApiService.AdTargetingAnalyticsGet ctx serviceArgs
          return! (match result with
                      | AdTargetingAnalyticsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdTargetingAnalyticsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdsAnalytics
    /// <summary>
    /// Get ad analytics
    /// </summary>

    let AdsAnalytics (pathParams:AdsAnalyticsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdsAnalyticsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdsAnalyticsArgs
          let result = AdsApiService.AdsAnalytics ctx serviceArgs
          return! (match result with
                      | AdsAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdsAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdsAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdsCreate
    /// <summary>
    /// Create ads
    /// </summary>

    let AdsCreate (pathParams:AdsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdsCreateArgs
          let result = AdsApiService.AdsCreate ctx serviceArgs
          return! (match result with
                      | AdsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdsGet
    /// <summary>
    /// Get ad
    /// </summary>

    let AdsGet (pathParams:AdsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AdsGetArgs
          let result = AdsApiService.AdsGet ctx serviceArgs
          return! (match result with
                      | AdsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdsList
    /// <summary>
    /// List ads
    /// </summary>

    let AdsList (pathParams:AdsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdsListArgs
          let result = AdsApiService.AdsList ctx serviceArgs
          return! (match result with
                      | AdsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdsUpdate
    /// <summary>
    /// Update ads
    /// </summary>

    let AdsUpdate (pathParams:AdsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdsUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdsUpdateArgs
          let result = AdsApiService.AdsUpdate ctx serviceArgs
          return! (match result with
                      | AdsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

