namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CatalogFeedsApiHandlerParams
open CatalogFeedsApiServiceInterface
open CatalogFeedsApiServiceImplementation
open OpenAPI.Model.CatalogsFeed
open OpenAPI.Model.CatalogsFeedIngestion
open OpenAPI.Model.CatalogsItemValidationIssue
open OpenAPI.Model.Error
open OpenAPI.Model.FeedProcessingResultsList200Response
open OpenAPI.Model.FeedsCreateRequest
open OpenAPI.Model.FeedsList200Response
open OpenAPI.Model.FeedsUpdateRequest
open OpenAPI.Model.ItemsIssuesList200Response

module CatalogFeedsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region FeedProcessingResultsList
    /// <summary>
    /// List feed processing results
    /// </summary>

    let FeedProcessingResultsList (pathParams:FeedProcessingResultsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<FeedProcessingResultsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : FeedProcessingResultsListArgs
          let result = CatalogFeedsApiService.FeedProcessingResultsList ctx serviceArgs
          return! (match result with
                      | FeedProcessingResultsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | FeedProcessingResultsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | FeedProcessingResultsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | FeedProcessingResultsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | FeedProcessingResultsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region FeedsCreate
    /// <summary>
    /// Create feed
    /// </summary>

    let FeedsCreate  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<FeedsCreateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<FeedsCreateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : FeedsCreateArgs
          let result = CatalogFeedsApiService.FeedsCreate ctx serviceArgs
          return! (match result with
                      | FeedsCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | FeedsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | FeedsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | FeedsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | FeedsCreateStatusCode409 resolved ->
                            setStatusCode 409 >=> json resolved.content
                      | FeedsCreateStatusCode422 resolved ->
                            setStatusCode 422 >=> json resolved.content
                      | FeedsCreateStatusCode501 resolved ->
                            setStatusCode 501 >=> json resolved.content
                      | FeedsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region FeedsDelete
    /// <summary>
    /// Delete feed
    /// </summary>

    let FeedsDelete (pathParams:FeedsDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<FeedsDeleteQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : FeedsDeleteArgs
          let result = CatalogFeedsApiService.FeedsDelete ctx serviceArgs
          return! (match result with
                      | FeedsDeleteStatusCode204 resolved ->
                            setStatusCode 204 >=> text resolved.content
                      | FeedsDeleteStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | FeedsDeleteStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | FeedsDeleteStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | FeedsDeleteStatusCode409 resolved ->
                            setStatusCode 409 >=> json resolved.content
                      | FeedsDeleteDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region FeedsGet
    /// <summary>
    /// Get feed
    /// </summary>

    let FeedsGet (pathParams:FeedsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<FeedsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : FeedsGetArgs
          let result = CatalogFeedsApiService.FeedsGet ctx serviceArgs
          return! (match result with
                      | FeedsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | FeedsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | FeedsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | FeedsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | FeedsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region FeedsIngest
    /// <summary>
    /// Ingest feed items
    /// </summary>

    let FeedsIngest (pathParams:FeedsIngestPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<FeedsIngestQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : FeedsIngestArgs
          let result = CatalogFeedsApiService.FeedsIngest ctx serviceArgs
          return! (match result with
                      | FeedsIngestStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | FeedsIngestStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | FeedsIngestStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | FeedsIngestStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | FeedsIngestDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region FeedsList
    /// <summary>
    /// List feeds
    /// </summary>

    let FeedsList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<FeedsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : FeedsListArgs
          let result = CatalogFeedsApiService.FeedsList ctx serviceArgs
          return! (match result with
                      | FeedsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | FeedsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | FeedsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | FeedsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region FeedsUpdate
    /// <summary>
    /// Update feed
    /// </summary>

    let FeedsUpdate (pathParams:FeedsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<FeedsUpdateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<FeedsUpdateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : FeedsUpdateArgs
          let result = CatalogFeedsApiService.FeedsUpdate ctx serviceArgs
          return! (match result with
                      | FeedsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | FeedsUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | FeedsUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | FeedsUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | FeedsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemsIssuesList
    /// <summary>
    /// List item issues
    /// </summary>

    let ItemsIssuesList (pathParams:ItemsIssuesListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemsIssuesListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ItemsIssuesListArgs
          let result = CatalogFeedsApiService.ItemsIssuesList ctx serviceArgs
          return! (match result with
                      | ItemsIssuesListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ItemsIssuesListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ItemsIssuesListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ItemsIssuesListStatusCode501 resolved ->
                            setStatusCode 501 >=> json resolved.content
                      | ItemsIssuesListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

