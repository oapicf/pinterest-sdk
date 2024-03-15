namespace OpenAPI

open ProductGroupsApiHandlerParams
open ProductGroupsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ProductGroupsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region AdAccountsCatalogsProductGroupsList
    /// <summary>
    /// Get catalog product groups
    /// </summary>
   [<FunctionName("AdAccountsCatalogsProductGroupsList")>]
    let AdAccountsCatalogsProductGroupsList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/product_groups/catalogs")>]
        req:HttpRequest ) =

      let result = ProductGroupsApiService.AdAccountsCatalogsProductGroupsList ()
      match result with
      | AdAccountsCatalogsProductGroupsListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | AdAccountsCatalogsProductGroupsListStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | AdAccountsCatalogsProductGroupsListStatusCode401 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(401))
      | AdAccountsCatalogsProductGroupsListStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | AdAccountsCatalogsProductGroupsListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

