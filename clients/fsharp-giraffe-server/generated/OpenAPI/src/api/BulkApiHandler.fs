namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BulkApiHandlerParams
open BulkApiServiceInterface
open BulkApiServiceImplementation
open OpenAPI.Model.BulkDownload
open OpenAPI.Model.BulkDownloadCreate
open OpenAPI.Model.BulkJobData
open OpenAPI.Model.BulkUpsertRequest
open OpenAPI.Model.BulkUpsertResponse
open OpenAPI.Model.PinterestLibError

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
                      | BulkDownloadCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | BulkDownloadCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BulkDownloadCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BulkDownloadCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BulkDownloadCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BulkDownloadCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
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
                      | BulkRequestGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BulkRequestGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BulkRequestGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BulkRequestGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BulkRequestGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
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

