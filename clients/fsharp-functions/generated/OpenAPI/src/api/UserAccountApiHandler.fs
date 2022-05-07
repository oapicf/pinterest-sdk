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
      | UserAccountAnalyticsStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | UserAccountAnalyticsDefaultStatusCode resolved ->
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

