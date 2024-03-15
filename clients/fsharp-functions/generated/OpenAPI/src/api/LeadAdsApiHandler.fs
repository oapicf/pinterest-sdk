namespace OpenAPI

open LeadAdsApiHandlerParams
open LeadAdsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module LeadAdsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region AdAccountsSubscriptionsDelById
    /// <summary>
    /// Delete lead ads subscription
    /// </summary>
   [<FunctionName("AdAccountsSubscriptionsDelById")>]
    let AdAccountsSubscriptionsDelById
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}")>]
        req:HttpRequest ) =

      let result = LeadAdsApiService.AdAccountsSubscriptionsDelById ()
      match result with
      | AdAccountsSubscriptionsDelByIdStatusCode204 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(204))
      | AdAccountsSubscriptionsDelByIdStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AdAccountsSubscriptionsDelByIdStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | AdAccountsSubscriptionsDelByIdStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | AdAccountsSubscriptionsDelByIdDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AdAccountsSubscriptionsGetById
    /// <summary>
    /// Get lead ads subscription
    /// </summary>
   [<FunctionName("AdAccountsSubscriptionsGetById")>]
    let AdAccountsSubscriptionsGetById
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}")>]
        req:HttpRequest ) =

      let result = LeadAdsApiService.AdAccountsSubscriptionsGetById ()
      match result with
      | AdAccountsSubscriptionsGetByIdStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdAccountsSubscriptionsGetByIdStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AdAccountsSubscriptionsGetByIdStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | AdAccountsSubscriptionsGetByIdStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | AdAccountsSubscriptionsGetByIdDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AdAccountsSubscriptionsGetList
    /// <summary>
    /// Get lead ads subscriptions
    /// </summary>
   [<FunctionName("AdAccountsSubscriptionsGetList")>]
    let AdAccountsSubscriptionsGetList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions")>]
        req:HttpRequest ) =

      let result = LeadAdsApiService.AdAccountsSubscriptionsGetList ()
      match result with
      | AdAccountsSubscriptionsGetListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdAccountsSubscriptionsGetListStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | AdAccountsSubscriptionsGetListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AdAccountsSubscriptionsPost
    /// <summary>
    /// Create lead ads subscription
    /// </summary>
   [<FunctionName("AdAccountsSubscriptionsPost")>]
    let AdAccountsSubscriptionsPost
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/ad_accounts/{ad_account_id}/leads/subscriptions")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<AdAccountsSubscriptionsPostBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = LeadAdsApiService.AdAccountsSubscriptionsPost bodyParams
      match result with
      | AdAccountsSubscriptionsPostStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdAccountsSubscriptionsPostStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AdAccountsSubscriptionsPostStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | AdAccountsSubscriptionsPostDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

