namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open AdsApiHandlerParams
open AdsApiServiceInterface
open AdsApiServiceImplementation
open OpenAPI.Model.Ad
open OpenAPI.Model.AdBatchUpdate
open OpenAPI.Model.AdBatchWriteResponseModel
open OpenAPI.Model.AdCreate
open OpenAPI.Model.AdPreviewRequest
open OpenAPI.Model.AdPreviewURLResponse
open OpenAPI.Model.AdsAnalytics
open OpenAPI.Model.AdsAnalyticsAdTargetingType
open OpenAPI.Model.AdsList200Response
open OpenAPI.Model.CampaignAdPreview
open OpenAPI.Model.CampaignAdPreviewCreate
open OpenAPI.Model.CampaignAdPreviewCreate200ResponseInner
open OpenAPI.Model.CampaignAdPreviewDelete200ResponseInner
open OpenAPI.Model.ConversionAttributionWindowDays
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.ConversionReportTimeType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.ReportingColumnSync
open OpenAPI.Model.ReportingTimeZone

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
                      | AdPreviewsCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | AdPreviewsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdPreviewsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdPreviewsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdPreviewsCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdPreviewsCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
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
                      | AdTargetingAnalyticsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdTargetingAnalyticsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdTargetingAnalyticsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdTargetingAnalyticsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdTargetingAnalyticsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
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
                      | AdsAnalyticsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdsAnalyticsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdsAnalyticsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdsAnalyticsStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
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
                      | AdsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdsCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdsCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
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
                      | AdsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
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
                      | AdsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdsListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdsListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
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
                      | AdsUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdsUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdsUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdsUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdsUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CampaignAdPreviewCreate
    /// <summary>
    /// Create ad preview records for one or more ad groups
    /// </summary>

    let CampaignAdPreviewCreate (pathParams:CampaignAdPreviewCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CampaignAdPreviewCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CampaignAdPreviewCreateArgs
          let result = AdsApiService.CampaignAdPreviewCreate ctx serviceArgs
          return! (match result with
                      | CampaignAdPreviewCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CampaignAdPreviewCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | CampaignAdPreviewCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CampaignAdPreviewCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CampaignAdPreviewCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CampaignAdPreviewCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CampaignAdPreviewCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CampaignAdPreviewCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CampaignAdPreviewDelete
    /// <summary>
    /// Delete ad preview records for one or more ad groups
    /// </summary>

    let CampaignAdPreviewDelete (pathParams:CampaignAdPreviewDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CampaignAdPreviewDeleteQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CampaignAdPreviewDeleteArgs
          let result = AdsApiService.CampaignAdPreviewDelete ctx serviceArgs
          return! (match result with
                      | CampaignAdPreviewDeleteStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CampaignAdPreviewDeleteStatusCode204 resolved ->
                            setStatusCode 204 >=> text resolved.content
                      | CampaignAdPreviewDeleteStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CampaignAdPreviewDeleteStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CampaignAdPreviewDeleteStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CampaignAdPreviewDeleteStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CampaignAdPreviewDeleteStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CampaignAdPreviewDeleteDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CampaignAdPreviewRead
    /// <summary>
    /// Fetch ad preview records for one or more ad groups
    /// </summary>

    let CampaignAdPreviewRead (pathParams:CampaignAdPreviewReadPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CampaignAdPreviewReadQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CampaignAdPreviewReadArgs
          let result = AdsApiService.CampaignAdPreviewRead ctx serviceArgs
          return! (match result with
                      | CampaignAdPreviewReadStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CampaignAdPreviewReadStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CampaignAdPreviewReadStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CampaignAdPreviewReadStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CampaignAdPreviewReadStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CampaignAdPreviewReadStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CampaignAdPreviewReadDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

