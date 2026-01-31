namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CatalogsApiHandlerParams
open CatalogsApiServiceInterface
open CatalogsApiServiceImplementation
open OpenAPI.Model.Catalog
open OpenAPI.Model.CatalogsAvailableFilterValues
open OpenAPI.Model.CatalogsCreateRequest
open OpenAPI.Model.CatalogsList200Response
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.Country
open OpenAPI.Model.Error

module CatalogsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CatalogsAvailableFilterValues
    /// <summary>
    /// List available filter values
    /// </summary>

    let CatalogsAvailableFilterValues  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsAvailableFilterValuesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : CatalogsAvailableFilterValuesArgs
          let result = CatalogsApiService.CatalogsAvailableFilterValues ctx serviceArgs
          return! (match result with
                      | CatalogsAvailableFilterValuesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CatalogsAvailableFilterValuesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsAvailableFilterValuesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsAvailableFilterValuesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CatalogsAvailableFilterValuesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CatalogsAvailableFilterValuesStatusCode409 resolved ->
                            setStatusCode 409 >=> json resolved.content
                      | CatalogsAvailableFilterValuesDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsCreate
    /// <summary>
    /// Create catalog
    /// </summary>

    let CatalogsCreate  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsCreateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<CatalogsCreateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : CatalogsCreateArgs
          let result = CatalogsApiService.CatalogsCreate ctx serviceArgs
          return! (match result with
                      | CatalogsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CatalogsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsList
    /// <summary>
    /// List catalogs
    /// </summary>

    let CatalogsList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : CatalogsListArgs
          let result = CatalogsApiService.CatalogsList ctx serviceArgs
          return! (match result with
                      | CatalogsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CatalogsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

