namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open AdvancedAuctionApiHandlerParams
open AdvancedAuctionApiServiceInterface
open AdvancedAuctionApiServiceImplementation
open OpenAPI.Model.AdvancedAuctionItems
open OpenAPI.Model.AdvancedAuctionItemsGetRequest
open OpenAPI.Model.AdvancedAuctionItemsSubmitRequest
open OpenAPI.Model.AdvancedAuctionProcessedItems
open OpenAPI.Model.Error

module AdvancedAuctionApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AdvancedAuctionItemsGetPost
    /// <summary>
    /// Get item bid options (POST)
    /// </summary>

    let AdvancedAuctionItemsGetPost  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdvancedAuctionItemsGetPostQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<AdvancedAuctionItemsGetPostBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : AdvancedAuctionItemsGetPostArgs
          let result = AdvancedAuctionApiService.AdvancedAuctionItemsGetPost ctx serviceArgs
          return! (match result with
                      | AdvancedAuctionItemsGetPostStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdvancedAuctionItemsGetPostStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdvancedAuctionItemsGetPostStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdvancedAuctionItemsGetPostStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdvancedAuctionItemsGetPostStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
                      | AdvancedAuctionItemsGetPostDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdvancedAuctionItemsSubmitPost
    /// <summary>
    /// Operate on item level bid options
    /// </summary>

    let AdvancedAuctionItemsSubmitPost  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdvancedAuctionItemsSubmitPostQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<AdvancedAuctionItemsSubmitPostBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : AdvancedAuctionItemsSubmitPostArgs
          let result = AdvancedAuctionApiService.AdvancedAuctionItemsSubmitPost ctx serviceArgs
          return! (match result with
                      | AdvancedAuctionItemsSubmitPostStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdvancedAuctionItemsSubmitPostStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdvancedAuctionItemsSubmitPostStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdvancedAuctionItemsSubmitPostStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdvancedAuctionItemsSubmitPostStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
                      | AdvancedAuctionItemsSubmitPostDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

