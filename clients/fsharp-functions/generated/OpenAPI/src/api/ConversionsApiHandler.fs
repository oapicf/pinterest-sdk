namespace OpenAPI

open ConversionsApiHandlerParams
open ConversionsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ConversionsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region AdvertiserDefinedEventsGet
    /// <summary>
    /// Get advertiser defined events
    /// </summary>
   [<FunctionName("AdvertiserDefinedEventsGet")>]
    let AdvertiserDefinedEventsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/advertiser_defined_events")>]
        req:HttpRequest ) =

      let result = ConversionsApiService.AdvertiserDefinedEventsGet ()
      match result with
      | AdvertiserDefinedEventsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdvertiserDefinedEventsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

