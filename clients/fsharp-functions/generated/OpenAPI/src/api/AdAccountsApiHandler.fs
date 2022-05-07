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
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdAccountAnalyticsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AdAccountAnalyticsDefaultStatusCode resolved ->
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

    //#region AdGroupsAnalytics
    /// <summary>
    /// Get ad group analytics
    /// </summary>
   [<FunctionName("AdGroupsAnalytics")>]
    let AdGroupsAnalytics
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/ad_groups/analytics")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.AdGroupsAnalytics ()
      match result with
      | AdGroupsAnalyticsStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdGroupsAnalyticsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AdGroupsAnalyticsDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AdGroupsList
    /// <summary>
    /// List ad groups
    /// </summary>
   [<FunctionName("AdGroupsList")>]
    let AdGroupsList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/ad_groups")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.AdGroupsList ()
      match result with
      | AdGroupsListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdGroupsListStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AdGroupsListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AdsAnalytics
    /// <summary>
    /// Get ad analytics
    /// </summary>
   [<FunctionName("AdsAnalytics")>]
    let AdsAnalytics
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/ads/analytics")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.AdsAnalytics ()
      match result with
      | AdsAnalyticsStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdsAnalyticsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AdsAnalyticsDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AdsList
    /// <summary>
    /// List ads
    /// </summary>
   [<FunctionName("AdsList")>]
    let AdsList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/ads")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.AdsList ()
      match result with
      | AdsListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdsListStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AdsListDefaultStatusCode resolved ->
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

    //#region CampaignsAnalytics
    /// <summary>
    /// Get campaign analytics
    /// </summary>
   [<FunctionName("CampaignsAnalytics")>]
    let CampaignsAnalytics
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/campaigns/analytics")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.CampaignsAnalytics ()
      match result with
      | CampaignsAnalyticsStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | CampaignsAnalyticsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | CampaignsAnalyticsDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region CampaignsList
    /// <summary>
    /// List campaigns
    /// </summary>
   [<FunctionName("CampaignsList")>]
    let CampaignsList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/campaigns")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.CampaignsList ()
      match result with
      | CampaignsListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | CampaignsListStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | CampaignsListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region ProductGroupsAnalytics
    /// <summary>
    /// Get product group analytics
    /// </summary>
   [<FunctionName("ProductGroupsAnalytics")>]
    let ProductGroupsAnalytics
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/product_groups/analytics")>]
        req:HttpRequest ) =

      let result = AdAccountsApiService.ProductGroupsAnalytics ()
      match result with
      | ProductGroupsAnalyticsStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | ProductGroupsAnalyticsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | ProductGroupsAnalyticsDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

