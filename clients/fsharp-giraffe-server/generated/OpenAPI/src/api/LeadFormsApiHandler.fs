namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open LeadFormsApiHandlerParams
open LeadFormsApiServiceInterface
open LeadFormsApiServiceImplementation
open OpenAPI.Model.Error
open OpenAPI.Model.LeadFormResponse
open OpenAPI.Model.LeadFormTestRequest
open OpenAPI.Model.LeadFormTestResponse
open OpenAPI.Model.LeadFormsList200Response

module LeadFormsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region LeadFormGet
    /// <summary>
    /// Get lead form by id
    /// </summary>

    let LeadFormGet (pathParams:LeadFormGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : LeadFormGetArgs
          let result = LeadFormsApiService.LeadFormGet ctx serviceArgs
          return! (match result with
                      | LeadFormGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | LeadFormGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | LeadFormGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | LeadFormGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region LeadFormTestCreate
    /// <summary>
    /// Create lead form test data
    /// </summary>

    let LeadFormTestCreate (pathParams:LeadFormTestCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<LeadFormTestCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : LeadFormTestCreateArgs
          let result = LeadFormsApiService.LeadFormTestCreate ctx serviceArgs
          return! (match result with
                      | LeadFormTestCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | LeadFormTestCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | LeadFormTestCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | LeadFormTestCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region LeadFormsList
    /// <summary>
    /// Get lead forms
    /// </summary>

    let LeadFormsList (pathParams:LeadFormsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<LeadFormsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : LeadFormsListArgs
          let result = LeadFormsApiService.LeadFormsList ctx serviceArgs
          return! (match result with
                      | LeadFormsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | LeadFormsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | LeadFormsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

