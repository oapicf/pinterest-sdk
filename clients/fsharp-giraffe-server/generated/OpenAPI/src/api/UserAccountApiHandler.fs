namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open UserAccountApiHandlerParams
open UserAccountApiServiceInterface
open UserAccountApiServiceImplementation
open OpenAPI.Model.Account
open OpenAPI.Model.AnalyticsMetricsResponse
open OpenAPI.Model.BoardsUserFollowsList200Response
open OpenAPI.Model.Error
open OpenAPI.Model.FollowUserRequest
open OpenAPI.Model.FollowersList200Response
open System.Collections.Generic
open OpenAPI.Model.LinkedBusiness
open OpenAPI.Model.TopPinsAnalyticsResponse
open OpenAPI.Model.TopVideoPinsAnalyticsResponse
open OpenAPI.Model.UserAccountFollowedInterests200Response
open OpenAPI.Model.UserFollowingFeedType
open OpenAPI.Model.UserFollowingGet200Response
open OpenAPI.Model.UserSummary
open OpenAPI.Model.UserWebsiteSummary
open OpenAPI.Model.UserWebsiteVerificationCode
open OpenAPI.Model.UserWebsiteVerifyRequest
open OpenAPI.Model.UserWebsitesGet200Response

module UserAccountApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region BoardsUserFollowsList
    /// <summary>
    /// List following boards
    /// </summary>

    let BoardsUserFollowsList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BoardsUserFollowsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : BoardsUserFollowsListArgs
          let result = UserAccountApiService.BoardsUserFollowsList ctx serviceArgs
          return! (match result with
                      | BoardsUserFollowsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BoardsUserFollowsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BoardsUserFollowsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region FollowUserUpdate
    /// <summary>
    /// Follow user
    /// </summary>

    let FollowUserUpdate (pathParams:FollowUserUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<FollowUserUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : FollowUserUpdateArgs
          let result = UserAccountApiService.FollowUserUpdate ctx serviceArgs
          return! (match result with
                      | FollowUserUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | FollowUserUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | FollowUserUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region FollowersList
    /// <summary>
    /// List followers
    /// </summary>

    let FollowersList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<FollowersListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : FollowersListArgs
          let result = UserAccountApiService.FollowersList ctx serviceArgs
          return! (match result with
                      | FollowersListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | FollowersListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | FollowersListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region LinkedBusinessAccountsGet
    /// <summary>
    /// List linked businesses
    /// </summary>

    let LinkedBusinessAccountsGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = UserAccountApiService.LinkedBusinessAccountsGet ctx 
          return! (match result with
                      | LinkedBusinessAccountsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | LinkedBusinessAccountsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UnverifyWebsiteDelete
    /// <summary>
    /// Unverify website
    /// </summary>

    let UnverifyWebsiteDelete  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UnverifyWebsiteDeleteQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UnverifyWebsiteDeleteArgs
          let result = UserAccountApiService.UnverifyWebsiteDelete ctx serviceArgs
          return! (match result with
                      | UnverifyWebsiteDeleteStatusCode204 resolved ->
                            setStatusCode 204 >=> text resolved.content
                      | UnverifyWebsiteDeleteStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UnverifyWebsiteDeleteDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UserAccountAnalytics
    /// <summary>
    /// Get user account analytics
    /// </summary>

    let UserAccountAnalytics  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UserAccountAnalyticsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UserAccountAnalyticsArgs
          let result = UserAccountApiService.UserAccountAnalytics ctx serviceArgs
          return! (match result with
                      | UserAccountAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UserAccountAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UserAccountAnalyticsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UserAccountAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UserAccountAnalyticsTopPins
    /// <summary>
    /// Get user account top pins analytics
    /// </summary>

    let UserAccountAnalyticsTopPins  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UserAccountAnalyticsTopPinsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UserAccountAnalyticsTopPinsArgs
          let result = UserAccountApiService.UserAccountAnalyticsTopPins ctx serviceArgs
          return! (match result with
                      | UserAccountAnalyticsTopPinsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UserAccountAnalyticsTopPinsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UserAccountAnalyticsTopPinsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UserAccountAnalyticsTopVideoPins
    /// <summary>
    /// Get user account top video pins analytics
    /// </summary>

    let UserAccountAnalyticsTopVideoPins  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UserAccountAnalyticsTopVideoPinsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UserAccountAnalyticsTopVideoPinsArgs
          let result = UserAccountApiService.UserAccountAnalyticsTopVideoPins ctx serviceArgs
          return! (match result with
                      | UserAccountAnalyticsTopVideoPinsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UserAccountAnalyticsTopVideoPinsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UserAccountAnalyticsTopVideoPinsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UserAccountFollowedInterests
    /// <summary>
    /// List following interests
    /// </summary>

    let UserAccountFollowedInterests (pathParams:UserAccountFollowedInterestsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UserAccountFollowedInterestsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : UserAccountFollowedInterestsArgs
          let result = UserAccountApiService.UserAccountFollowedInterests ctx serviceArgs
          return! (match result with
                      | UserAccountFollowedInterestsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UserAccountFollowedInterestsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UserAccountFollowedInterestsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UserAccountFollowedInterestsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UserAccountFollowedInterestsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UserAccountGet
    /// <summary>
    /// Get user account
    /// </summary>

    let UserAccountGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UserAccountGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UserAccountGetArgs
          let result = UserAccountApiService.UserAccountGet ctx serviceArgs
          return! (match result with
                      | UserAccountGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UserAccountGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UserAccountGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UserFollowingGet
    /// <summary>
    /// List following
    /// </summary>

    let UserFollowingGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UserFollowingGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UserFollowingGetArgs
          let result = UserAccountApiService.UserFollowingGet ctx serviceArgs
          return! (match result with
                      | UserFollowingGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UserFollowingGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UserWebsitesGet
    /// <summary>
    /// Get user websites
    /// </summary>

    let UserWebsitesGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UserWebsitesGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UserWebsitesGetArgs
          let result = UserAccountApiService.UserWebsitesGet ctx serviceArgs
          return! (match result with
                      | UserWebsitesGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UserWebsitesGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UserWebsitesGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region VerifyWebsiteUpdate
    /// <summary>
    /// Verify website
    /// </summary>

    let VerifyWebsiteUpdate  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<VerifyWebsiteUpdateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<VerifyWebsiteUpdateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : VerifyWebsiteUpdateArgs
          let result = UserAccountApiService.VerifyWebsiteUpdate ctx serviceArgs
          return! (match result with
                      | VerifyWebsiteUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | VerifyWebsiteUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region WebsiteVerificationGet
    /// <summary>
    /// Get user verification code for website claiming
    /// </summary>

    let WebsiteVerificationGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<WebsiteVerificationGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : WebsiteVerificationGetArgs
          let result = UserAccountApiService.WebsiteVerificationGet ctx serviceArgs
          return! (match result with
                      | WebsiteVerificationGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | WebsiteVerificationGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | WebsiteVerificationGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

