namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PromotionsApiHandlerParams
open PromotionsApiServiceInterface
open PromotionsApiServiceImplementation
open OpenAPI.Model.Error
open OpenAPI.Model.PromotionCreateRequest
open OpenAPI.Model.PromotionResponse
open OpenAPI.Model.PromotionUpdateRequest
open OpenAPI.Model.PromotionsList200Response
open OpenAPI.Model.PromotionsResponse

module PromotionsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region PromotionsCreate
    /// <summary>
    /// Create promotions
    /// </summary>

    let PromotionsCreate (pathParams:PromotionsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<PromotionsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : PromotionsCreateArgs
          let result = PromotionsApiService.PromotionsCreate ctx serviceArgs
          return! (match result with
                      | PromotionsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | PromotionsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | PromotionsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PromotionsDelete
    /// <summary>
    /// Delete promotion by id
    /// </summary>

    let PromotionsDelete (pathParams:PromotionsDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PromotionsDeleteArgs
          let result = PromotionsApiService.PromotionsDelete ctx serviceArgs
          return! (match result with
                      | PromotionsDeleteStatusCode204 resolved ->
                            setStatusCode 204 >=> text resolved.content
                      | PromotionsDeleteDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PromotionsGet
    /// <summary>
    /// Get promotion by id
    /// </summary>

    let PromotionsGet (pathParams:PromotionsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : PromotionsGetArgs
          let result = PromotionsApiService.PromotionsGet ctx serviceArgs
          return! (match result with
                      | PromotionsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | PromotionsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | PromotionsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PromotionsList
    /// <summary>
    /// Get promotions
    /// </summary>

    let PromotionsList (pathParams:PromotionsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PromotionsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : PromotionsListArgs
          let result = PromotionsApiService.PromotionsList ctx serviceArgs
          return! (match result with
                      | PromotionsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | PromotionsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | PromotionsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PromotionsUpdate
    /// <summary>
    /// Update promotions
    /// </summary>

    let PromotionsUpdate (pathParams:PromotionsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<PromotionsUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : PromotionsUpdateArgs
          let result = PromotionsApiService.PromotionsUpdate ctx serviceArgs
          return! (match result with
                      | PromotionsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | PromotionsUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | PromotionsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

