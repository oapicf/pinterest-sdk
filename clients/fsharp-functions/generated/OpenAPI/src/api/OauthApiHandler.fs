namespace OpenAPI

open OauthApiHandlerParams
open OauthApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module OauthApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region OauthConversionToken
    /// <summary>
    /// Generate OAuth access token for conversion API
    /// </summary>
   [<FunctionName("OauthConversionToken")>]
    let OauthConversionToken
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/oauth/conversion_token")>]
        req:HttpRequest ) =

      let result = OauthApiService.OauthConversionToken ()
      match result with
      | OauthConversionTokenStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | OauthConversionTokenDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region OauthToken
    /// <summary>
    /// Generate OAuth access token
    /// </summary>
   [<FunctionName("OauthToken")>]
    let OauthToken
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/oauth/token")>]
        req:HttpRequest ) =

      let result = OauthApiService.OauthToken ()
      match result with
      | OauthTokenStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | OauthTokenDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region TokenRevoke
    /// <summary>
    /// Revoke a token
    /// </summary>
   [<FunctionName("TokenRevoke")>]
    let TokenRevoke
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/oauth/token/revoke")>]
        req:HttpRequest ) =

      let result = OauthApiService.TokenRevoke ()
      match result with
      | TokenRevokeStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | TokenRevokeStatusCode401 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(401))
      | TokenRevokeStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | TokenRevokeDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

