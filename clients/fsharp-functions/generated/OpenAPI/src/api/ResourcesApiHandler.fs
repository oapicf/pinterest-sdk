namespace OpenAPI

open ResourcesApiHandlerParams
open ResourcesApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ResourcesApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region AdAccountCountriesGet
    /// <summary>
    /// Get ad accounts countries
    /// </summary>
   [<FunctionName("AdAccountCountriesGet")>]
    let AdAccountCountriesGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/resources/ad_account_countries")>]
        req:HttpRequest ) =

      let result = ResourcesApiService.AdAccountCountriesGet ()
      match result with
      | AdAccountCountriesGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdAccountCountriesGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region DeliveryMetricsGet
    /// <summary>
    /// Get available metrics&#39; definitions
    /// </summary>
   [<FunctionName("DeliveryMetricsGet")>]
    let DeliveryMetricsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/resources/delivery_metrics")>]
        req:HttpRequest ) =

      let result = ResourcesApiService.DeliveryMetricsGet ()
      match result with
      | DeliveryMetricsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | DeliveryMetricsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region InterestTargetingOptionsGet
    /// <summary>
    /// Get interest details
    /// </summary>
   [<FunctionName("InterestTargetingOptionsGet")>]
    let InterestTargetingOptionsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/resources/targeting/interests/{interest_id}")>]
        req:HttpRequest ) =

      let result = ResourcesApiService.InterestTargetingOptionsGet ()
      match result with
      | InterestTargetingOptionsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | InterestTargetingOptionsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region LeadFormQuestionsGet
    /// <summary>
    /// Get lead form questions
    /// </summary>
   [<FunctionName("LeadFormQuestionsGet")>]
    let LeadFormQuestionsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/resources/lead_form_questions")>]
        req:HttpRequest ) =

      let result = ResourcesApiService.LeadFormQuestionsGet ()
      match result with
      | LeadFormQuestionsGetStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | LeadFormQuestionsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region MetricsReadyStateGet
    /// <summary>
    /// Get metrics ready state
    /// </summary>
   [<FunctionName("MetricsReadyStateGet")>]
    let MetricsReadyStateGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/resources/metrics_ready_state")>]
        req:HttpRequest ) =

      let result = ResourcesApiService.MetricsReadyStateGet ()
      match result with
      | MetricsReadyStateGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | MetricsReadyStateGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region TargetingOptionsGet
    /// <summary>
    /// Get targeting options
    /// </summary>
   [<FunctionName("TargetingOptionsGet")>]
    let TargetingOptionsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/resources/targeting/{targeting_type}")>]
        req:HttpRequest ) =

      let result = ResourcesApiService.TargetingOptionsGet ()
      match result with
      | TargetingOptionsGetStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | TargetingOptionsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

