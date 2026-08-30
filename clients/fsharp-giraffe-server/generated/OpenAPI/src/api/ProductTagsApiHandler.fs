namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ProductTagsApiHandlerParams
open ProductTagsApiServiceInterface
open ProductTagsApiServiceImplementation
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.ProductTagsBulkAddRequest
open OpenAPI.Model.ProductTagsBulkDeleteRequest
open OpenAPI.Model.ProductTagsError
open OpenAPI.Model.ProductTagsResponse

module ProductTagsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ProductTagsBulkAdd
    /// <summary>
    /// Add product tags to pin
    /// </summary>

    let ProductTagsBulkAdd (pathParams:ProductTagsBulkAddPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ProductTagsBulkAddBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ProductTagsBulkAddArgs
          let result = ProductTagsApiService.ProductTagsBulkAdd ctx serviceArgs
          return! (match result with
                      | ProductTagsBulkAddStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ProductTagsBulkAddStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ProductTagsBulkAddStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ProductTagsBulkAddStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ProductTagsBulkAddStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | ProductTagsBulkAddDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ProductTagsBulkDelete
    /// <summary>
    /// Delete product tags from pin
    /// </summary>

    let ProductTagsBulkDelete (pathParams:ProductTagsBulkDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ProductTagsBulkDeleteBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ProductTagsBulkDeleteArgs
          let result = ProductTagsApiService.ProductTagsBulkDelete ctx serviceArgs
          return! (match result with
                      | ProductTagsBulkDeleteStatusCode204 resolved ->
                            setStatusCode 204 >=> text resolved.content
                      | ProductTagsBulkDeleteStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ProductTagsBulkDeleteStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ProductTagsBulkDeleteStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ProductTagsBulkDeleteStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ProductTagsBulkDeleteStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | ProductTagsBulkDeleteDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ProductTagsList
    /// <summary>
    /// Get product tags for pin
    /// </summary>

    let ProductTagsList (pathParams:ProductTagsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ProductTagsListArgs
          let result = ProductTagsApiService.ProductTagsList ctx serviceArgs
          return! (match result with
                      | ProductTagsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ProductTagsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ProductTagsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ProductTagsListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ProductTagsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ProductTagsListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | ProductTagsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

