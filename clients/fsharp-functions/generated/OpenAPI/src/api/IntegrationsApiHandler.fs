namespace OpenAPI

open IntegrationsApiHandlerParams
open IntegrationsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module IntegrationsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region IntegrationsCommerceDel
    /// <summary>
    /// Delete commerce integration
    /// </summary>
   [<FunctionName("IntegrationsCommerceDel")>]
    let IntegrationsCommerceDel
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v5/integrations/commerce/{external_business_id}")>]
        req:HttpRequest ) =

      let result = IntegrationsApiService.IntegrationsCommerceDel ()
      match result with
      | IntegrationsCommerceDelStatusCode204 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(204))
      | IntegrationsCommerceDelDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region IntegrationsCommerceGet
    /// <summary>
    /// Get commerce integration
    /// </summary>
   [<FunctionName("IntegrationsCommerceGet")>]
    let IntegrationsCommerceGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/integrations/commerce/{external_business_id}")>]
        req:HttpRequest ) =

      let result = IntegrationsApiService.IntegrationsCommerceGet ()
      match result with
      | IntegrationsCommerceGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | IntegrationsCommerceGetStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | IntegrationsCommerceGetStatusCode409 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(409))
      | IntegrationsCommerceGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region IntegrationsCommercePatch
    /// <summary>
    /// Update commerce integration
    /// </summary>
   [<FunctionName("IntegrationsCommercePatch")>]
    let IntegrationsCommercePatch
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "PATCH", Route = "/v5/integrations/commerce/{external_business_id}")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<IntegrationsCommercePatchBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = IntegrationsApiService.IntegrationsCommercePatch bodyParams
      match result with
      | IntegrationsCommercePatchStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | IntegrationsCommercePatchStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | IntegrationsCommercePatchStatusCode409 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(409))
      | IntegrationsCommercePatchDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region IntegrationsCommercePost
    /// <summary>
    /// Create commerce integration
    /// </summary>
   [<FunctionName("IntegrationsCommercePost")>]
    let IntegrationsCommercePost
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/integrations/commerce")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<IntegrationsCommercePostBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = IntegrationsApiService.IntegrationsCommercePost bodyParams
      match result with
      | IntegrationsCommercePostStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | IntegrationsCommercePostStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | IntegrationsCommercePostStatusCode409 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(409))
      | IntegrationsCommercePostDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region IntegrationsGetById
    /// <summary>
    /// Get integration metadata
    /// </summary>
   [<FunctionName("IntegrationsGetById")>]
    let IntegrationsGetById
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/integrations/{id}")>]
        req:HttpRequest ) =

      let result = IntegrationsApiService.IntegrationsGetById ()
      match result with
      | IntegrationsGetByIdStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | IntegrationsGetByIdStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | IntegrationsGetByIdDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region IntegrationsGetList
    /// <summary>
    /// Get integration metadata list
    /// </summary>
   [<FunctionName("IntegrationsGetList")>]
    let IntegrationsGetList
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/integrations")>]
        req:HttpRequest ) =

      let result = IntegrationsApiService.IntegrationsGetList ()
      match result with
      | IntegrationsGetListStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | IntegrationsGetListDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region IntegrationsLogsPost
    /// <summary>
    /// Receives batched logs from integration applications.
    /// </summary>
   [<FunctionName("IntegrationsLogsPost")>]
    let IntegrationsLogsPost
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/integrations/logs")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<IntegrationsLogsPostBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = IntegrationsApiService.IntegrationsLogsPost bodyParams
      match result with
      | IntegrationsLogsPostStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | IntegrationsLogsPostStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | IntegrationsLogsPostDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

