namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CampaignsApiHandlerParams
open CampaignsApiServiceInterface
open CampaignsApiServiceImplementation
open OpenAPI.Model.AdPinAnalytics
open OpenAPI.Model.AdsAnalyticsCampaignTargetingType
open OpenAPI.Model.Campaign
open OpenAPI.Model.CampaignBatchUpdateItem
open OpenAPI.Model.CampaignBatchWriteResponseModel
open OpenAPI.Model.CampaignCreateItem
open OpenAPI.Model.CampaignDeliveryEstimatesCampaign
open OpenAPI.Model.CampaignDeliveryEstimatesResponse
open OpenAPI.Model.CampaignsAnalyticsMetrics
open OpenAPI.Model.CampaignsList200Response
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.ReportingColumnSync
open OpenAPI.Model.ReportingTimeZone

module CampaignsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AdPinsAnalytics
    /// <summary>
    /// Get pins analytics
    /// </summary>

    let AdPinsAnalytics (pathParams:AdPinsAnalyticsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdPinsAnalyticsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdPinsAnalyticsArgs
          let result = CampaignsApiService.AdPinsAnalytics ctx serviceArgs
          return! (match result with
                      | AdPinsAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdPinsAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdPinsAnalyticsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdPinsAnalyticsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdPinsAnalyticsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdPinsAnalyticsStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdPinsAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CampaignTargetingAnalyticsGet
    /// <summary>
    /// Get targeting analytics for campaigns
    /// </summary>

    let CampaignTargetingAnalyticsGet (pathParams:CampaignTargetingAnalyticsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CampaignTargetingAnalyticsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CampaignTargetingAnalyticsGetArgs
          let result = CampaignsApiService.CampaignTargetingAnalyticsGet ctx serviceArgs
          return! (match result with
                      | CampaignTargetingAnalyticsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CampaignTargetingAnalyticsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CampaignTargetingAnalyticsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CampaignTargetingAnalyticsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CampaignTargetingAnalyticsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CampaignTargetingAnalyticsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CampaignTargetingAnalyticsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CampaignsAnalytics
    /// <summary>
    /// Get campaign analytics
    /// </summary>

    let CampaignsAnalytics (pathParams:CampaignsAnalyticsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CampaignsAnalyticsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CampaignsAnalyticsArgs
          let result = CampaignsApiService.CampaignsAnalytics ctx serviceArgs
          return! (match result with
                      | CampaignsAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CampaignsAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CampaignsAnalyticsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CampaignsAnalyticsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CampaignsAnalyticsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CampaignsAnalyticsStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CampaignsAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CampaignsCreate
    /// <summary>
    /// Create campaigns
    /// </summary>

    let CampaignsCreate (pathParams:CampaignsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CampaignsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CampaignsCreateArgs
          let result = CampaignsApiService.CampaignsCreate ctx serviceArgs
          return! (match result with
                      | CampaignsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CampaignsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CampaignsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CampaignsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CampaignsCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CampaignsCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CampaignsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CampaignsGet
    /// <summary>
    /// Get campaign
    /// </summary>

    let CampaignsGet (pathParams:CampaignsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : CampaignsGetArgs
          let result = CampaignsApiService.CampaignsGet ctx serviceArgs
          return! (match result with
                      | CampaignsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CampaignsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CampaignsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CampaignsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CampaignsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CampaignsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CampaignsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CampaignsList
    /// <summary>
    /// List campaigns
    /// </summary>

    let CampaignsList (pathParams:CampaignsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CampaignsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CampaignsListArgs
          let result = CampaignsApiService.CampaignsList ctx serviceArgs
          return! (match result with
                      | CampaignsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CampaignsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CampaignsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CampaignsListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CampaignsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CampaignsListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CampaignsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CampaignsUpdate
    /// <summary>
    /// Update campaigns
    /// </summary>

    let CampaignsUpdate (pathParams:CampaignsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CampaignsUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CampaignsUpdateArgs
          let result = CampaignsApiService.CampaignsUpdate ctx serviceArgs
          return! (match result with
                      | CampaignsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CampaignsUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CampaignsUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CampaignsUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CampaignsUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CampaignsUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CampaignsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaignDeliveryEstimates
    /// <summary>
    /// Get campaign delivery estimates
    /// </summary>

    let GetCampaignDeliveryEstimates (pathParams:GetCampaignDeliveryEstimatesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetCampaignDeliveryEstimatesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : GetCampaignDeliveryEstimatesArgs
          let result = CampaignsApiService.GetCampaignDeliveryEstimates ctx serviceArgs
          return! (match result with
                      | GetCampaignDeliveryEstimatesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignDeliveryEstimatesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignDeliveryEstimatesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignDeliveryEstimatesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignDeliveryEstimatesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignDeliveryEstimatesStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | GetCampaignDeliveryEstimatesStatusCode503 resolved ->
                            setStatusCode 503 >=> json resolved.content
                      | GetCampaignDeliveryEstimatesDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

