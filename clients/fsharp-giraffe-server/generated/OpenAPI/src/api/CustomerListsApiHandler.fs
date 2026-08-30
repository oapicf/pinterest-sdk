namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CustomerListsApiHandlerParams
open CustomerListsApiServiceInterface
open CustomerListsApiServiceImplementation
open OpenAPI.Model.CustomerList
open OpenAPI.Model.CustomerListCreate
open OpenAPI.Model.CustomerListUpdateWithRequiredBody
open OpenAPI.Model.CustomerListsList200Response
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder

module CustomerListsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CustomerListsCreate
    /// <summary>
    /// Create customer lists
    /// </summary>

    let CustomerListsCreate (pathParams:CustomerListsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CustomerListsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CustomerListsCreateArgs
          let result = CustomerListsApiService.CustomerListsCreate ctx serviceArgs
          return! (match result with
                      | CustomerListsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CustomerListsCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | CustomerListsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CustomerListsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CustomerListsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CustomerListsCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CustomerListsCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CustomerListsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CustomerListsGet
    /// <summary>
    /// Get customer list
    /// </summary>

    let CustomerListsGet (pathParams:CustomerListsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : CustomerListsGetArgs
          let result = CustomerListsApiService.CustomerListsGet ctx serviceArgs
          return! (match result with
                      | CustomerListsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CustomerListsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CustomerListsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CustomerListsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CustomerListsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CustomerListsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CustomerListsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CustomerListsList
    /// <summary>
    /// Get customer lists
    /// </summary>

    let CustomerListsList (pathParams:CustomerListsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CustomerListsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CustomerListsListArgs
          let result = CustomerListsApiService.CustomerListsList ctx serviceArgs
          return! (match result with
                      | CustomerListsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CustomerListsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CustomerListsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CustomerListsListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CustomerListsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CustomerListsListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CustomerListsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CustomerListsUpdate
    /// <summary>
    /// Update customer list
    /// </summary>

    let CustomerListsUpdate (pathParams:CustomerListsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CustomerListsUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CustomerListsUpdateArgs
          let result = CustomerListsApiService.CustomerListsUpdate ctx serviceArgs
          return! (match result with
                      | CustomerListsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CustomerListsUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CustomerListsUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CustomerListsUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CustomerListsUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CustomerListsUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CustomerListsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

