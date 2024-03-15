namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CustomerListsApiHandlerParams
open CustomerListsApiServiceInterface
open CustomerListsApiServiceImplementation
open OpenAPI.Model.CustomerList
open OpenAPI.Model.CustomerListRequest
open OpenAPI.Model.CustomerListUpdateRequest
open OpenAPI.Model.CustomerListsList200Response
open OpenAPI.Model.Error

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
                      | CustomerListsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

