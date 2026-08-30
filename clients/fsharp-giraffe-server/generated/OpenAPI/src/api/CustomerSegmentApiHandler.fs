namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CustomerSegmentApiHandlerParams
open CustomerSegmentApiServiceInterface
open CustomerSegmentApiServiceImplementation
open OpenAPI.Model.CustomerSegment
open OpenAPI.Model.CustomerSegmentCreate
open OpenAPI.Model.CustomerSegmentList200Response
open OpenAPI.Model.CustomerSegmentUpdateRequestUpdateWithRequiredBody
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder

module CustomerSegmentApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CustomerSegmentCreate
    /// <summary>
    /// Create customer segments
    /// </summary>

    let CustomerSegmentCreate (pathParams:CustomerSegmentCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CustomerSegmentCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CustomerSegmentCreateArgs
          let result = CustomerSegmentApiService.CustomerSegmentCreate ctx serviceArgs
          return! (match result with
                      | CustomerSegmentCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CustomerSegmentCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | CustomerSegmentCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CustomerSegmentCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CustomerSegmentCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CustomerSegmentCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CustomerSegmentCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CustomerSegmentCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CustomerSegmentList
    /// <summary>
    /// List customer segments
    /// </summary>

    let CustomerSegmentList (pathParams:CustomerSegmentListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CustomerSegmentListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CustomerSegmentListArgs
          let result = CustomerSegmentApiService.CustomerSegmentList ctx serviceArgs
          return! (match result with
                      | CustomerSegmentListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CustomerSegmentListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CustomerSegmentListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CustomerSegmentListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CustomerSegmentListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CustomerSegmentListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CustomerSegmentListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CustomerSegmentUpdate
    /// <summary>
    /// Update customer segments
    /// </summary>

    let CustomerSegmentUpdate (pathParams:CustomerSegmentUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CustomerSegmentUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CustomerSegmentUpdateArgs
          let result = CustomerSegmentApiService.CustomerSegmentUpdate ctx serviceArgs
          return! (match result with
                      | CustomerSegmentUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | CustomerSegmentUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CustomerSegmentUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CustomerSegmentUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CustomerSegmentUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CustomerSegmentUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CustomerSegmentUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

