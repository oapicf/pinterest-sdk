namespace OpenAPI

open AdAccountsApiHandlerParams
open AdAccountsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module AdAccountsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region AdAccountAnalytics
    /// <summary>
    /// Get ad account analytics
    /// </summary>
   [<FunctionName("AdAccountAnalytics")>]
    let AdAccountAnalytics
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/analytics")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.AdAccountAnalytics ()
      match result with
      | AdAccountAnalyticsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdAccountAnalyticsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AdAccountAnalyticsDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AdAccountTargetingAnalyticsGet
    /// <summary>
    /// Get targeting analytics for an ad account
    /// </summary>
   [<FunctionName("AdAccountTargetingAnalyticsGet")>]
    let AdAccountTargetingAnalyticsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/targeting_analytics")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.AdAccountTargetingAnalyticsGet ()
      match result with
      | AdAccountTargetingAnalyticsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdAccountTargetingAnalyticsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AdAccountsCreate
    /// <summary>
    /// Create ad account
    /// </summary>
   [<FunctionName("AdAccountsCreate")>]
    let AdAccountsCreate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/ad_accounts")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<AdAccountsCreateBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AdAccountsApiService.AdAccountsCreate bodyParams
      match result with
      | AdAccountsCreateStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdAccountsCreateDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AdAccountsGet
    /// <summary>
    /// Get ad account
    /// </summary>
   [<FunctionName("AdAccountsGet")>]
    let AdAccountsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.AdAccountsGet ()
      match result with
      | AdAccountsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdAccountsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AdAccountsList
    /// <summary>
    /// List ad accounts
    /// </summary>
   [<FunctionName("AdAccountsList")>]
    let AdAccountsList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.AdAccountsList ()
      match result with
      | AdAccountsListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdAccountsListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AnalyticsCreateMmmReport
    /// <summary>
    /// Create a request for a Marketing Mix Modeling (MMM) report
    /// </summary>
   [<FunctionName("AnalyticsCreateMmmReport")>]
    let AnalyticsCreateMmmReport
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/ad_accounts/{ad_account_id}/mmm_reports")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<AnalyticsCreateMmmReportBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AdAccountsApiService.AnalyticsCreateMmmReport bodyParams
      match result with
      | AnalyticsCreateMmmReportStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AnalyticsCreateMmmReportStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AnalyticsCreateMmmReportDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AnalyticsCreateReport
    /// <summary>
    /// Create async request for an account analytics report
    /// </summary>
   [<FunctionName("AnalyticsCreateReport")>]
    let AnalyticsCreateReport
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/ad_accounts/{ad_account_id}/reports")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<AnalyticsCreateReportBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = AdAccountsApiService.AnalyticsCreateReport bodyParams
      match result with
      | AnalyticsCreateReportStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AnalyticsCreateReportStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AnalyticsCreateReportDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AnalyticsCreateTemplateReport
    /// <summary>
    /// Create async request for an analytics report using a template
    /// </summary>
   [<FunctionName("AnalyticsCreateTemplateReport")>]
    let AnalyticsCreateTemplateReport
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/ad_accounts/{ad_account_id}/templates/{template_id}/reports")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.AnalyticsCreateTemplateReport ()
      match result with
      | AnalyticsCreateTemplateReportStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AnalyticsCreateTemplateReportStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AnalyticsCreateTemplateReportDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AnalyticsGetMmmReport
    /// <summary>
    /// Get advertiser Marketing Mix Modeling (MMM) report.
    /// </summary>
   [<FunctionName("AnalyticsGetMmmReport")>]
    let AnalyticsGetMmmReport
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/mmm_reports")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.AnalyticsGetMmmReport ()
      match result with
      | AnalyticsGetMmmReportStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AnalyticsGetMmmReportStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AnalyticsGetMmmReportDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AnalyticsGetReport
    /// <summary>
    /// Get the account analytics report created by the async call
    /// </summary>
   [<FunctionName("AnalyticsGetReport")>]
    let AnalyticsGetReport
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/reports")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.AnalyticsGetReport ()
      match result with
      | AnalyticsGetReportStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AnalyticsGetReportStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AnalyticsGetReportDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region SandboxDelete
    /// <summary>
    /// Delete ads data for ad account in API Sandbox
    /// </summary>
   [<FunctionName("SandboxDelete")>]
    let SandboxDelete
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v5/ad_accounts/{ad_account_id}/sandbox")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.SandboxDelete ()
      match result with
      | SandboxDeleteStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | SandboxDeleteStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | SandboxDeleteDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region TemplatesList
    /// <summary>
    /// List templates
    /// </summary>
   [<FunctionName("TemplatesList")>]
    let TemplatesList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/templates")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.TemplatesList ()
      match result with
      | TemplatesListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | TemplatesListStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | TemplatesListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

