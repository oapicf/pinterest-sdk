namespace OpenAPI

open AudienceInsightsApiHandlerParams
open AudienceInsightsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module AudienceInsightsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region AudienceInsightsGet
    /// <summary>
    /// Get audience insights
    /// </summary>
   [<FunctionName("AudienceInsightsGet")>]
    let AudienceInsightsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/audience_insights")>]
        req:HttpRequest ) =

      let result = AudienceInsightsApiService.AudienceInsightsGet ()
      match result with
      | AudienceInsightsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AudienceInsightsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AudienceInsightsScopeAndTypeGet
    /// <summary>
    /// Get audience insights scope and type
    /// </summary>
   [<FunctionName("AudienceInsightsScopeAndTypeGet")>]
    let AudienceInsightsScopeAndTypeGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/insights/audiences")>]
        req:HttpRequest ) =

      let result = AudienceInsightsApiService.AudienceInsightsScopeAndTypeGet ()
      match result with
      | AudienceInsightsScopeAndTypeGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AudienceInsightsScopeAndTypeGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

