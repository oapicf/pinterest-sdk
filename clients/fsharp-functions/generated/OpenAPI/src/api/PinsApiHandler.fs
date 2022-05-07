namespace OpenAPI

open PinsApiHandlerParams
open PinsApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module PinsApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region PinsAnalytics
    /// <summary>
    /// Get Pin analytics
    /// </summary>
   [<FunctionName("PinsAnalytics")>]
    let PinsAnalytics
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/pins/{pin_id}/analytics")>]
        req:HttpRequest ) =

      let result = PinsApiService.PinsAnalytics ()
      match result with
      | PinsAnalyticsStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | PinsAnalyticsStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | PinsAnalyticsStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | PinsAnalyticsDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PinsCreate
    /// <summary>
    /// Create Pin
    /// </summary>
   [<FunctionName("PinsCreate")>]
    let PinsCreate
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "POST", Route = "/v5/pins")>]
        req:HttpRequest ) =

      use reader = StreamReader(req.Body)

      let mediaTypes = ["application/json";] // currently unused

      let bind (contentType:string) body  =
        match (contentType.ToLower()) with
        | "application/json" ->
          body |> JsonConvert.DeserializeObject<PinsCreateBodyParams>
        | _ -> failwith (sprintf "TODO - ContentType %s not currently supported" contentType)

      let bodyParams = reader.ReadToEnd() |> bind req.ContentType
      let result = PinsApiService.PinsCreate bodyParams
      match result with
      | PinsCreateStatusCode201 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(201))
      | PinsCreateStatusCode400 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(400))
      | PinsCreateStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | PinsCreateStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | PinsCreateStatusCode429 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(429))
      | PinsCreateDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PinsDelete
    /// <summary>
    /// Delete Pin
    /// </summary>
   [<FunctionName("PinsDelete")>]
    let PinsDelete
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "DELETE", Route = "/v5/pins/{pin_id}")>]
        req:HttpRequest ) =

      let result = PinsApiService.PinsDelete ()
      match result with
      | PinsDeleteStatusCode204 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(204))
      | PinsDeleteStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | PinsDeleteStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | PinsDeleteDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

    //#region PinsGet
    /// <summary>
    /// Get Pin
    /// </summary>
   [<FunctionName("PinsGet")>]
    let PinsGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/pins/{pin_id}")>]
        req:HttpRequest ) =

      let result = PinsApiService.PinsGet ()
      match result with
      | PinsGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | PinsGetStatusCode403 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(403))
      | PinsGetStatusCode404 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(404))
      | PinsGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

