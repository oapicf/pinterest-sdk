namespace OpenAPI

open BillingApiHandlerParams
open BillingApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module BillingApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region AdsCreditRedeem
    /// <summary>
    /// Redeem ad credits
    /// </summary>
   [<FunctionName("AdsCreditRedeem")>]
    let AdsCreditRedeem
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/ad_accounts/{ad_account_id}/ads_credit/redeem")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<AdsCreditRedeemBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BillingApiService.AdsCreditRedeem bodyParams
      match result with
      | AdsCreditRedeemStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdsCreditRedeemStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AdsCreditRedeemDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region AdsCreditsDiscountsGet
    /// <summary>
    /// Get ads credit discounts
    /// </summary>
   [<FunctionName("AdsCreditsDiscountsGet")>]
    let AdsCreditsDiscountsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/ads_credit/discounts")>]
        req:HttpRequest ) =

      let result = BillingApiService.AdsCreditsDiscountsGet ()
      match result with
      | AdsCreditsDiscountsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdsCreditsDiscountsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region BillingProfilesGet
    /// <summary>
    /// Get billing profiles
    /// </summary>
   [<FunctionName("BillingProfilesGet")>]
    let BillingProfilesGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/billing_profiles")>]
        req:HttpRequest ) =

      let result = BillingApiService.BillingProfilesGet ()
      match result with
      | BillingProfilesGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | BillingProfilesGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region SsioAccountsGet
    /// <summary>
    /// Get Salesforce account details including bill-to information.
    /// </summary>
   [<FunctionName("SsioAccountsGet")>]
    let SsioAccountsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/ssio/accounts")>]
        req:HttpRequest ) =

      let result = BillingApiService.SsioAccountsGet ()
      match result with
      | SsioAccountsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | SsioAccountsGetStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | SsioAccountsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region SsioInsertionOrderCreate
    /// <summary>
    /// Create insertion order through SSIO.
    /// </summary>
   [<FunctionName("SsioInsertionOrderCreate")>]
    let SsioInsertionOrderCreate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<SsioInsertionOrderCreateBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BillingApiService.SsioInsertionOrderCreate bodyParams
      match result with
      | SsioInsertionOrderCreateStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | SsioInsertionOrderCreateStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | SsioInsertionOrderCreateDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region SsioInsertionOrderEdit
    /// <summary>
    /// Edit insertion order through SSIO.
    /// </summary>
   [<FunctionName("SsioInsertionOrderEdit")>]
    let SsioInsertionOrderEdit
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<SsioInsertionOrderEditBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = BillingApiService.SsioInsertionOrderEdit bodyParams
      match result with
      | SsioInsertionOrderEditStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | SsioInsertionOrderEditStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | SsioInsertionOrderEditDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region SsioInsertionOrdersStatusGetByAdAccount
    /// <summary>
    /// Get insertion order status by ad account id.
    /// </summary>
   [<FunctionName("SsioInsertionOrdersStatusGetByAdAccount")>]
    let SsioInsertionOrdersStatusGetByAdAccount
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/status")>]
        req:HttpRequest ) =

      let result = BillingApiService.SsioInsertionOrdersStatusGetByAdAccount ()
      match result with
      | SsioInsertionOrdersStatusGetByAdAccountStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | SsioInsertionOrdersStatusGetByAdAccountStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | SsioInsertionOrdersStatusGetByAdAccountDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region SsioInsertionOrdersStatusGetByPinOrderId
    /// <summary>
    /// Get insertion order status by pin order id.
    /// </summary>
   [<FunctionName("SsioInsertionOrdersStatusGetByPinOrderId")>]
    let SsioInsertionOrdersStatusGetByPinOrderId
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status")>]
        req:HttpRequest ) =

      let result = BillingApiService.SsioInsertionOrdersStatusGetByPinOrderId ()
      match result with
      | SsioInsertionOrdersStatusGetByPinOrderIdStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | SsioInsertionOrdersStatusGetByPinOrderIdStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | SsioInsertionOrdersStatusGetByPinOrderIdDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region SsioOrderLinesGetByAdAccount
    /// <summary>
    /// Get Salesforce order lines by ad account id.
    /// </summary>
   [<FunctionName("SsioOrderLinesGetByAdAccount")>]
    let SsioOrderLinesGetByAdAccount
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/ssio/order_lines")>]
        req:HttpRequest ) =

      let result = BillingApiService.SsioOrderLinesGetByAdAccount ()
      match result with
      | SsioOrderLinesGetByAdAccountStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | SsioOrderLinesGetByAdAccountStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | SsioOrderLinesGetByAdAccountDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

