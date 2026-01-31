namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CatalogReportsApiHandlerParams
open CatalogReportsApiServiceInterface
open CatalogReportsApiServiceImplementation
open OpenAPI.Model.CatalogsCreateReportResponse
open OpenAPI.Model.CatalogsReport
open OpenAPI.Model.CatalogsReportParameters
open OpenAPI.Model.Error
open OpenAPI.Model.ReportsStats200Response
open OpenAPI.Model.ReportsStatsParametersParameter

module CatalogReportsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ReportsCreate
    /// <summary>
    /// Build catalogs report
    /// </summary>

    let ReportsCreate  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ReportsCreateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<ReportsCreateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : ReportsCreateArgs
          let result = CatalogReportsApiService.ReportsCreate ctx serviceArgs
          return! (match result with
                      | ReportsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ReportsCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ReportsCreateStatusCode409 resolved ->
                            setStatusCode 409 >=> json resolved.content
                      | ReportsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ReportsGet
    /// <summary>
    /// Get catalogs report
    /// </summary>

    let ReportsGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ReportsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ReportsGetArgs
          let result = CatalogReportsApiService.ReportsGet ctx serviceArgs
          return! (match result with
                      | ReportsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ReportsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ReportsGetStatusCode409 resolved ->
                            setStatusCode 409 >=> json resolved.content
                      | ReportsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ReportsStats
    /// <summary>
    /// List report stats
    /// </summary>

    let ReportsStats  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ReportsStatsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ReportsStatsArgs
          let result = CatalogReportsApiService.ReportsStats ctx serviceArgs
          return! (match result with
                      | ReportsStatsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ReportsStatsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ReportsStatsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

