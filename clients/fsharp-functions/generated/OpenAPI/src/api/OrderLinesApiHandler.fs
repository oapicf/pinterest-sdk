namespace OpenAPI

open OrderLinesApiHandlerParams
open OrderLinesApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module OrderLinesApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region OrderLinesGet
    /// <summary>
    /// Get order line
    /// </summary>
   [<FunctionName("OrderLinesGet")>]
    let OrderLinesGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/order_lines/{order_line_id}")>]
        req:HttpRequest ) =

      let result = OrderLinesApiService.OrderLinesGet ()
      match result with
      | OrderLinesGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | OrderLinesGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region OrderLinesList
    /// <summary>
    /// Get order lines
    /// </summary>
   [<FunctionName("OrderLinesList")>]
    let OrderLinesList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/order_lines")>]
        req:HttpRequest ) =

      let result = OrderLinesApiService.OrderLinesList ()
      match result with
      | OrderLinesListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | OrderLinesListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

