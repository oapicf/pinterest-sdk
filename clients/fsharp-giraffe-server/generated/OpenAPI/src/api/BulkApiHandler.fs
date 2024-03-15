namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BulkApiHandlerParams
open BulkApiServiceInterface
open BulkApiServiceImplementation
open OpenAPI.Model.BulkDownloadRequest
open OpenAPI.Model.BulkDownloadResponse
open OpenAPI.Model.BulkUpsertRequest
open OpenAPI.Model.BulkUpsertResponse
open OpenAPI.Model.BulkUpsertStatusResponse
open OpenAPI.Model.Error

module BulkApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region BulkDownloadCreate
    /// <summary>
    /// Get advertiser entities in bulk
    /// </summary>

    let BulkDownloadCreate (pathParams:BulkDownloadCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<BulkDownloadCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : BulkDownloadCreateArgs
          let result = BulkApiService.BulkDownloadCreate ctx serviceArgs
          return! (match result with
                      | BulkDownloadCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BulkDownloadCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BulkRequestGet
    /// <summary>
    /// Download advertiser entities in bulk
    /// </summary>

    let BulkRequestGet (pathParams:BulkRequestGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BulkRequestGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : BulkRequestGetArgs
          let result = BulkApiService.BulkRequestGet ctx serviceArgs
          return! (match result with
                      | BulkRequestGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BulkRequestGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BulkUpsertCreate
    /// <summary>
    /// Create/update ad entities in bulk
    /// </summary>

    let BulkUpsertCreate (pathParams:BulkUpsertCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<BulkUpsertCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : BulkUpsertCreateArgs
          let result = BulkApiService.BulkUpsertCreate ctx serviceArgs
          return! (match result with
                      | BulkUpsertCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BulkUpsertCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

