namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ConversionTagsApiHandlerParams
open ConversionTagsApiServiceInterface
open ConversionTagsApiServiceImplementation
open OpenAPI.Model.ConversionEventResponse
open OpenAPI.Model.ConversionTagCreate
open OpenAPI.Model.ConversionTagListResponse
open OpenAPI.Model.ConversionTagResponse
open OpenAPI.Model.Error
open System.Collections.Generic
open OpenAPI.Model.PageVisitConversionTagsGet200Response

module ConversionTagsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ConversionTagsCreate
    /// <summary>
    /// Create conversion tag
    /// </summary>

    let ConversionTagsCreate (pathParams:ConversionTagsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ConversionTagsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ConversionTagsCreateArgs
          let result = ConversionTagsApiService.ConversionTagsCreate ctx serviceArgs
          return! (match result with
                      | ConversionTagsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ConversionTagsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ConversionTagsGet
    /// <summary>
    /// Get conversion tag
    /// </summary>

    let ConversionTagsGet (pathParams:ConversionTagsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : ConversionTagsGetArgs
          let result = ConversionTagsApiService.ConversionTagsGet ctx serviceArgs
          return! (match result with
                      | ConversionTagsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ConversionTagsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ConversionTagsList
    /// <summary>
    /// Get conversion tags
    /// </summary>

    let ConversionTagsList (pathParams:ConversionTagsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ConversionTagsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ConversionTagsListArgs
          let result = ConversionTagsApiService.ConversionTagsList ctx serviceArgs
          return! (match result with
                      | ConversionTagsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ConversionTagsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region OcpmEligibleConversionTagsGet
    /// <summary>
    /// Get Ocpm eligible conversion tags
    /// </summary>

    let OcpmEligibleConversionTagsGet (pathParams:OcpmEligibleConversionTagsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : OcpmEligibleConversionTagsGetArgs
          let result = ConversionTagsApiService.OcpmEligibleConversionTagsGet ctx serviceArgs
          return! (match result with
                      | OcpmEligibleConversionTagsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | OcpmEligibleConversionTagsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PageVisitConversionTagsGet
    /// <summary>
    /// Get page visit conversion tags
    /// </summary>

    let PageVisitConversionTagsGet (pathParams:PageVisitConversionTagsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PageVisitConversionTagsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : PageVisitConversionTagsGetArgs
          let result = ConversionTagsApiService.PageVisitConversionTagsGet ctx serviceArgs
          return! (match result with
                      | PageVisitConversionTagsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | PageVisitConversionTagsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

