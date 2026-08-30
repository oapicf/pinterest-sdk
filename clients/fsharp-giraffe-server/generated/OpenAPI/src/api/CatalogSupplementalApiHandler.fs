namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CatalogSupplementalApiHandlerParams
open CatalogSupplementalApiServiceInterface
open CatalogSupplementalApiServiceImplementation
open OpenAPI.Model.CatalogsLocalStoresCreate200ResponseInner
open OpenAPI.Model.CatalogsLocalStoresDelete200ResponseInner
open OpenAPI.Model.CatalogsLocalStoresList200Response
open OpenAPI.Model.LocalInventoryItemsBatch
open OpenAPI.Model.LocalInventoryItemsBatchCreate
open OpenAPI.Model.LocalInventoryItemsGet
open OpenAPI.Model.LocalInventoryItemsGetCreate
open OpenAPI.Model.LocalStore
open OpenAPI.Model.LocalStoreBatchUpdate
open OpenAPI.Model.LocalStoreCreate
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.SupplementalItemsBatchResponse

module CatalogSupplementalApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CatalogsLocalInventoryItemsBatchOperate
    /// <summary>
    /// Operate on local inventory item batch
    /// </summary>

    let CatalogsLocalInventoryItemsBatchOperate (pathParams:CatalogsLocalInventoryItemsBatchOperatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsLocalInventoryItemsBatchOperateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<CatalogsLocalInventoryItemsBatchOperateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : CatalogsLocalInventoryItemsBatchOperateArgs
          let result = CatalogSupplementalApiService.CatalogsLocalInventoryItemsBatchOperate ctx serviceArgs
          return! (match result with
                      | CatalogsLocalInventoryItemsBatchOperateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CatalogsLocalInventoryItemsBatchOperateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | CatalogsLocalInventoryItemsBatchOperateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsLocalInventoryItemsBatchOperateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsLocalInventoryItemsBatchOperateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CatalogsLocalInventoryItemsBatchOperateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CatalogsLocalInventoryItemsBatchOperateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CatalogsLocalInventoryItemsBatchOperateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsLocalInventoryItemsPost
    /// <summary>
    /// Get local inventory items (POST)
    /// </summary>

    let CatalogsLocalInventoryItemsPost (pathParams:CatalogsLocalInventoryItemsPostPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsLocalInventoryItemsPostQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<CatalogsLocalInventoryItemsPostBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : CatalogsLocalInventoryItemsPostArgs
          let result = CatalogSupplementalApiService.CatalogsLocalInventoryItemsPost ctx serviceArgs
          return! (match result with
                      | CatalogsLocalInventoryItemsPostStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CatalogsLocalInventoryItemsPostStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | CatalogsLocalInventoryItemsPostStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsLocalInventoryItemsPostStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsLocalInventoryItemsPostStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CatalogsLocalInventoryItemsPostStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CatalogsLocalInventoryItemsPostStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CatalogsLocalInventoryItemsPostDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsLocalStoresCreate
    /// <summary>
    /// Create local stores
    /// </summary>

    let CatalogsLocalStoresCreate (pathParams:CatalogsLocalStoresCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsLocalStoresCreateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<CatalogsLocalStoresCreateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : CatalogsLocalStoresCreateArgs
          let result = CatalogSupplementalApiService.CatalogsLocalStoresCreate ctx serviceArgs
          return! (match result with
                      | CatalogsLocalStoresCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CatalogsLocalStoresCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | CatalogsLocalStoresCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsLocalStoresCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsLocalStoresCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CatalogsLocalStoresCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CatalogsLocalStoresCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CatalogsLocalStoresCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsLocalStoresDelete
    /// <summary>
    /// Delete local stores
    /// </summary>

    let CatalogsLocalStoresDelete (pathParams:CatalogsLocalStoresDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsLocalStoresDeleteQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CatalogsLocalStoresDeleteArgs
          let result = CatalogSupplementalApiService.CatalogsLocalStoresDelete ctx serviceArgs
          return! (match result with
                      | CatalogsLocalStoresDeleteStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CatalogsLocalStoresDeleteStatusCode204 resolved ->
                            setStatusCode 204 >=> text resolved.content
                      | CatalogsLocalStoresDeleteStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsLocalStoresDeleteStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsLocalStoresDeleteStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CatalogsLocalStoresDeleteStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CatalogsLocalStoresDeleteStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CatalogsLocalStoresDeleteDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsLocalStoresList
    /// <summary>
    /// List local stores
    /// </summary>

    let CatalogsLocalStoresList (pathParams:CatalogsLocalStoresListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsLocalStoresListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CatalogsLocalStoresListArgs
          let result = CatalogSupplementalApiService.CatalogsLocalStoresList ctx serviceArgs
          return! (match result with
                      | CatalogsLocalStoresListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CatalogsLocalStoresListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsLocalStoresListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsLocalStoresListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CatalogsLocalStoresListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CatalogsLocalStoresListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CatalogsLocalStoresListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsLocalStoresUpdate
    /// <summary>
    /// Update local stores
    /// </summary>

    let CatalogsLocalStoresUpdate (pathParams:CatalogsLocalStoresUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsLocalStoresUpdateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<CatalogsLocalStoresUpdateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : CatalogsLocalStoresUpdateArgs
          let result = CatalogSupplementalApiService.CatalogsLocalStoresUpdate ctx serviceArgs
          return! (match result with
                      | CatalogsLocalStoresUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CatalogsLocalStoresUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsLocalStoresUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsLocalStoresUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CatalogsLocalStoresUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CatalogsLocalStoresUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CatalogsLocalStoresUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CatalogsSupplementalItemsBatchGet
    /// <summary>
    /// Get supplemental items batch status
    /// </summary>

    let CatalogsSupplementalItemsBatchGet (pathParams:CatalogsSupplementalItemsBatchGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CatalogsSupplementalItemsBatchGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CatalogsSupplementalItemsBatchGetArgs
          let result = CatalogSupplementalApiService.CatalogsSupplementalItemsBatchGet ctx serviceArgs
          return! (match result with
                      | CatalogsSupplementalItemsBatchGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CatalogsSupplementalItemsBatchGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CatalogsSupplementalItemsBatchGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CatalogsSupplementalItemsBatchGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CatalogsSupplementalItemsBatchGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CatalogsSupplementalItemsBatchGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CatalogsSupplementalItemsBatchGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

