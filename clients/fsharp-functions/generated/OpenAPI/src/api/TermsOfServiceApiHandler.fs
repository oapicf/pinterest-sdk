namespace OpenAPI

open TermsOfServiceApiHandlerParams
open TermsOfServiceApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module TermsOfServiceApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region TermsOfServiceGet
    /// <summary>
    /// Get terms of service
    /// </summary>
   [<FunctionName("TermsOfServiceGet")>]
    let TermsOfServiceGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/v5/ad_accounts/{ad_account_id}/terms_of_service")>]
        req:HttpRequest ) =

      let result = TermsOfServiceApiService.TermsOfServiceGet ()
      match result with
      | TermsOfServiceGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))
      | TermsOfServiceGetDefaultStatusCode resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(0))

