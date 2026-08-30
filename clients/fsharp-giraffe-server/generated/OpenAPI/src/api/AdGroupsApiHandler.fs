namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open AdGroupsApiHandlerParams
open AdGroupsApiServiceInterface
open AdGroupsApiServiceImplementation
open OpenAPI.Model.AdGroup
open OpenAPI.Model.AdGroupAudienceSizing
open OpenAPI.Model.AdGroupAudienceSizingCreate
open OpenAPI.Model.AdGroupCreateCreate
open OpenAPI.Model.AdGroupUpdateBatchUpdate
open OpenAPI.Model.AdGroupsAnalyticsMetrics
open OpenAPI.Model.AdGroupsCreate200Response
open OpenAPI.Model.AdGroupsList200Response
open OpenAPI.Model.AdsAnalyticsAdGroupTargetingType
open OpenAPI.Model.BidFloor
open OpenAPI.Model.BidFloorCreate
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.DynamicTitlesDownloadCSV
open OpenAPI.Model.DynamicTitlesGetStatus
open OpenAPI.Model.DynamicTitlesProcessCSV
open OpenAPI.Model.DynamicTitlesProcessCSVCreate
open OpenAPI.Model.DynamicTitlesUploadURL
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.ReportingColumnSync
open OpenAPI.Model.ReportingTimeZone

module AdGroupsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AdGroupsAnalytics
    /// <summary>
    /// Get ad group analytics
    /// </summary>

    let AdGroupsAnalytics (pathParams:AdGroupsAnalyticsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdGroupsAnalyticsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdGroupsAnalyticsArgs
          let result = AdGroupsApiService.AdGroupsAnalytics ctx serviceArgs
          return! (match result with
                      | AdGroupsAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsAnalyticsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdGroupsAnalyticsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdGroupsAnalyticsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdGroupsAnalyticsStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdGroupsAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsAudienceSizing
    /// <summary>
    /// Get audience sizing
    /// </summary>

    let AdGroupsAudienceSizing (pathParams:AdGroupsAudienceSizingPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdGroupsAudienceSizingBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdGroupsAudienceSizingArgs
          let result = AdGroupsApiService.AdGroupsAudienceSizing ctx serviceArgs
          return! (match result with
                      | AdGroupsAudienceSizingStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsAudienceSizingStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | AdGroupsAudienceSizingStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsAudienceSizingStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdGroupsAudienceSizingStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdGroupsAudienceSizingStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdGroupsAudienceSizingStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdGroupsAudienceSizingDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsBidFloorGet
    /// <summary>
    /// Get bid floors
    /// </summary>

    let AdGroupsBidFloorGet (pathParams:AdGroupsBidFloorGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdGroupsBidFloorGetBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdGroupsBidFloorGetArgs
          let result = AdGroupsApiService.AdGroupsBidFloorGet ctx serviceArgs
          return! (match result with
                      | AdGroupsBidFloorGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsBidFloorGetStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | AdGroupsBidFloorGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsBidFloorGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdGroupsBidFloorGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdGroupsBidFloorGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdGroupsBidFloorGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdGroupsBidFloorGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsCreate
    /// <summary>
    /// Create ad groups
    /// </summary>

    let AdGroupsCreate (pathParams:AdGroupsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdGroupsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdGroupsCreateArgs
          let result = AdGroupsApiService.AdGroupsCreate ctx serviceArgs
          return! (match result with
                      | AdGroupsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdGroupsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdGroupsCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdGroupsCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdGroupsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsDynamicTitlesDownloadCsv
    /// <summary>
    /// Get dynamic titles CSV download URL
    /// </summary>

    let AdGroupsDynamicTitlesDownloadCsv (pathParams:AdGroupsDynamicTitlesDownloadCsvPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AdGroupsDynamicTitlesDownloadCsvArgs
          let result = AdGroupsApiService.AdGroupsDynamicTitlesDownloadCsv ctx serviceArgs
          return! (match result with
                      | AdGroupsDynamicTitlesDownloadCsvStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsDynamicTitlesDownloadCsvStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsDynamicTitlesDownloadCsvStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdGroupsDynamicTitlesDownloadCsvStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdGroupsDynamicTitlesDownloadCsvStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdGroupsDynamicTitlesDownloadCsvStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdGroupsDynamicTitlesDownloadCsvDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsDynamicTitlesGetStatus
    /// <summary>
    /// Get dynamic titles status
    /// </summary>

    let AdGroupsDynamicTitlesGetStatus (pathParams:AdGroupsDynamicTitlesGetStatusPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AdGroupsDynamicTitlesGetStatusArgs
          let result = AdGroupsApiService.AdGroupsDynamicTitlesGetStatus ctx serviceArgs
          return! (match result with
                      | AdGroupsDynamicTitlesGetStatusStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsDynamicTitlesGetStatusStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsDynamicTitlesGetStatusStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdGroupsDynamicTitlesGetStatusStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdGroupsDynamicTitlesGetStatusStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdGroupsDynamicTitlesGetStatusStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdGroupsDynamicTitlesGetStatusDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsDynamicTitlesGetUploadUrl
    /// <summary>
    /// Get dynamic titles upload URL
    /// </summary>

    let AdGroupsDynamicTitlesGetUploadUrl (pathParams:AdGroupsDynamicTitlesGetUploadUrlPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AdGroupsDynamicTitlesGetUploadUrlArgs
          let result = AdGroupsApiService.AdGroupsDynamicTitlesGetUploadUrl ctx serviceArgs
          return! (match result with
                      | AdGroupsDynamicTitlesGetUploadUrlStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsDynamicTitlesGetUploadUrlStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsDynamicTitlesGetUploadUrlStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdGroupsDynamicTitlesGetUploadUrlStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdGroupsDynamicTitlesGetUploadUrlStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdGroupsDynamicTitlesGetUploadUrlStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdGroupsDynamicTitlesGetUploadUrlDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsDynamicTitlesProcessCsv
    /// <summary>
    /// Process dynamic titles CSV
    /// </summary>

    let AdGroupsDynamicTitlesProcessCsv (pathParams:AdGroupsDynamicTitlesProcessCsvPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdGroupsDynamicTitlesProcessCsvBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdGroupsDynamicTitlesProcessCsvArgs
          let result = AdGroupsApiService.AdGroupsDynamicTitlesProcessCsv ctx serviceArgs
          return! (match result with
                      | AdGroupsDynamicTitlesProcessCsvStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsDynamicTitlesProcessCsvStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | AdGroupsDynamicTitlesProcessCsvStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsDynamicTitlesProcessCsvStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdGroupsDynamicTitlesProcessCsvStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdGroupsDynamicTitlesProcessCsvStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdGroupsDynamicTitlesProcessCsvStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdGroupsDynamicTitlesProcessCsvDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsGet
    /// <summary>
    /// Get ad group
    /// </summary>

    let AdGroupsGet (pathParams:AdGroupsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AdGroupsGetArgs
          let result = AdGroupsApiService.AdGroupsGet ctx serviceArgs
          return! (match result with
                      | AdGroupsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdGroupsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdGroupsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdGroupsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdGroupsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsList
    /// <summary>
    /// List ad groups
    /// </summary>

    let AdGroupsList (pathParams:AdGroupsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdGroupsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdGroupsListArgs
          let result = AdGroupsApiService.AdGroupsList ctx serviceArgs
          return! (match result with
                      | AdGroupsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdGroupsListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdGroupsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdGroupsListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdGroupsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsTargetingAnalyticsGet
    /// <summary>
    /// Get targeting analytics for ad groups
    /// </summary>

    let AdGroupsTargetingAnalyticsGet (pathParams:AdGroupsTargetingAnalyticsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdGroupsTargetingAnalyticsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdGroupsTargetingAnalyticsGetArgs
          let result = AdGroupsApiService.AdGroupsTargetingAnalyticsGet ctx serviceArgs
          return! (match result with
                      | AdGroupsTargetingAnalyticsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsTargetingAnalyticsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsTargetingAnalyticsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdGroupsTargetingAnalyticsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdGroupsTargetingAnalyticsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdGroupsTargetingAnalyticsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdGroupsTargetingAnalyticsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsUpdate
    /// <summary>
    /// Update ad groups
    /// </summary>

    let AdGroupsUpdate (pathParams:AdGroupsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdGroupsUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdGroupsUpdateArgs
          let result = AdGroupsApiService.AdGroupsUpdate ctx serviceArgs
          return! (match result with
                      | AdGroupsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdGroupsUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdGroupsUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdGroupsUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdGroupsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetAdGroupsByPromotionIdsList
    /// <summary>
    /// List of ad groups using promotions IDs.
    /// </summary>

    let GetAdGroupsByPromotionIdsList (pathParams:GetAdGroupsByPromotionIdsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetAdGroupsByPromotionIdsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetAdGroupsByPromotionIdsListArgs
          let result = AdGroupsApiService.GetAdGroupsByPromotionIdsList ctx serviceArgs
          return! (match result with
                      | GetAdGroupsByPromotionIdsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetAdGroupsByPromotionIdsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetAdGroupsByPromotionIdsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetAdGroupsByPromotionIdsListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetAdGroupsByPromotionIdsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetAdGroupsByPromotionIdsListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | GetAdGroupsByPromotionIdsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

