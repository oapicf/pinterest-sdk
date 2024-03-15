namespace OpenAPI

open UserAccountApiHandlerParams
open UserAccountApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module UserAccountApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region BoardsUserFollowsList
    /// <summary>
    /// List following boards
    /// </summary>
   [<FunctionName("BoardsUserFollowsList")>]
    let BoardsUserFollowsList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/user_account/following/boards")>]
        req:HttpRequest ) =

      let result = UserAccountApiService.BoardsUserFollowsList ()
      match result with
      | BoardsUserFollowsListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | BoardsUserFollowsListStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | BoardsUserFollowsListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region FollowUserUpdate
    /// <summary>
    /// Follow user
    /// </summary>
   [<FunctionName("FollowUserUpdate")>]
    let FollowUserUpdate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/user_account/following/{username}")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<FollowUserUpdateBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = UserAccountApiService.FollowUserUpdate bodyParams
      match result with
      | FollowUserUpdateStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | FollowUserUpdateStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | FollowUserUpdateDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region FollowersList
    /// <summary>
    /// List followers
    /// </summary>
   [<FunctionName("FollowersList")>]
    let FollowersList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/user_account/followers")>]
        req:HttpRequest ) =

      let result = UserAccountApiService.FollowersList ()
      match result with
      | FollowersListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | FollowersListStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | FollowersListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region LinkedBusinessAccountsGet
    /// <summary>
    /// List linked businesses
    /// </summary>
   [<FunctionName("LinkedBusinessAccountsGet")>]
    let LinkedBusinessAccountsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/user_account/businesses")>]
        req:HttpRequest ) =

      let result = UserAccountApiService.LinkedBusinessAccountsGet ()
      match result with
      | LinkedBusinessAccountsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | LinkedBusinessAccountsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region UnverifyWebsiteDelete
    /// <summary>
    /// Unverify website
    /// </summary>
   [<FunctionName("UnverifyWebsiteDelete")>]
    let UnverifyWebsiteDelete
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v5/user_account/websites")>]
        req:HttpRequest ) =

      let result = UserAccountApiService.UnverifyWebsiteDelete ()
      match result with
      | UnverifyWebsiteDeleteStatusCode204 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(204))
      | UnverifyWebsiteDeleteStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | UnverifyWebsiteDeleteDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region UserAccountAnalytics
    /// <summary>
    /// Get user account analytics
    /// </summary>
   [<FunctionName("UserAccountAnalytics")>]
    let UserAccountAnalytics
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/user_account/analytics")>]
        req:HttpRequest ) =

      let result = UserAccountApiService.UserAccountAnalytics ()
      match result with
      | UserAccountAnalyticsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | UserAccountAnalyticsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | UserAccountAnalyticsStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | UserAccountAnalyticsDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region UserAccountAnalyticsTopPins
    /// <summary>
    /// Get user account top pins analytics
    /// </summary>
   [<FunctionName("UserAccountAnalyticsTopPins")>]
    let UserAccountAnalyticsTopPins
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/user_account/analytics/top_pins")>]
        req:HttpRequest ) =

      let result = UserAccountApiService.UserAccountAnalyticsTopPins ()
      match result with
      | UserAccountAnalyticsTopPinsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | UserAccountAnalyticsTopPinsStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | UserAccountAnalyticsTopPinsDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region UserAccountAnalyticsTopVideoPins
    /// <summary>
    /// Get user account top video pins analytics
    /// </summary>
   [<FunctionName("UserAccountAnalyticsTopVideoPins")>]
    let UserAccountAnalyticsTopVideoPins
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/user_account/analytics/top_video_pins")>]
        req:HttpRequest ) =

      let result = UserAccountApiService.UserAccountAnalyticsTopVideoPins ()
      match result with
      | UserAccountAnalyticsTopVideoPinsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | UserAccountAnalyticsTopVideoPinsStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | UserAccountAnalyticsTopVideoPinsDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region UserAccountFollowedInterests
    /// <summary>
    /// List following interests
    /// </summary>
   [<FunctionName("UserAccountFollowedInterests")>]
    let UserAccountFollowedInterests
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/users/{username}/interests/follow")>]
        req:HttpRequest ) =

      let result = UserAccountApiService.UserAccountFollowedInterests ()
      match result with
      | UserAccountFollowedInterestsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | UserAccountFollowedInterestsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | UserAccountFollowedInterestsStatusCode401 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(401))
      | UserAccountFollowedInterestsStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | UserAccountFollowedInterestsDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region UserAccountGet
    /// <summary>
    /// Get user account
    /// </summary>
   [<FunctionName("UserAccountGet")>]
    let UserAccountGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/user_account")>]
        req:HttpRequest ) =

      let result = UserAccountApiService.UserAccountGet ()
      match result with
      | UserAccountGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | UserAccountGetStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | UserAccountGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region UserFollowingGet
    /// <summary>
    /// List following
    /// </summary>
   [<FunctionName("UserFollowingGet")>]
    let UserFollowingGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/user_account/following")>]
        req:HttpRequest ) =

      let result = UserAccountApiService.UserFollowingGet ()
      match result with
      | UserFollowingGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | UserFollowingGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region UserWebsitesGet
    /// <summary>
    /// Get user websites
    /// </summary>
   [<FunctionName("UserWebsitesGet")>]
    let UserWebsitesGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/user_account/websites")>]
        req:HttpRequest ) =

      let result = UserAccountApiService.UserWebsitesGet ()
      match result with
      | UserWebsitesGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | UserWebsitesGetStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | UserWebsitesGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region VerifyWebsiteUpdate
    /// <summary>
    /// Verify website
    /// </summary>
   [<FunctionName("VerifyWebsiteUpdate")>]
    let VerifyWebsiteUpdate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/user_account/websites")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<VerifyWebsiteUpdateBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = UserAccountApiService.VerifyWebsiteUpdate bodyParams
      match result with
      | VerifyWebsiteUpdateStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | VerifyWebsiteUpdateDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region WebsiteVerificationGet
    /// <summary>
    /// Get user verification code for website claiming
    /// </summary>
   [<FunctionName("WebsiteVerificationGet")>]
    let WebsiteVerificationGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/user_account/websites/verification")>]
        req:HttpRequest ) =

      let result = UserAccountApiService.WebsiteVerificationGet ()
      match result with
      | WebsiteVerificationGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | WebsiteVerificationGetStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | WebsiteVerificationGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

