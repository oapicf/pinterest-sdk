namespace OpenAPI

open ProductGroupPromotionsApiHandlerParams
open ProductGroupPromotionsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ProductGroupPromotionsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ProductGroupPromotionsCreate
    /// <summary>
    /// Create product group promotions
    /// </summary>
   [<FunctionName("ProductGroupPromotionsCreate")>]
    let ProductGroupPromotionsCreate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/ad_accounts/{ad_account_id}/product_group_promotions")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<ProductGroupPromotionsCreateBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = ProductGroupPromotionsApiService.ProductGroupPromotionsCreate bodyParams
      match result with
      | ProductGroupPromotionsCreateStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | ProductGroupPromotionsCreateDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region ProductGroupPromotionsGet
    /// <summary>
    /// Get a product group promotion by id
    /// </summary>
   [<FunctionName("ProductGroupPromotionsGet")>]
    let ProductGroupPromotionsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}")>]
        req:HttpRequest ) =

      let result = ProductGroupPromotionsApiService.ProductGroupPromotionsGet ()
      match result with
      | ProductGroupPromotionsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | ProductGroupPromotionsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region ProductGroupPromotionsList
    /// <summary>
    /// Get product group promotions
    /// </summary>
   [<FunctionName("ProductGroupPromotionsList")>]
    let ProductGroupPromotionsList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/product_group_promotions")>]
        req:HttpRequest ) =

      let result = ProductGroupPromotionsApiService.ProductGroupPromotionsList ()
      match result with
      | ProductGroupPromotionsListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | ProductGroupPromotionsListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region ProductGroupPromotionsUpdate
    /// <summary>
    /// Update product group promotions
    /// </summary>
   [<FunctionName("ProductGroupPromotionsUpdate")>]
    let ProductGroupPromotionsUpdate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/v5/ad_accounts/{ad_account_id}/product_group_promotions")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<ProductGroupPromotionsUpdateBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = ProductGroupPromotionsApiService.ProductGroupPromotionsUpdate bodyParams
      match result with
      | ProductGroupPromotionsUpdateStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | ProductGroupPromotionsUpdateDefaultStatusCode resolved ->
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

      let result = ProductGroupPromotionsApiService.ProductGroupsAnalytics ()
      match result with
      | ProductGroupsAnalyticsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | ProductGroupsAnalyticsStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | ProductGroupsAnalyticsDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

