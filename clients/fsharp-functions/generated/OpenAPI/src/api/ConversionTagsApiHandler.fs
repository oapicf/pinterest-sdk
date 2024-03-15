namespace OpenAPI

open ConversionTagsApiHandlerParams
open ConversionTagsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module ConversionTagsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region ConversionTagsCreate
    /// <summary>
    /// Create conversion tag
    /// </summary>
   [<FunctionName("ConversionTagsCreate")>]
    let ConversionTagsCreate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/ad_accounts/{ad_account_id}/conversion_tags")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<ConversionTagsCreateBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = ConversionTagsApiService.ConversionTagsCreate bodyParams
      match result with
      | ConversionTagsCreateStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | ConversionTagsCreateDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region ConversionTagsGet
    /// <summary>
    /// Get conversion tag
    /// </summary>
   [<FunctionName("ConversionTagsGet")>]
    let ConversionTagsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}")>]
        req:HttpRequest ) =

      let result = ConversionTagsApiService.ConversionTagsGet ()
      match result with
      | ConversionTagsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | ConversionTagsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region ConversionTagsList
    /// <summary>
    /// Get conversion tags
    /// </summary>
   [<FunctionName("ConversionTagsList")>]
    let ConversionTagsList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/conversion_tags")>]
        req:HttpRequest ) =

      let result = ConversionTagsApiService.ConversionTagsList ()
      match result with
      | ConversionTagsListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | ConversionTagsListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region OcpmEligibleConversionTagsGet
    /// <summary>
    /// Get Ocpm eligible conversion tags
    /// </summary>
   [<FunctionName("OcpmEligibleConversionTagsGet")>]
    let OcpmEligibleConversionTagsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible")>]
        req:HttpRequest ) =

      let result = ConversionTagsApiService.OcpmEligibleConversionTagsGet ()
      match result with
      | OcpmEligibleConversionTagsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | OcpmEligibleConversionTagsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PageVisitConversionTagsGet
    /// <summary>
    /// Get page visit conversion tags
    /// </summary>
   [<FunctionName("PageVisitConversionTagsGet")>]
    let PageVisitConversionTagsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/conversion_tags/page_visit")>]
        req:HttpRequest ) =

      let result = ConversionTagsApiService.PageVisitConversionTagsGet ()
      match result with
      | PageVisitConversionTagsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | PageVisitConversionTagsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

