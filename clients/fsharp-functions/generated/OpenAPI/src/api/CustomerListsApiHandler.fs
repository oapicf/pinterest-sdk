namespace OpenAPI

open CustomerListsApiHandlerParams
open CustomerListsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module CustomerListsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region CustomerListsCreate
    /// <summary>
    /// Create customer lists
    /// </summary>
   [<FunctionName("CustomerListsCreate")>]
    let CustomerListsCreate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/ad_accounts/{ad_account_id}/customer_lists")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CustomerListsCreateBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = CustomerListsApiService.CustomerListsCreate bodyParams
      match result with
      | CustomerListsCreateStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | CustomerListsCreateDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region CustomerListsGet
    /// <summary>
    /// Get customer list
    /// </summary>
   [<FunctionName("CustomerListsGet")>]
    let CustomerListsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}")>]
        req:HttpRequest ) =

      let result = CustomerListsApiService.CustomerListsGet ()
      match result with
      | CustomerListsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | CustomerListsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region CustomerListsList
    /// <summary>
    /// Get customer lists
    /// </summary>
   [<FunctionName("CustomerListsList")>]
    let CustomerListsList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/customer_lists")>]
        req:HttpRequest ) =

      let result = CustomerListsApiService.CustomerListsList ()
      match result with
      | CustomerListsListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | CustomerListsListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region CustomerListsUpdate
    /// <summary>
    /// Update customer list
    /// </summary>
   [<FunctionName("CustomerListsUpdate")>]
    let CustomerListsUpdate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<CustomerListsUpdateBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = CustomerListsApiService.CustomerListsUpdate bodyParams
      match result with
      | CustomerListsUpdateStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | CustomerListsUpdateDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

