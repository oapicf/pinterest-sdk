namespace OpenAPI

open SearchApiHandlerParams
open SearchApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module SearchApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region SearchPartnerPins
    /// <summary>
    /// Search pins by a given search term
    /// </summary>
   [<FunctionName("SearchPartnerPins")>]
    let SearchPartnerPins
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/search/partner/pins")>]
        req:HttpRequest ) =

      let result = SearchApiService.SearchPartnerPins ()
      match result with
      | SearchPartnerPinsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | SearchPartnerPinsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | SearchPartnerPinsDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region SearchUserBoardsGet
    /// <summary>
    /// Search user&#39;s boards
    /// </summary>
   [<FunctionName("SearchUserBoardsGet")>]
    let SearchUserBoardsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/search/boards")>]
        req:HttpRequest ) =

      let result = SearchApiService.SearchUserBoardsGet ()
      match result with
      | SearchUserBoardsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | SearchUserBoardsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region SearchUserPinsList
    /// <summary>
    /// Search user&#39;s Pins
    /// </summary>
   [<FunctionName("SearchUserPinsList")>]
    let SearchUserPinsList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/search/pins")>]
        req:HttpRequest ) =

      let result = SearchApiService.SearchUserPinsList ()
      match result with
      | SearchUserPinsListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | SearchUserPinsListStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | SearchUserPinsListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

