namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ConversionDeletionRequestsApiHandlerParams
open ConversionDeletionRequestsApiServiceInterface
open ConversionDeletionRequestsApiServiceImplementation
open OpenAPI.Model.ConversionDeletionRequest
open OpenAPI.Model.ConversionDeletionRequestCreate
open OpenAPI.Model.ConversionDeletionRequestList200Response
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder

module ConversionDeletionRequestsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ConversionDeletionRequestCreate
    /// <summary>
    /// Create a conversion deletion request
    /// </summary>

    let ConversionDeletionRequestCreate (pathParams:ConversionDeletionRequestCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ConversionDeletionRequestCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ConversionDeletionRequestCreateArgs
          let result = ConversionDeletionRequestsApiService.ConversionDeletionRequestCreate ctx serviceArgs
          return! (match result with
                      | ConversionDeletionRequestCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ConversionDeletionRequestCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | ConversionDeletionRequestCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ConversionDeletionRequestCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ConversionDeletionRequestCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ConversionDeletionRequestCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ConversionDeletionRequestCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | ConversionDeletionRequestCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ConversionDeletionRequestDelete
    /// <summary>
    /// Delete a conversion deletion request
    /// </summary>

    let ConversionDeletionRequestDelete (pathParams:ConversionDeletionRequestDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ConversionDeletionRequestDeleteArgs
          let result = ConversionDeletionRequestsApiService.ConversionDeletionRequestDelete ctx serviceArgs
          return! (match result with
                      | ConversionDeletionRequestDeleteStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ConversionDeletionRequestDeleteStatusCode204 resolved ->
                            setStatusCode 204 >=> text resolved.content
                      | ConversionDeletionRequestDeleteStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ConversionDeletionRequestDeleteStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ConversionDeletionRequestDeleteStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ConversionDeletionRequestDeleteStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ConversionDeletionRequestDeleteStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | ConversionDeletionRequestDeleteDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ConversionDeletionRequestGet
    /// <summary>
    /// Get a single conversion deletion request
    /// </summary>

    let ConversionDeletionRequestGet (pathParams:ConversionDeletionRequestGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ConversionDeletionRequestGetArgs
          let result = ConversionDeletionRequestsApiService.ConversionDeletionRequestGet ctx serviceArgs
          return! (match result with
                      | ConversionDeletionRequestGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ConversionDeletionRequestGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ConversionDeletionRequestGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ConversionDeletionRequestGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ConversionDeletionRequestGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ConversionDeletionRequestGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | ConversionDeletionRequestGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ConversionDeletionRequestList
    /// <summary>
    /// List conversion deletion requests
    /// </summary>

    let ConversionDeletionRequestList (pathParams:ConversionDeletionRequestListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ConversionDeletionRequestListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ConversionDeletionRequestListArgs
          let result = ConversionDeletionRequestsApiService.ConversionDeletionRequestList ctx serviceArgs
          return! (match result with
                      | ConversionDeletionRequestListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ConversionDeletionRequestListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ConversionDeletionRequestListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ConversionDeletionRequestListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ConversionDeletionRequestListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ConversionDeletionRequestListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | ConversionDeletionRequestListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

