namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open LeadFormsApiHandlerParams
open LeadFormsApiServiceInterface
open LeadFormsApiServiceImplementation
open OpenAPI.Model.LeadForm
open OpenAPI.Model.LeadFormBatchUpdate
open OpenAPI.Model.LeadFormCreate
open OpenAPI.Model.LeadFormTest
open OpenAPI.Model.LeadFormTestCreate
open OpenAPI.Model.LeadFormsCreate200Response
open OpenAPI.Model.LeadFormsList200Response
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder

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
                      | LeadFormGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | LeadFormGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | LeadFormGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | LeadFormGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
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

    //#region LeadFormsCreate
    /// <summary>
    /// Create lead forms
    /// </summary>

    let LeadFormsCreate (pathParams:LeadFormsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<LeadFormsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : LeadFormsCreateArgs
          let result = LeadFormsApiService.LeadFormsCreate ctx serviceArgs
          return! (match result with
                      | LeadFormsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | LeadFormsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | LeadFormsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | LeadFormsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | LeadFormsCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | LeadFormsCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | LeadFormsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region LeadFormsList
    /// <summary>
    /// List lead forms
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
                      | LeadFormsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | LeadFormsListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | LeadFormsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | LeadFormsListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | LeadFormsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region LeadFormsUpdate
    /// <summary>
    /// Update lead forms
    /// </summary>

    let LeadFormsUpdate (pathParams:LeadFormsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<LeadFormsUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : LeadFormsUpdateArgs
          let result = LeadFormsApiService.LeadFormsUpdate ctx serviceArgs
          return! (match result with
                      | LeadFormsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | LeadFormsUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | LeadFormsUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | LeadFormsUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | LeadFormsUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | LeadFormsUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | LeadFormsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

