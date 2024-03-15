namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open LeadAdsApiHandlerParams
open LeadAdsApiServiceInterface
open LeadAdsApiServiceImplementation
open OpenAPI.Model.AdAccountCreateSubscriptionRequest
open OpenAPI.Model.AdAccountCreateSubscriptionResponse
open OpenAPI.Model.AdAccountGetSubscriptionResponse
open OpenAPI.Model.AdAccountsSubscriptionsGetList200Response
open OpenAPI.Model.Error

module LeadAdsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AdAccountsSubscriptionsDelById
    /// <summary>
    /// Delete lead ads subscription
    /// </summary>

    let AdAccountsSubscriptionsDelById (pathParams:AdAccountsSubscriptionsDelByIdPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AdAccountsSubscriptionsDelByIdArgs
          let result = LeadAdsApiService.AdAccountsSubscriptionsDelById ctx serviceArgs
          return! (match result with
                      | AdAccountsSubscriptionsDelByIdStatusCode204 resolved ->
                            setStatusCode 204 >=> text resolved.content
                      | AdAccountsSubscriptionsDelByIdStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdAccountsSubscriptionsDelByIdStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdAccountsSubscriptionsDelByIdStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdAccountsSubscriptionsDelByIdDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdAccountsSubscriptionsGetById
    /// <summary>
    /// Get lead ads subscription
    /// </summary>

    let AdAccountsSubscriptionsGetById (pathParams:AdAccountsSubscriptionsGetByIdPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AdAccountsSubscriptionsGetByIdArgs
          let result = LeadAdsApiService.AdAccountsSubscriptionsGetById ctx serviceArgs
          return! (match result with
                      | AdAccountsSubscriptionsGetByIdStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdAccountsSubscriptionsGetByIdStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdAccountsSubscriptionsGetByIdStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdAccountsSubscriptionsGetByIdStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdAccountsSubscriptionsGetByIdDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdAccountsSubscriptionsGetList
    /// <summary>
    /// Get lead ads subscriptions
    /// </summary>

    let AdAccountsSubscriptionsGetList (pathParams:AdAccountsSubscriptionsGetListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdAccountsSubscriptionsGetListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdAccountsSubscriptionsGetListArgs
          let result = LeadAdsApiService.AdAccountsSubscriptionsGetList ctx serviceArgs
          return! (match result with
                      | AdAccountsSubscriptionsGetListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdAccountsSubscriptionsGetListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdAccountsSubscriptionsGetListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdAccountsSubscriptionsPost
    /// <summary>
    /// Create lead ads subscription
    /// </summary>

    let AdAccountsSubscriptionsPost (pathParams:AdAccountsSubscriptionsPostPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdAccountsSubscriptionsPostBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdAccountsSubscriptionsPostArgs
          let result = LeadAdsApiService.AdAccountsSubscriptionsPost ctx serviceArgs
          return! (match result with
                      | AdAccountsSubscriptionsPostStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdAccountsSubscriptionsPostStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdAccountsSubscriptionsPostStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdAccountsSubscriptionsPostDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

