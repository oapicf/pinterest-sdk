namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CatalogProductGroupsApiHandlerParams
open CatalogProductGroupsApiServiceInterface
open CatalogProductGroupsApiServiceImplementation
open OpenAPI.Model.CatalogsListProductsByFilterRequest
open OpenAPI.Model.CatalogsProductGroupPinsList200Response
open OpenAPI.Model.CatalogsProductGroupProductCountsVertical
open OpenAPI.Model.CatalogsProductGroupsList200Response
open OpenAPI.Model.CatalogsProductGroupsUpdateRequest
open OpenAPI.Model.CatalogsVerticalProductGroup
open OpenAPI.Model.Error
open OpenAPI.Model.MultipleProductGroupsInner

module CatalogProductGroupsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CatalogsProductGroupPinsList
    /// <summary>
    /// List products by product group
    /// </summary>

    let CatalogsProductGroupPinsList (pathParams:CatalogsProductGroupPinsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsProductGroupPinsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CatalogsProductGroupPinsListArgs
          let result = CatalogProductGroupsApiService.CatalogsProductGroupPinsList ctx serviceArgs
          return! (match result with
                      | CatalogsProductGroupPinsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CatalogsProductGroupPinsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsProductGroupPinsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsProductGroupPinsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CatalogsProductGroupPinsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsProductGroupsCreate
    /// <summary>
    /// Create product group
    /// </summary>

    let CatalogsProductGroupsCreate  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsProductGroupsCreateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<CatalogsProductGroupsCreateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : CatalogsProductGroupsCreateArgs
          let result = CatalogProductGroupsApiService.CatalogsProductGroupsCreate ctx serviceArgs
          return! (match result with
                      | CatalogsProductGroupsCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | CatalogsProductGroupsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsProductGroupsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsProductGroupsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CatalogsProductGroupsCreateStatusCode409 resolved ->
                            setStatusCode 409 >=> json resolved.content
                      | CatalogsProductGroupsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsProductGroupsCreateMany
    /// <summary>
    /// Create product groups
    /// </summary>

    let CatalogsProductGroupsCreateMany  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsProductGroupsCreateManyQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<CatalogsProductGroupsCreateManyBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : CatalogsProductGroupsCreateManyArgs
          let result = CatalogProductGroupsApiService.CatalogsProductGroupsCreateMany ctx serviceArgs
          return! (match result with
                      | CatalogsProductGroupsCreateManyStatusCode201 resolved ->
                            setStatusCode 201 >=> text resolved.content
                      | CatalogsProductGroupsCreateManyStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsProductGroupsCreateManyStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsProductGroupsCreateManyStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CatalogsProductGroupsCreateManyStatusCode409 resolved ->
                            setStatusCode 409 >=> json resolved.content
                      | CatalogsProductGroupsCreateManyDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsProductGroupsDelete
    /// <summary>
    /// Delete product group
    /// </summary>

    let CatalogsProductGroupsDelete (pathParams:CatalogsProductGroupsDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsProductGroupsDeleteQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CatalogsProductGroupsDeleteArgs
          let result = CatalogProductGroupsApiService.CatalogsProductGroupsDelete ctx serviceArgs
          return! (match result with
                      | CatalogsProductGroupsDeleteStatusCode204 resolved ->
                            setStatusCode 204 >=> text resolved.content
                      | CatalogsProductGroupsDeleteStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsProductGroupsDeleteStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsProductGroupsDeleteStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CatalogsProductGroupsDeleteStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CatalogsProductGroupsDeleteStatusCode409 resolved ->
                            setStatusCode 409 >=> json resolved.content
                      | CatalogsProductGroupsDeleteDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsProductGroupsDeleteMany
    /// <summary>
    /// Delete product groups
    /// </summary>

    let CatalogsProductGroupsDeleteMany  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsProductGroupsDeleteManyQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : CatalogsProductGroupsDeleteManyArgs
          let result = CatalogProductGroupsApiService.CatalogsProductGroupsDeleteMany ctx serviceArgs
          return! (match result with
                      | CatalogsProductGroupsDeleteManyStatusCode204 resolved ->
                            setStatusCode 204 >=> text resolved.content
                      | CatalogsProductGroupsDeleteManyStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsProductGroupsDeleteManyStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CatalogsProductGroupsDeleteManyStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CatalogsProductGroupsDeleteManyStatusCode409 resolved ->
                            setStatusCode 409 >=> json resolved.content
                      | CatalogsProductGroupsDeleteManyDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsProductGroupsGet
    /// <summary>
    /// Get product group
    /// </summary>

    let CatalogsProductGroupsGet (pathParams:CatalogsProductGroupsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsProductGroupsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CatalogsProductGroupsGetArgs
          let result = CatalogProductGroupsApiService.CatalogsProductGroupsGet ctx serviceArgs
          return! (match result with
                      | CatalogsProductGroupsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CatalogsProductGroupsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsProductGroupsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsProductGroupsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CatalogsProductGroupsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CatalogsProductGroupsGetStatusCode409 resolved ->
                            setStatusCode 409 >=> json resolved.content
                      | CatalogsProductGroupsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsProductGroupsList
    /// <summary>
    /// List product groups
    /// </summary>

    let CatalogsProductGroupsList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsProductGroupsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : CatalogsProductGroupsListArgs
          let result = CatalogProductGroupsApiService.CatalogsProductGroupsList ctx serviceArgs
          return! (match result with
                      | CatalogsProductGroupsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CatalogsProductGroupsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsProductGroupsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsProductGroupsListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CatalogsProductGroupsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CatalogsProductGroupsListStatusCode409 resolved ->
                            setStatusCode 409 >=> json resolved.content
                      | CatalogsProductGroupsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsProductGroupsProductCountsGet
    /// <summary>
    /// Get product counts
    /// </summary>

    let CatalogsProductGroupsProductCountsGet (pathParams:CatalogsProductGroupsProductCountsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsProductGroupsProductCountsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CatalogsProductGroupsProductCountsGetArgs
          let result = CatalogProductGroupsApiService.CatalogsProductGroupsProductCountsGet ctx serviceArgs
          return! (match result with
                      | CatalogsProductGroupsProductCountsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CatalogsProductGroupsProductCountsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CatalogsProductGroupsProductCountsGetStatusCode409 resolved ->
                            setStatusCode 409 >=> json resolved.content
                      | CatalogsProductGroupsProductCountsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsProductGroupsUpdate
    /// <summary>
    /// Update single product group
    /// </summary>

    let CatalogsProductGroupsUpdate (pathParams:CatalogsProductGroupsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsProductGroupsUpdateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<CatalogsProductGroupsUpdateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : CatalogsProductGroupsUpdateArgs
          let result = CatalogProductGroupsApiService.CatalogsProductGroupsUpdate ctx serviceArgs
          return! (match result with
                      | CatalogsProductGroupsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CatalogsProductGroupsUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsProductGroupsUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsProductGroupsUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CatalogsProductGroupsUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CatalogsProductGroupsUpdateStatusCode409 resolved ->
                            setStatusCode 409 >=> json resolved.content
                      | CatalogsProductGroupsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ProductsByProductGroupFilterList
    /// <summary>
    /// List products by filter
    /// </summary>

    let ProductsByProductGroupFilterList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ProductsByProductGroupFilterListQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<ProductsByProductGroupFilterListBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : ProductsByProductGroupFilterListArgs
          let result = CatalogProductGroupsApiService.ProductsByProductGroupFilterList ctx serviceArgs
          return! (match result with
                      | ProductsByProductGroupFilterListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ProductsByProductGroupFilterListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ProductsByProductGroupFilterListStatusCode409 resolved ->
                            setStatusCode 409 >=> json resolved.content
                      | ProductsByProductGroupFilterListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

