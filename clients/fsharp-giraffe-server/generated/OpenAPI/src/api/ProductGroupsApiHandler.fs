namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ProductGroupsApiHandlerParams
open ProductGroupsApiServiceInterface
open ProductGroupsApiServiceImplementation
open OpenAPI.Model.AdAccountsCatalogsProductGroupsList200Response
open OpenAPI.Model.Error

module ProductGroupsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AdAccountsCatalogsProductGroupsList
    /// <summary>
    /// Get catalog product groups
    /// </summary>

    let AdAccountsCatalogsProductGroupsList (pathParams:AdAccountsCatalogsProductGroupsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdAccountsCatalogsProductGroupsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdAccountsCatalogsProductGroupsListArgs
          let result = ProductGroupsApiService.AdAccountsCatalogsProductGroupsList ctx serviceArgs
          return! (match result with
                      | AdAccountsCatalogsProductGroupsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdAccountsCatalogsProductGroupsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdAccountsCatalogsProductGroupsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdAccountsCatalogsProductGroupsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdAccountsCatalogsProductGroupsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

