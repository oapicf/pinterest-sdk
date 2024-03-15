namespace OpenAPI

open TermsApiHandlerParams
open TermsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module TermsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region TermsRelatedList
    /// <summary>
    /// List related terms
    /// </summary>
   [<FunctionName("TermsRelatedList")>]
    let TermsRelatedList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/terms/related")>]
        req:HttpRequest ) =

      let result = TermsApiService.TermsRelatedList ()
      match result with
      | TermsRelatedListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | TermsRelatedListStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | TermsRelatedListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region TermsSuggestedList
    /// <summary>
    /// List suggested terms
    /// </summary>
   [<FunctionName("TermsSuggestedList")>]
    let TermsSuggestedList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/terms/suggested")>]
        req:HttpRequest ) =

      let result = TermsApiService.TermsSuggestedList ()
      match result with
      | TermsSuggestedListStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | TermsSuggestedListStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | TermsSuggestedListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

