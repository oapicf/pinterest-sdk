namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CatalogItemsApiHandlerParams
open CatalogItemsApiServiceInterface
open CatalogItemsApiServiceImplementation
open OpenAPI.Model.CatalogsItems
open OpenAPI.Model.CatalogsItemsBatch
open OpenAPI.Model.CatalogsItemsRequest
open OpenAPI.Model.Error
open OpenAPI.Model.ItemsBatchPostRequest

module CatalogItemsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ItemsBatchGet
    /// <summary>
    /// Get item batch status
    /// </summary>

    let ItemsBatchGet (pathParams:ItemsBatchGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemsBatchGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ItemsBatchGetArgs
          let result = CatalogItemsApiService.ItemsBatchGet ctx serviceArgs
          return! (match result with
                      | ItemsBatchGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ItemsBatchGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ItemsBatchGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ItemsBatchGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ItemsBatchGetStatusCode405 resolved ->
                            setStatusCode 405 >=> json resolved.content
                      | ItemsBatchGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemsBatchPost
    /// <summary>
    /// Operate on item batch
    /// </summary>

    let ItemsBatchPost  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemsBatchPostQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<ItemsBatchPostBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : ItemsBatchPostArgs
          let result = CatalogItemsApiService.ItemsBatchPost ctx serviceArgs
          return! (match result with
                      | ItemsBatchPostStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ItemsBatchPostStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ItemsBatchPostStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ItemsBatchPostStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ItemsBatchPostDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemsPost
    /// <summary>
    /// Get catalogs items (POST)
    /// </summary>

    let ItemsPost  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemsPostQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<ItemsPostBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : ItemsPostArgs
          let result = CatalogItemsApiService.ItemsPost ctx serviceArgs
          return! (match result with
                      | ItemsPostStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ItemsPostStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ItemsPostStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ItemsPostStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ItemsPostDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

