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

