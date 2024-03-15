namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open OrderLinesApiHandlerParams
open OrderLinesApiServiceInterface
open OrderLinesApiServiceImplementation
open OpenAPI.Model.Error
open OpenAPI.Model.OrderLine
open OpenAPI.Model.OrderLinesList200Response

module OrderLinesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region OrderLinesGet
    /// <summary>
    /// Get order line
    /// </summary>

    let OrderLinesGet (pathParams:OrderLinesGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : OrderLinesGetArgs
          let result = OrderLinesApiService.OrderLinesGet ctx serviceArgs
          return! (match result with
                      | OrderLinesGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | OrderLinesGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region OrderLinesList
    /// <summary>
    /// Get order lines
    /// </summary>

    let OrderLinesList (pathParams:OrderLinesListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<OrderLinesListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : OrderLinesListArgs
          let result = OrderLinesApiService.OrderLinesList ctx serviceArgs
          return! (match result with
                      | OrderLinesListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | OrderLinesListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

