namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CatalogsApiHandlerParams
open CatalogsApiServiceInterface
open CatalogsApiServiceImplementation
open OpenAPI.Model.CatalogsFeed
open OpenAPI.Model.CatalogsItemValidationIssue
open OpenAPI.Model.CatalogsItems
open OpenAPI.Model.CatalogsItemsBatch
open OpenAPI.Model.CatalogsItemsFilters
open OpenAPI.Model.CatalogsList200Response
open OpenAPI.Model.CatalogsListProductsByFilterRequest
open OpenAPI.Model.CatalogsProductGroupPinsList200Response
open OpenAPI.Model.CatalogsProductGroupProductCounts
open OpenAPI.Model.CatalogsProductGroupsCreate201Response
open OpenAPI.Model.CatalogsProductGroupsCreateRequest
open OpenAPI.Model.CatalogsProductGroupsList200Response
open OpenAPI.Model.CatalogsProductGroupsUpdateRequest
open OpenAPI.Model.Error
open OpenAPI.Model.FeedProcessingResultsList200Response
open OpenAPI.Model.FeedsCreateRequest
open OpenAPI.Model.FeedsList200Response
open OpenAPI.Model.FeedsUpdateRequest
open OpenAPI.Model.ItemsBatchPostRequest
open OpenAPI.Model.ItemsIssuesList200Response

module CatalogsApiHandler =

    /// <summary>
    /// 
    /// </summary>

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

    //#region CatalogsProductGroupPinsList
    /// <summary>
    /// List products for a Product Group
    /// </summary>

    let CatalogsProductGroupPinsList (pathParams:CatalogsProductGroupPinsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsProductGroupPinsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CatalogsProductGroupPinsListArgs
          let result = CatalogsApiService.CatalogsProductGroupPinsList ctx serviceArgs
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
          let result = CatalogsApiService.CatalogsProductGroupsCreate ctx serviceArgs
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

    //#region CatalogsProductGroupsDelete
    /// <summary>
    /// Delete product group
    /// </summary>

    let CatalogsProductGroupsDelete (pathParams:CatalogsProductGroupsDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsProductGroupsDeleteQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CatalogsProductGroupsDeleteArgs
          let result = CatalogsApiService.CatalogsProductGroupsDelete ctx serviceArgs
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

    //#region CatalogsProductGroupsGet
    /// <summary>
    /// Get product group
    /// </summary>

    let CatalogsProductGroupsGet (pathParams:CatalogsProductGroupsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsProductGroupsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CatalogsProductGroupsGetArgs
          let result = CatalogsApiService.CatalogsProductGroupsGet ctx serviceArgs
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
          let result = CatalogsApiService.CatalogsProductGroupsList ctx serviceArgs
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
    /// Get product counts for a Product Group
    /// </summary>

    let CatalogsProductGroupsProductCountsGet (pathParams:CatalogsProductGroupsProductCountsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsProductGroupsProductCountsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CatalogsProductGroupsProductCountsGetArgs
          let result = CatalogsApiService.CatalogsProductGroupsProductCountsGet ctx serviceArgs
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
    /// Update product group
    /// </summary>

    let CatalogsProductGroupsUpdate (pathParams:CatalogsProductGroupsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsProductGroupsUpdateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<CatalogsProductGroupsUpdateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : CatalogsProductGroupsUpdateArgs
          let result = CatalogsApiService.CatalogsProductGroupsUpdate ctx serviceArgs
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

    //#region FeedProcessingResultsList
    /// <summary>
    /// List processing results for a given feed
    /// </summary>

    let FeedProcessingResultsList (pathParams:FeedProcessingResultsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<FeedProcessingResultsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : FeedProcessingResultsListArgs
          let result = CatalogsApiService.FeedProcessingResultsList ctx serviceArgs
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
          let result = CatalogsApiService.FeedsCreate ctx serviceArgs
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
          let result = CatalogsApiService.FeedsDelete ctx serviceArgs
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
          let result = CatalogsApiService.FeedsGet ctx serviceArgs
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

    //#region FeedsList
    /// <summary>
    /// List feeds
    /// </summary>

    let FeedsList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<FeedsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : FeedsListArgs
          let result = CatalogsApiService.FeedsList ctx serviceArgs
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
          let result = CatalogsApiService.FeedsUpdate ctx serviceArgs
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

    //#region ItemsBatchGet
    /// <summary>
    /// Get catalogs item batch status
    /// </summary>

    let ItemsBatchGet (pathParams:ItemsBatchGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemsBatchGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ItemsBatchGetArgs
          let result = CatalogsApiService.ItemsBatchGet ctx serviceArgs
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
          let result = CatalogsApiService.ItemsBatchPost ctx serviceArgs
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

    //#region ItemsGet
    /// <summary>
    /// Get catalogs items
    /// </summary>

    let ItemsGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : ItemsGetArgs
          let result = CatalogsApiService.ItemsGet ctx serviceArgs
          return! (match result with
                      | ItemsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ItemsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ItemsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ItemsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ItemsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ItemsIssuesList
    /// <summary>
    /// List item issues for a given processing result
    /// </summary>

    let ItemsIssuesList (pathParams:ItemsIssuesListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ItemsIssuesListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ItemsIssuesListArgs
          let result = CatalogsApiService.ItemsIssuesList ctx serviceArgs
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

    //#region ProductsByProductGroupFilterList
    /// <summary>
    /// List filtered products
    /// </summary>

    let ProductsByProductGroupFilterList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ProductsByProductGroupFilterListQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<ProductsByProductGroupFilterListBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : ProductsByProductGroupFilterListArgs
          let result = CatalogsApiService.ProductsByProductGroupFilterList ctx serviceArgs
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

